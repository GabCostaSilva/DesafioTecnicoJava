package domain.entities;

import java.util.UUID;

public class Renda extends AbstractEntity{
    UUID pessoaId;
    Double valor;

    public Renda(UUID pessoaId, Double valor) {
        this.pessoaId = pessoaId;
        this.valor = valor;
    }

    public Double getValor() {
        return valor;
    }
}
