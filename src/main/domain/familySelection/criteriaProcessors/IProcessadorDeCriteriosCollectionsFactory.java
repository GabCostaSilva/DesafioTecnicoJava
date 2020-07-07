package domain.familySelection.criteriaProcessors;

import domain.entities.Familia;

import java.util.List;

public interface IProcessadorDeCriteriosCollectionsFactory {
    List<ProcessadorDeCriterios> create(Familia familia);
}
