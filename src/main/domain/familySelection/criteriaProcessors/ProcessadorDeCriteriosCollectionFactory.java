package domain.familySelection.criteriaProcessors;

import domain.entities.Familia;

import java.util.ArrayList;
import java.util.List;

public class ProcessadorDeCriteriosCollectionFactory implements IProcessadorDeCriteriosCollectionsFactory {
    public List<ProcessadorDeCriterios> create(Familia familia) {
        List<ProcessadorDeCriterios> processadores = new ArrayList<>();

        processadores.add(new ProcessadorCriterioDeDependentes(familia));
        processadores.add(new ProcessadorIdadeDoPretendente(familia));
        processadores.add(new ProcessadorRendaTotal(familia));

        return processadores;
    }
}
