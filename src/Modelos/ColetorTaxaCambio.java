package Modelos;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ColetorTaxaCambio {

    public DadosTaxaCambio fetchExchangeRate (String moedaOrigem, String moedaDestino) throws IOException {
        String url_str = "https://v6.exchangerate-api.com/v6/ccb7dd7cce31744fc85333f8/pair/" +moedaOrigem+"/"+moedaDestino;

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url_str))
                .build();

        try {
            HttpResponse<String> response = HttpClient.newHttpClient()
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), DadosTaxaCambio.class);
        } catch (Exception e) {
            throw new RuntimeException("Ops! Parece que ocorreu algum erro");
        }
    }
}
