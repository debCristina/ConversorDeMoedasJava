package Modelos;

import Excecoes.ErroOpcaoInvalida;

import java.io.IOException;

public class GerenciadorOpcoes {
    DadosTaxaCambio dadosTaxaCambio = null;
    ColetorTaxaCambio coletorTaxaCambio = new ColetorTaxaCambio();

    Conversao conversao = new Conversao();

    private int opcaoUsuario;
    private double valorConversao;

    public int getOpcaoUsuario() {
        return opcaoUsuario;
    }

    public void setOpcaoUsuario(int opcaoUsuario) {
        this.opcaoUsuario = opcaoUsuario;
    }

    public double getValorConversao() {
        return valorConversao;
    }

    public void setValorConversao(double valorConversao) {
        this.valorConversao = valorConversao;
    }

    public String processarOpcaoUsuario() throws IOException {

        switch (opcaoUsuario) {
            case 1:
                dadosTaxaCambio = coletorTaxaCambio.fetchExchangeRate("USD", "ARS");
                break;
            case 2:
                dadosTaxaCambio = coletorTaxaCambio.fetchExchangeRate("ARS", "USD");
                break;
            case 3:
                dadosTaxaCambio = coletorTaxaCambio.fetchExchangeRate("USD", "BRL");
                break;
            case 4:
                dadosTaxaCambio = coletorTaxaCambio.fetchExchangeRate("BRL", "USD");
                break;
            case 5:
                dadosTaxaCambio = coletorTaxaCambio.fetchExchangeRate("USD", "COP");
                break;
            case 6:
                dadosTaxaCambio = coletorTaxaCambio.fetchExchangeRate("COP", "USD");
                break;
            default:
                throw new ErroOpcaoInvalida("Erro: Parece que houve um erro ao processar a opção escolhida");

        }

        conversao.converte(valorConversao, dadosTaxaCambio.conversion_rate());
        return "Valor: " + valorConversao + " " + dadosTaxaCambio.base_code() + " = " + conversao.getResultado() + " " + dadosTaxaCambio.target_code();
    }
}