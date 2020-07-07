package domain.familySelection.calculations;

import domain.criterias.CriterioDeAvaliacao;
import domain.familySelection.criteriaProcessors.ProcessadorDeCriterios;

import java.util.List;
import java.util.stream.Collectors;

public class AvaliadorDeCriterios implements IAvaliadorDeCriterios {
    List<ProcessadorDeCriterios> processadoresDeCriterios;

    public AvaliadorDeCriterios(List<ProcessadorDeCriterios> processadoresDeCriterios) {
        this.processadoresDeCriterios = processadoresDeCriterios;
    }

    @Override
    public int calcularPontos() {
        return this.processadoresDeCriterios
                .stream()
                .mapToInt(processadorDeCriterios ->
                        processadorDeCriterios
                                .getCriterioAceito()
                                .getPontuacao()
                                .getValor())
                .sum();

    }

    @Override
    public List<CriterioDeAvaliacao> getCriteriosAceitos() {
        return this.processadoresDeCriterios
                .stream()
                .map(ProcessadorDeCriterios::getCriterioAceito)
                .collect(Collectors.toList());
    }
}
