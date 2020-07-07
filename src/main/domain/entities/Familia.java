package domain.entities;

import domain.enums.EnumTipoDePessoa;

import java.util.Comparator;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

public class Familia extends AbstractEntity implements Comparable<Familia> {
    private UUID id;
    private List<Renda> rendas;
    private List<Pessoa> pessoas;
    private int status;
    private int pontuacao;
    private int criteriosAtendidos;

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

    public void addPessoa(Pessoa pessoa){
        this.pessoas.add(pessoa);
    }

    @Override
    public int compareTo(Familia familia) {
        if(this.getPontuacao() > familia.getPontuacao()) {
            return 1;
        } else if(this.getPontuacao() < familia.getPontuacao()) {
            return 0;
        }
        return -1;
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

    public void setCriteriosAtendidos(int criteriosAtendidos) {
        this.criteriosAtendidos = criteriosAtendidos;
    }
    public int getStatus() {
        return status;
    }
    @Override
    public UUID getId() {
        return id;
    }

    public List<Renda> getRendas() {
        return rendas;
    }

    public List<Pessoa> getPessoas() {
        return pessoas;
    }

    public int getCriteriosAtendidos() {
        return criteriosAtendidos;
    }
}
