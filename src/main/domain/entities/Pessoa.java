package domain.entities;

import domain.enums.EnumTipoDePessoa;

import java.time.LocalDate;
import java.time.Period;
import java.util.UUID;

public class Pessoa extends AbstractEntity{
    UUID id;
    String nome;
    EnumTipoDePessoa tipo;
    LocalDate dataDeNascimento;

    public UUID getId() {
        return id;
    }

    public Pessoa(UUID id, String nome, EnumTipoDePessoa tipo, String dataDeNascimento) {
        this.id = id;
        this.nome = nome;
        this.tipo = tipo;
        this.dataDeNascimento = LocalDate.parse(dataDeNascimento);
    }

    public Pessoa() {}

    public EnumTipoDePessoa getTipo() {
        return tipo;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTipo(EnumTipoDePessoa tipo) {
        this.tipo = tipo;
    }

    public void setDataDeNascimento(LocalDate dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public void setDataDeNascimento(String dataDeNascimento) {
        this.dataDeNascimento = LocalDate.parse(dataDeNascimento);
    }

    public int getIdade() {
        return Period.between(this.dataDeNascimento, LocalDate.now()).getYears();
    }
}
