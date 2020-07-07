package unit.domain.entities;

import domain.entities.Familia;
import domain.entities.Pessoa;
import domain.entities.Renda;
import domain.enums.EnumTipoDePessoa;
import org.junit.jupiter.api.Test;
import unit.domain.TestAbstract;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

class FamiliaTest extends TestAbstract {

    @Test
    void shouldCountZeroDependentes() {
        ArrayList<Pessoa> pessoas = new ArrayList<>();
        ArrayList<Renda> rendas = new ArrayList<>();

        Pessoa dependenteForaDaRegra = this.pessoaFactory.create(25, EnumTipoDePessoa.DEPENDENTE);

        pessoas.add(dependenteForaDaRegra);
        Familia f1 = new Familia(UUID.randomUUID(), pessoas, rendas, 2);

        assertEquals(0, f1.countDependentes());
    }

    @Test
    void shouldReturnRendaTotal() {
        ArrayList<Pessoa> pessoas = new ArrayList<>();
        ArrayList<Renda> rendas = new ArrayList<>();

        Pessoa dependente = this.pessoaFactory.create(15, EnumTipoDePessoa.DEPENDENTE);
        Pessoa pretendente = this.pessoaFactory.create(45, EnumTipoDePessoa.PRETENDENTE);

        pessoas.add(dependente);
        pessoas.add(pretendente);

        rendas.add(new Renda(dependente.getId(), 1000.00));
        rendas.add(new Renda(pretendente.getId(), 5000.00));

        Familia f1 = new Familia(UUID.randomUUID(), pessoas, rendas, 0);

        assertEquals(6000, f1.getRendaTotal());
    }

    @Test
    void shouldGetPretendente() {
        Pessoa pretendente = this.pessoaFactory.create(45, EnumTipoDePessoa.PRETENDENTE);

        List<Pessoa> pessoas = new ArrayList<>();
        List<Renda> rendas = new ArrayList<>();

        pessoas.add(pretendente);

        Familia familia = new Familia(UUID.randomUUID(), pessoas, rendas, 0);

        assertEquals(pretendente, familia.getPretendente());
    }
}