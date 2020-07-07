package domain.familySelection.criteriaProcessors;

import domain.criterias.CriterioDeAvaliacao;
import domain.entities.Familia;

import java.util.List;
import java.util.stream.Collectors;

public abstract class ProcessadorDeCriteriosAbstract implements ProcessadorDeCriterios{
    protected List<CriterioDeAvaliacao> criterios;
    Familia familia;

    public ProcessadorDeCriteriosAbstract(Familia familia) {
        this.familia = familia;
    }

    public CriterioDeAvaliacao getCriterioAceito() {
        return this.criterios
                .stream()
                .filter(criterio -> criterio.ehAceito())
                .collect(Collectors.toList())
                .get(0);
    }

}
