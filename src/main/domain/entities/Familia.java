package domain.entities;

import domain.enums.TipoDePessoa;

import java.util.List;

public class Familia {
    Long id;
    List<Renda> rendas;
    List<Pessoa> pessoas;
    int status;
    int pontuacao;

    public Familia(Long id, List<Pessoa> pessoas, List<Renda> rendas, int status) {
        this.id = id;
        this.pessoas = pessoas;
        this.rendas = rendas;
        this.status = status;
    }
    public Familia(){

    }
    public double getRendaTotal() {
        return this.rendas.stream()
                .map(Renda::getValor)
                .reduce(0.0, Double::sum);
    }

    public Pessoa getPretendente() {
        return (Pessoa) this.pessoas.stream()
                .filter(pessoa -> TipoDePessoa.PRETENDENTE.equals(pessoa.getTipo()));
    }

    public int countDependentes() {
        return (int) this.pessoas.stream()
                .filter(pessoa -> pessoa.getIdade() <= 18 && TipoDePessoa.DEPENDENTE.equals(pessoa.getTipo()))
                .count();
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setPessoas(List<Pessoa> pessoas) {
        this.pessoas = pessoas;
    }

    public void setRendas(List<Renda> rendas) {
        this.rendas = rendas;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }

    public int getPontuacao() {
        return pontuacao;
    }
}
