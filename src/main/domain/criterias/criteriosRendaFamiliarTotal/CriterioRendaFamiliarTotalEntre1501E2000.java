package domain.criterias.criteriosRendaFamiliarTotal;

import domain.enums.EnumPontuacao;

public class CriterioRendaFamiliarTotalEntre1501E2000 extends CriterioRendaFamiliarTotalAbstract {
    public CriterioRendaFamiliarTotalEntre1501E2000(double renda) {
        super(renda, EnumPontuacao.UM);
    }

    @Override
    public boolean ehAtendido() {
        return this.renda >= 901 && this.renda <= 1500;
    }

    @Override
    public EnumPontuacao getPontuacao() {
        return this.ehAtendido() ? this.pontuacao : EnumPontuacao.ZERO;
    }
}
