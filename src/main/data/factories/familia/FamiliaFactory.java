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
    private List<Pessoa> pessoas;
    private List<Renda> rendas;
    private PessoaFactory pessoaFactory;

    public FamiliaFactory() {
        super();

        this.pessoaFactory = new PessoaFactory();
    }

    public Familia create(UUID id, List<Pessoa> pessoas, List<Renda> rendas, int status) {
        return new Familia(id, pessoas, rendas, status);
    }

    public Familia createFamiliaValidaPorRenda(double rendaTotal) {
        this.rendas = new ArrayList<>();
        this.pessoas = new ArrayList<>();
        Pessoa pretendente = this.pessoaFactory.create(30, EnumTipoDePessoa.PRETENDENTE);
        Pessoa conjuge = this.pessoaFactory.create(30, EnumTipoDePessoa.CONJUGE);

        Renda r1 = new Renda(pretendente.getId(), rendaTotal / 2);
        Renda r2 = new Renda(conjuge.getId(), rendaTotal / 2);

        pessoas.add(pretendente);
        pessoas.add(conjuge);
        rendas.add(r1);
        rendas.add(r2);

        return new Familia(UUID.randomUUID(), pessoas, rendas, 0);
    }

    public Familia createFamiliaValidaCom3Dependentes(int idadePretendente) {
        this.rendas = new ArrayList<>();
        this.pessoas = new ArrayList<>();
        Pessoa pretendente = this.pessoaFactory.create(idadePretendente, EnumTipoDePessoa.PRETENDENTE);

        Pessoa d1 = this.pessoaFactory.create(10, EnumTipoDePessoa.DEPENDENTE);
        Pessoa d2 = this.pessoaFactory.create(12, EnumTipoDePessoa.DEPENDENTE);

        Renda r1 = new Renda(pretendente.getId(), 3000.00);

        pessoas.add(pretendente);
        pessoas.add(d1);
        pessoas.add(d2);
        rendas.add(r1);

        return new Familia(UUID.randomUUID(), pessoas, rendas, 0);
    }

    public Familia createFamiliaValidaCom1Dependente() {
        this.rendas = new ArrayList<>();
        this.pessoas = new ArrayList<>();
        Pessoa pretendente = this.pessoaFactory.create(30, EnumTipoDePessoa.PRETENDENTE);
        Pessoa d1 = this.pessoaFactory.create(10, EnumTipoDePessoa.DEPENDENTE);
        Renda r1 = new Renda(pretendente.getId(), 3000.00);

        pessoas.add(pretendente);
        pessoas.add(d1);
        rendas.add(r1);

        return new Familia(UUID.randomUUID(), pessoas, rendas, 0);
    }
    public Familia createFamiliaValidaPorIdadePretendente(int idade) {
        this.rendas = new ArrayList<>();
        this.pessoas = new ArrayList<>();
        Pessoa pretendente = this.pessoaFactory.create(idade, EnumTipoDePessoa.PRETENDENTE);
        Renda r1 = new Renda(pretendente.getId(), 3000.00);

        pessoas.add(pretendente);
        rendas.add(r1);

        return new Familia(UUID.randomUUID(), pessoas, rendas, 0);
    }

}
