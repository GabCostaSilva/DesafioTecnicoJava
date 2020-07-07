package unit.domain.entities;

import domain.entities.Pessoa;
import domain.enums.EnumTipoDePessoa;
import org.junit.jupiter.api.Test;
import unit.domain.TestAbstract;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PessoaTest extends TestAbstract {
    @Test
    void shouldGetIdadeDePessoa() {
        Pessoa p1 = this.pessoaFactory.create(20, EnumTipoDePessoa.PRETENDENTE);
        assertEquals(20, p1.getIdade());
    }
}