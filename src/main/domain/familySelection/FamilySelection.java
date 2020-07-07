package domain.familySelection;

import domain.entities.Familia;
import domain.familySelection.calculations.IAvaliadorDeCriterios;
import domain.familySelection.criteriaProcessors.IProcessadorDeCriteriosCollectionsFactory;
import domain.familySelection.criteriaProcessors.ProcessadorDeCriterios;

import java.util.List;

public class FamilySelection {
    private IAvaliadorDeCriterios avaliadorDeCriterios;
    private List<ProcessadorDeCriterios> processadoresDeCriterios;
    private Familia familia;

    public FamilySelection(IAvaliadorDeCriterios avaliador,
                           IProcessadorDeCriteriosCollectionsFactory factory,
                           Familia familia) {
        this.avaliadorDeCriterios = avaliador;
        this.familia = familia;
        this.processadoresDeCriterios = factory.create(this.familia);
    }
}
