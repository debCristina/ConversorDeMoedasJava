package Modelos;

import Excecoes.ErroResponseNulo;
import com.google.gson.Gson;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ColetorTaxaCambio {
    private String apiKey = System.getenv("EXCHANGE_RATE_API_KEY");

    public ColetorTaxaCambio () {
        if (this.apiKey == null || this.apiKey.isEmpty()) {
            throw new IllegalArgumentException("Chave API não configurada nas variáveis de ambiente.");
        }
    }

    public DadosTaxaCambio coletarTaxas (String moedaOrigem, String moedaDestino) throws IOException {
        String responseBody = null;
        try {
            String url_str = "https://v6.exchangerate-api.com/v6/" +apiKey+ "/pair/" +moedaOrigem+"/"+moedaDestino;

            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(url_str))
                    .build();

            HttpResponse<String> response = HttpClient.newHttpClient()
                    .send(request, HttpResponse.BodyHandlers.ofString());
            responseBody = response.body();

        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        } catch (Exception e){
            throw new RuntimeException("Ops! Paarece que ocorreu algum erro");
        }

        if (responseBody != null) {
            return new Gson().fromJson(responseBody, DadosTaxaCambio.class);
        } else {
            throw new ErroResponseNulo("Resposta da API de taxa de câmbio está vazia.");
        }

    }
}
