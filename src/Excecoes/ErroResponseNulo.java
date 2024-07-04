package Excecoes;

public class ErroResponseNulo extends RuntimeException {
    private String mensagem;
    public ErroResponseNulo(String mensagem) {
        this.mensagem = mensagem;
    }

    @Override
    public String getMessage() {
        return this.mensagem;
    }
}
