package domain.familySelection.criteriaProcessors;

import domain.criterias.CriterioDeAvaliacao;
import domain.entities.Familia;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public abstract class ProcessadorDeCriteriosAbstract implements ProcessadorDeCriterios{
    protected List<CriterioDeAvaliacao> criterios;
    Familia familia;

    public ProcessadorDeCriteriosAbstract(Familia familia) {
        this.familia = familia;
        criterios = new ArrayList<>();
    }

    public CriterioDeAvaliacao getCriterioAtendido() {
        List<CriterioDeAvaliacao> result = this.criterios
                .stream()
                .filter(Objects::nonNull)
                .filter(criterio -> criterio.ehAtendido())
                .collect(Collectors.toList());

        return result.isEmpty() ? null : result.get(0);
    }

}
