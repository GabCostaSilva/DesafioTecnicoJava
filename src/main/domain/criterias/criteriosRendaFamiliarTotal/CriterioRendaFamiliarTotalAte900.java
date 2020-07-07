package domain.criterias.criteriosRendaFamiliarTotal;


import domain.enums.EnumPontuacao;

public class CriterioRendaFamiliarTotalAte900 extends CriterioRendaFamiliarTotalAbstract {

    public CriterioRendaFamiliarTotalAte900(double renda) {
        super(renda, EnumPontuacao.CINCO);
    }

    @Override
    public boolean ehAtendido() {
        return this.renda <= 900;
    }

    @Override
    public EnumPontuacao getPontuacao() {
        return this.ehAtendido() ? this.pontuacao : EnumPontuacao.ZERO;
    }

}
