package Modelos;

public class Conversao {
    private double resultado;

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

    public double converte (double valorMoedaBase, double cotacaoMoedaTarget) {
        this.resultado =  valorMoedaBase * cotacaoMoedaTarget;
        return this.resultado;
    }
}
