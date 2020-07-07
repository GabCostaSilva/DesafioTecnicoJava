package domain.criterias.criteriosNumDependentes;

import domain.enums.EnumPontuacao;

public class CriterioFamiliaCom1ou2Dependentes extends CriterioPorDependentesAbstract{

    public CriterioFamiliaCom1ou2Dependentes(int numeroDependentes) {
        super(numeroDependentes, EnumPontuacao.DOIS);
    }

    public boolean ehAtendido() {
        return numeroDeDependentes == 1 || numeroDeDependentes == 2;
    }

    public EnumPontuacao getPontuacao() {
        return this.ehAtendido() ? this.pontuacao : EnumPontuacao.ZERO;
    }
}
