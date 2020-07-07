package unit.domain.criterias;

import domain.criterias.CriterioDeAvaliacao;
import domain.criterias.criteriosNumDependentes.CriterioFamiliaCom1ou2Dependentes;
import domain.criterias.criteriosNumDependentes.CriterioFamiliaCom3OuMaisDependentes;
import domain.enums.EnumPontuacao;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import unit.domain.TestAbstract;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;

public class CriteriosDependentesTest extends TestAbstract {
    @Test
    void deveValidarFamiliaPorDependentes(){
        assertTrue(new CriterioFamiliaCom3OuMaisDependentes(3).ehAtendido());
        assertTrue(new CriterioFamiliaCom1ou2Dependentes(2).ehAtendido());
    }
    CriterioDeAvaliacao criterio1Ou2 = mock(CriterioFamiliaCom1ou2Dependentes.class);

    CriterioDeAvaliacao criterio3OuMais = mock(CriterioFamiliaCom3OuMaisDependentes.class);

    @Test void deveRetornarPontuacaoCorreta(){
        Mockito.when(criterio1Ou2.getPontuacao()).thenReturn(EnumPontuacao.DOIS);
        assertEquals(2, criterio1Ou2.getPontuacao().getValor());

        Mockito.when(criterio3OuMais.getPontuacao()).thenReturn(EnumPontuacao.TRES);
        assertEquals(3, criterio3OuMais.getPontuacao().getValor());
    }
}
