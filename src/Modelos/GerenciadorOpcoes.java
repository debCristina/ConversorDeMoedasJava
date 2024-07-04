package Modelos;

import Excecoes.ErroOpcaoInvalida;
import Excecoes.ErroResponseNulo;

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
        try{
            switch (opcaoUsuario) {
                case 1:
                    dadosTaxaCambio = coletorTaxaCambio.coletarTaxas("USD", "ARS");
                    break;
                case 2:
                    dadosTaxaCambio = coletorTaxaCambio.coletarTaxas("ARS", "USD");
                    break;
                case 3:
                    dadosTaxaCambio = coletorTaxaCambio.coletarTaxas("USD", "BRL");
                    break;
                case 4:
                    dadosTaxaCambio = coletorTaxaCambio.coletarTaxas("BRL", "USD");
                    break;
                case 5:
                    dadosTaxaCambio = coletorTaxaCambio.coletarTaxas("USD", "COP");
                    break;
                case 6:
                    dadosTaxaCambio = coletorTaxaCambio.coletarTaxas("COP", "USD");
                    break;
                default:
                    throw new ErroOpcaoInvalida("Erro: Parece que houve um erro ao processar a opção escolhida");

            }

            conversao.converte(valorConversao, dadosTaxaCambio.conversion_rate());
            return "Valor: " + valorConversao + " " + dadosTaxaCambio.base_code() + " = " + conversao.getResultado() + " " + dadosTaxaCambio.target_code();
        }catch (IOException e) {
            return  "Erro de E/S ao processar a operação. " + e.getMessage();
        } catch (ErroResponseNulo e) {
            return e.getMessage();
        } catch (RuntimeException e) {
            return  "Erro inesperado ao processar a operação. " + e.getMessage();
        }
    }
}