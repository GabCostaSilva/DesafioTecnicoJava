package unit.domain.familySelection;

import domain.entities.Familia;
import domain.familySelection.calculations.AvaliadorDeCriterios;
import domain.familySelection.criteriaProcessors.ProcessadorDeCriterios;
import domain.familySelection.criteriaProcessors.ProcessadorDependentes;
import domain.familySelection.criteriaProcessors.ProcessadorIdadeDoPretendente;
import domain.familySelection.criteriaProcessors.ProcessadorRendaTotal;
import org.junit.jupiter.api.Test;
import unit.domain.TestAbstract;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

    public class AvaliadorDeCriteriosTest extends TestAbstract {
        AvaliadorDeCriterios avaliadorDeCriterios;
        public AvaliadorDeCriteriosTest(){
            super();
            Familia familia = familiaFactory.createFamiliaValidaCom3Dependentes(30);
            ProcessadorDeCriterios processadorDeCriterioDeRenda = new ProcessadorRendaTotal(familia);
            ProcessadorDeCriterios processadorIdadeDoPretendente = new ProcessadorIdadeDoPretendente(familia);
            ProcessadorDeCriterios processadorDependentes = new ProcessadorDependentes(familia);

            List<ProcessadorDeCriterios> processadores = new ArrayList<>();

            processadores.add(processadorDeCriterioDeRenda);
            processadores.add(processadorIdadeDoPretendente);
            processadores.add(processadorDependentes);

            avaliadorDeCriterios = new AvaliadorDeCriterios(processadores);
        }

        @Test
        void deveCalcularPontosDeFamilia(){
            assertEquals(4, avaliadorDeCriterios.calcularPontos());
        }

        @Test
        void deveRetornarCriteriosAtingidos() {
            assertEquals(2, avaliadorDeCriterios.getCriteriosAtendidos());
        }
}
