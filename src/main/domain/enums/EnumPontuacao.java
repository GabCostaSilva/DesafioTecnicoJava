package domain.enums;

public enum Pontuacao {
    ZERO(0), UM(1), DOIS(2), TRES(3), CINCO(5);

    private final int pontuacao;

    Pontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }

    public int getPontuacao() {
        return pontuacao;
    }
}
