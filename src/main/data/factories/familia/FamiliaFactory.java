package data.factories.familia;

import data.factories.AbstractFactory;
import data.factories.PessoaFactory;
import domain.entities.Familia;
import domain.entities.Pessoa;
import domain.entities.Renda;
import domain.enums.EnumTipoDePessoa;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class FamiliaFactory extends AbstractFactory {
    private PessoaFactory pessoaFactory;
    private List<Pessoa> pessoas;
    private List<Renda> rendas = new ArrayList<>();
    public FamiliaFactory() {
        super();
        PessoaFactory pessoaFactory = new PessoaFactory();
    }
    public Familia create(UUID id, List<Pessoa> pessoas, List<Renda> rendas, int status) {
        return new Familia(id, pessoas, rendas, status);
    }

    public Familia createFamiliaRendaAte900() {
        this.rendas = new ArrayList<>();
        this.pessoas = new ArrayList<>();

        Pessoa pretendente = this.pessoaFactory.create(30, EnumTipoDePessoa.PRETENDENTE);
        Pessoa conjuge = this.pessoaFactory.create(30, EnumTipoDePessoa.CONJUGE);
        Renda r1 = new Renda(pretendente.getId(), 800.00);
        Renda r2 = new Renda(conjuge.getId(), 0.00);

        pessoas.add(pretendente);
        pessoas.add(conjuge);
        rendas.add(r1);
        rendas.add(r2);

        return new Familia(UUID.randomUUID(), pessoas, rendas, 0);
    }
    public Familia createFamiliaRendaEntre901E1500() {
        this.rendas = new ArrayList<>();
        this.pessoas = new ArrayList<>();

        Pessoa pretendente = this.pessoaFactory.create(30, EnumTipoDePessoa.PRETENDENTE);
        Pessoa conjuge = this.pessoaFactory.create(30, EnumTipoDePessoa.CONJUGE);
        Renda r1 = new Renda(pretendente.getId(), 800.00);
        Renda r2 = new Renda(conjuge.getId(), 200.00);

        pessoas.add(pretendente);
        pessoas.add(conjuge);
        rendas.add(r1);
        rendas.add(r2);

        return new Familia(UUID.randomUUID(), pessoas, rendas, 0);
    }
    public Familia createFamiliaRendaEntre1501E2000() {
        this.rendas = new ArrayList<>();
        this.pessoas = new ArrayList<>();

        Pessoa pretendente = this.pessoaFactory.create(30, EnumTipoDePessoa.PRETENDENTE);
        Pessoa conjuge = this.pessoaFactory.create(30, EnumTipoDePessoa.CONJUGE);
        Renda r1 = new Renda(pretendente.getId(), 800.00);
        Renda r2 = new Renda(conjuge.getId(), 1000.00);

        pessoas.add(pretendente);
        pessoas.add(conjuge);
        rendas.add(r1);
        rendas.add(r2);

        return new Familia(UUID.randomUUID(), pessoas, rendas, 0);
    }
}
