package domain.familySelection.criteriaProcessors;

import domain.criterias.criteriosNumDependentes.CriterioFamiliaCom1ou2Dependentes;
import domain.criterias.criteriosNumDependentes.CriterioFamiliaCom3OuMaisDependentes;
import domain.entities.Familia;

public class ProcessadorDependentes extends ProcessadorDeCriteriosAbstract{
    private int dependentes;

    public ProcessadorDependentes(Familia familia) {
        super(familia);
        this.dependentes = familia.countDependentes();
        this.criterios.add(new CriterioFamiliaCom1ou2Dependentes(this.dependentes));
        this.criterios.add(new CriterioFamiliaCom3OuMaisDependentes(this.dependentes));
    }
}
