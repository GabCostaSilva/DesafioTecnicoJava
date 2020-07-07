package unit.domain.familySelection;

import domain.criterias.criteriosNumDependentes.CriterioFamiliaCom3OuMaisDependentes;
import domain.criterias.criteriosRendaFamiliarTotal.CriterioRendaFamiliarTotalAte900;
import domain.entities.Familia;
import domain.familySelection.criteriaProcessors.ProcessadorDependentes;
import domain.familySelection.criteriaProcessors.ProcessadorDeCriterios;
import domain.familySelection.criteriaProcessors.ProcessadorIdadeDoPretendente;
import domain.familySelection.criteriaProcessors.ProcessadorRendaTotal;
import org.junit.jupiter.api.Test;
import unit.domain.TestAbstract;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;

public class ProcessadorDeCriteriosTest extends TestAbstract {
    Familia familia = familiaFactory.createFamiliaValidaCom3Dependentes(30);
    ProcessadorDeCriterios processadorDeCriterioDeRenda = new ProcessadorRendaTotal(familia);
    ProcessadorDeCriterios processadorIdadeDoPretendente = new ProcessadorIdadeDoPretendente(familia);
    ProcessadorDeCriterios processadorDependentes = new ProcessadorDependentes(familia);

    @Test
    void deveObterCriteriosAtendidosPorFamilia(){
        assertNull(processadorDeCriterioDeRenda.getCriterioAtendido());
        assertTrue(processadorIdadeDoPretendente.getCriterioAtendido().ehAtendido());
        assertTrue(processadorDependentes.getCriterioAtendido().ehAtendido());
    }
}
