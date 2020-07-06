package unit.domain.utils;

import domain.entities.Familia;
import domain.entities.Pessoa;
import domain.entities.Renda;
import domain.enums.TipoDePessoa;
import domain.rules.PontosPorIdade;
import domain.rules.PontosPorQtdDependentes;
import domain.rules.PontosPorRenda;
import domain.rules.RegraDeCalculo;
import domain.utils.CalculadoraDePontos;
import org.junit.jupiter.api.Test;
import unit.domain.TestAbstract;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraDePontosTest extends TestAbstract {
    List<RegraDeCalculo> regras = new ArrayList<>();
    CalculadoraDePontos calculadoraDePontos;

    public CalculadoraDePontosTest() {
        this.regras.add(new PontosPorIdade());
        this.regras.add(new PontosPorQtdDependentes());
        this.regras.add(new PontosPorRenda());
        this.calculadoraDePontos = new CalculadoraDePontos(regras);
    }

    @Test
    public void deveCalcularPontosDeFamilia() {
        Familia familia = new Familia();
        List<Pessoa> pessoas = new ArrayList<>();
        List<Renda> rendas = new ArrayList<>();

        Pessoa p1 = this.pessoaFactory.create(30, TipoDePessoa.PRETENDENTE);
        Pessoa p2 = this.pessoaFactory.create(10, TipoDePessoa.CONJUGE);
        Pessoa p3 = this.pessoaFactory.create(40, TipoDePessoa.DEPENDENTE);

        Renda r1 = new Renda(p1.getId(), 2000.00);
        Renda r2 = new Renda(p2.getId(), 2000.00);

        pessoas.add(p1);
        pessoas.add(p2);
        pessoas.add(p3);

        rendas.add(r1);
        rendas.add(r2);

        familia.setId(this.faker.number().randomNumber());
        familia.setPessoas(pessoas);
        familia.setRendas(rendas);
        familia.setStatus(0);

        int pontuacao = this.calculadoraDePontos.calculaPontuacao(familia);

        assertEquals(10, pontuacao);
    }
}