package unit.domain.criterias;

import domain.criterias.CriterioDeAvaliacao;
import domain.criterias.criteriosIdadeDoPretendente.CriterioIdadeDoPretendenteAbaixoDe30;
import domain.criterias.criteriosIdadeDoPretendente.CriterioIdadeDoPretendenteDe30A44;
import domain.criterias.criteriosIdadeDoPretendente.CriterioIdadeDoPretendenteMaiorOuIgualA45Anos;
import domain.criterias.criteriosRendaFamiliarTotal.CriterioRendaFamiliarTotalAte900;
import domain.enums.EnumPontuacao;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import unit.domain.TestAbstract;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;

public class CriteriosIdadeDoPretendenteTest extends TestAbstract {

    CriterioDeAvaliacao idadeAbaixo30 = mock(CriterioIdadeDoPretendenteAbaixoDe30.class);
    CriterioDeAvaliacao idadeEntre30E44 = mock(CriterioIdadeDoPretendenteDe30A44.class);
    CriterioDeAvaliacao idadeMaiorOuIgualA45 = mock(CriterioIdadeDoPretendenteMaiorOuIgualA45Anos.class);

    @Test
    public void deveRetornarQueFamiliaAtendeCriterios() {
        assertTrue(new CriterioIdadeDoPretendenteAbaixoDe30(29).ehAtendido());
        assertTrue(new CriterioIdadeDoPretendenteDe30A44(30).ehAtendido());
        assertTrue(new CriterioIdadeDoPretendenteMaiorOuIgualA45Anos(45).ehAtendido());
    }

    @Test
    public void deveRetornarPontuacaoPorCriterio(){
        Mockito.when(idadeAbaixo30.getPontuacao()).thenReturn(EnumPontuacao.UM);
        assertEquals(1, idadeAbaixo30.getPontuacao().getValor());

        Mockito.when(idadeEntre30E44.getPontuacao()).thenReturn(EnumPontuacao.DOIS);
        assertEquals(2, idadeEntre30E44.getPontuacao().getValor());

        Mockito.when(idadeMaiorOuIgualA45.getPontuacao()).thenReturn(EnumPontuacao.TRES);
        assertEquals(3, idadeMaiorOuIgualA45.getPontuacao().getValor());
    }
}
