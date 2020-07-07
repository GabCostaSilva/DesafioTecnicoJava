package domain.enums;

public enum EnumPontuacao {
    ZERO(0), UM(1), DOIS(2), TRES(3), CINCO(5);

    private final int pontuacao;

    EnumPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }

    public int getValor() {
        return pontuacao;
    }
}
