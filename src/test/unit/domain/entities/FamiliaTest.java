package unit.domain.entities;

import domain.entities.Familia;
import domain.entities.Pessoa;
import domain.entities.Renda;
import domain.enums.TipoDePessoa;
import org.junit.jupiter.api.Test;
import unit.domain.TestAbstract;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class FamiliaTest extends TestAbstract {

    @Test
    void shouldCountZeroDependentes() {
        ArrayList<Pessoa> pessoas = new ArrayList<>();
        ArrayList<Renda> rendas = new ArrayList<>();
        Pessoa p1 = this.pessoaFactory.create(25, TipoDePessoa.DEPENDENTE);

        pessoas.add(p1);
        Familia f1 = new Familia((long) 2, pessoas, rendas, 2);

        assertEquals(0, f1.countDependentes());
    }

    @Test
    void shouldReturnRendaTotal() {
        ArrayList<Pessoa> pessoas = new ArrayList<>();
        ArrayList<Renda> rendas = new ArrayList<>();

        Pessoa p1 = new Pessoa((long) 1, "Douglas", TipoDePessoa.DEPENDENTE, "1994-07-14");
        pessoas.add(p1);
        rendas.add(new Renda(p1.getId(), 1000.00));

        Pessoa p2 = new Pessoa((long) 2, "Maria", TipoDePessoa.PRETENDENTE, "1944-07-14");
        pessoas.add(p2);
        rendas.add(new Renda(p2.getId(), 5000.00));

        Familia f1 = new Familia((long) 11, pessoas, rendas, 0);

        assertEquals(6000, f1.getRendaTotal());
    }
}