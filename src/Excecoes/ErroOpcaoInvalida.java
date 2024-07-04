package Excecoes;

public class ErroOpcaoInvalida extends RuntimeException {
    private String mensagem;
    public ErroOpcaoInvalida(String mensagem) {
        this.mensagem = mensagem;
    }

    @Override
    public String getMessage() {
        return this.mensagem;
    }
}

