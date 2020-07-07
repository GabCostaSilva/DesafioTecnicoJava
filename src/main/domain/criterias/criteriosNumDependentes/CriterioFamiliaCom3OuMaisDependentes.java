package domain.criterias.criteriosNumDependentes;

import domain.enums.EnumPontuacao;

public class CriterioFamiliaCom3OuMaisDependentes extends CriterioPorDependentesAbstract{

    public CriterioFamiliaCom3OuMaisDependentes(int numeroDeDependentes) {
        super(numeroDeDependentes, EnumPontuacao.TRES);
    }

    public boolean ehAceito() {
        return numeroDeDependentes >= 3;
    }

    public EnumPontuacao getPontuacao() {
        return this.ehAceito() ? this.pontuacao : EnumPontuacao.ZERO;
    }
}
