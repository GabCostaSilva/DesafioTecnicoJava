package domain.entities;

public class Renda {
    Long pessoaId;
    Double valor;

    public Renda(Long pessoaId, Double valor) {
        this.pessoaId = pessoaId;
        this.valor = valor;
    }

    public Double getValor() {
        return valor;
    }
}
