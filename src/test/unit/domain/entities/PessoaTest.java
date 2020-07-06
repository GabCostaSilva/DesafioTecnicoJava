package unit.domain.entities;

import domain.entities.Pessoa;
import domain.enums.TipoDePessoa;
import org.junit.jupiter.api.Test;
import unit.domain.TestAbstract;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PessoaTest extends TestAbstract {
    @Test
    void shouldGetIdadeDePessoa() {
//        Pessoa p1 = new Pessoa((long)1, "Joao da Costa", "PRETENDENTE", "2000-07-03");
        Pessoa p1 = this.pessoaFactory.create(20, TipoDePessoa.PRETENDENTE);
        assertEquals(20, p1.getIdade());
    }
}