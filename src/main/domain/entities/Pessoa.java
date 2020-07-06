package domain.entities;

import domain.enums.TipoDePessoa;

import java.time.LocalDate;
import java.time.Period;

public class Pessoa {
    Long id;
    String nome;
    TipoDePessoa tipo;
    LocalDate dataDeNascimento;

    public Long getId() {
        return id;
    }

    public Pessoa(Long id, String nome, TipoDePessoa tipo, String dataDeNascimento) {
        this.id = id;
        this.nome = nome;
        this.tipo = tipo;
        this.dataDeNascimento = LocalDate.parse(dataDeNascimento);
    }

    public Pessoa() {}

    public TipoDePessoa getTipo() {
        return tipo;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTipo(TipoDePessoa tipo) {
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
