package domain.criterias.criteriosRendaFamiliarTotal;

import domain.enums.EnumPontuacao;

public class CriterioRendaFamiliarTotalEntre901E1500 extends CriterioRendaFamiliarTotalAbstract {
    public CriterioRendaFamiliarTotalEntre901E1500(double renda) {
        super(renda, EnumPontuacao.TRES);
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
