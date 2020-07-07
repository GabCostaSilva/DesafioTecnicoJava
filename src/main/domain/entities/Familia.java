package domain.entities;

import domain.enums.EnumTipoDePessoa;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

public class Familia extends AbstractEntity{
    UUID id;
    List<Renda> rendas;
    List<Pessoa> pessoas;
    int status;
    int pontuacao;

    public Familia(UUID id, List<Pessoa> pessoas, List<Renda> rendas, int status) {
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
        return this.pessoas.stream()
                .filter(pessoa -> EnumTipoDePessoa.PRETENDENTE == pessoa.getTipo())
                .collect(Collectors.toList())
                .get(0);
    }

    public int countDependentes() {
        return (int) this.pessoas.stream()
                .filter(pessoa -> pessoa.getIdade() <= 18 &&
                        EnumTipoDePessoa.DEPENDENTE.equals(pessoa.getTipo()))
                .count();
    }

    public void setId(UUID id) {
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
