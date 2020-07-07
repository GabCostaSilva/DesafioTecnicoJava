package domain.familySelection.calculations;

import domain.familySelection.criteriaProcessors.ProcessadorDeCriterios;

import java.util.List;

public class AvaliadorDeCriterios implements IAvaliadorDeCriterios {
    List<ProcessadorDeCriterios> processadoresDeCriterios;

    public AvaliadorDeCriterios(List<ProcessadorDeCriterios> processadoresDeCriterios) {
        this.processadoresDeCriterios = processadoresDeCriterios;
    }

    @Override
    public int calcularPontos() {
        return this.processadoresDeCriterios
                .stream()
                .filter(processadorDeCriterios ->
                        processadorDeCriterios.getCriterioAtendido() != null)
                .map(processadorDeCriterios ->
                        processadorDeCriterios
                                .getCriterioAtendido()
                                .getPontuacao()
                                .getValor())
                .reduce(0, Integer::sum);

    }

    @Override
    public int getCriteriosAtendidos() {
        return (int) this.processadoresDeCriterios
                .stream()
                .filter(processadorDeCriterios ->
                        processadorDeCriterios.getCriterioAtendido() != null)
                .count();
    }
}
