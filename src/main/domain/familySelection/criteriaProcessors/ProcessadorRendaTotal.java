package domain.familySelection.criteriaProcessors;

import domain.criterias.CriterioDeAvaliacao;
import domain.criterias.criteriosRendaFamiliarTotal.CriterioRendaFamiliarTotalAte900;
import domain.criterias.criteriosRendaFamiliarTotal.CriterioRendaFamiliarTotalEntre1501E2000;
import domain.criterias.criteriosRendaFamiliarTotal.CriterioRendaFamiliarTotalEntre901E1500;
import domain.entities.Familia;

public class ProcessadorRendaTotal extends ProcessadorDeCriteriosAbstract {
    private double rendaTotal;
    public ProcessadorRendaTotal(Familia familia) {
        super(familia);
        this.rendaTotal = familia.getRendaTotal();
        this.criterios.add(new CriterioRendaFamiliarTotalAte900(this.rendaTotal));
        this.criterios.add(new CriterioRendaFamiliarTotalEntre901E1500(this.rendaTotal));
        this.criterios.add(new CriterioRendaFamiliarTotalEntre1501E2000(this.rendaTotal));
    }

}
