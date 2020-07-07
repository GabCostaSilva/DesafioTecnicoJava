package domain.familySelection.calculations;

import domain.criterias.CriterioDeAvaliacao;

import java.util.List;

public interface IAvaliadorDeCriterios {
    int calcularPontos();
    int getCriteriosAtendidos();
}
