package unit.domain.criterias;

import domain.criterias.CriterioDeAvaliacao;
import domain.criterias.criteriosIdadeDoPretendente.CriterioIdadeDoPretendenteDe30A44;
import domain.criterias.criteriosIdadeDoPretendente.CriterioIdadeDoPretendenteMaiorOuIgualA45Anos;
import domain.criterias.criteriosRendaFamiliarTotal.CriterioRendaFamiliarTotalAte900;
import domain.criterias.criteriosRendaFamiliarTotal.CriterioRendaFamiliarTotalEntre1501E2000;
import domain.criterias.criteriosRendaFamiliarTotal.CriterioRendaFamiliarTotalEntre901E1500;
import domain.enums.EnumPontuacao;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import unit.domain.TestAbstract;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;

public class CriteriosRendaTest extends TestAbstract {
    @Test
    void deveValidarFamiliaPorRenda(){
        assertTrue(new CriterioRendaFamiliarTotalAte900(900).ehAtendido());
        assertTrue(new CriterioRendaFamiliarTotalEntre901E1500(901).ehAtendido());
        assertTrue(new CriterioRendaFamiliarTotalEntre1501E2000(1051).ehAtendido());
    }
    CriterioDeAvaliacao rendaAte900 = mock(CriterioRendaFamiliarTotalAte900.class);
    CriterioDeAvaliacao rendaEntre901e1500 = mock(CriterioRendaFamiliarTotalEntre901E1500.class);
    CriterioDeAvaliacao renda1501e2000 = mock(CriterioRendaFamiliarTotalEntre1501E2000.class);

    @Test
    void deveRetornarPontuacaoCorreta(){
            Mockito.when(rendaAte900.getPontuacao()).thenReturn(EnumPontuacao.CINCO);
            assertEquals(5, rendaAte900.getPontuacao().getValor());

            Mockito.when(rendaEntre901e1500.getPontuacao()).thenReturn(EnumPontuacao.TRES);
            assertEquals(3, rendaEntre901e1500.getPontuacao().getValor());

            Mockito.when(renda1501e2000.getPontuacao()).thenReturn(EnumPontuacao.UM);
            assertEquals(1, renda1501e2000.getPontuacao().getValor());
    }
}
