package domain.familySelection;

import domain.entities.Familia;
import domain.familySelection.calculations.AvaliadorDeCriterios;
import domain.familySelection.calculations.IAvaliadorDeCriterios;
import domain.familySelection.criteriaProcessors.IProcessadorDeCriteriosCollectionsFactory;
import domain.familySelection.criteriaProcessors.ProcessadorDeCriteriosCollectionFactory;

public class ValidacaoDeFamilia {
    private IAvaliadorDeCriterios avaliadorDeCriterios;
    private IProcessadorDeCriteriosCollectionsFactory processadoresFactory;
    private Familia familia;

    public ValidacaoDeFamilia(Familia familia) {
        this.familia = familia;
        this.processadoresFactory = new ProcessadorDeCriteriosCollectionFactory();
        this.avaliadorDeCriterios = new AvaliadorDeCriterios(processadoresFactory.create(familia));
    }

    public int calcularPontos() {
        return this.avaliadorDeCriterios.calcularPontos();
    }

    public int getQuantidadeDeCriteriosAtendidos() {
        return this.avaliadorDeCriterios.getCriteriosAtendidos().size();
    }
}
