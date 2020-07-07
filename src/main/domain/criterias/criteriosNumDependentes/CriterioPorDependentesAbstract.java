package domain.criterias.criteriosNumDependentes;

import domain.criterias.CriterioDeAvaliacao;
import domain.enums.EnumPontuacao;

public abstract class CriterioPorDependentesAbstract implements CriterioDeAvaliacao{
    protected int numeroDeDependentes;
    protected EnumPontuacao pontuacao;

    public CriterioPorDependentesAbstract(int numeroDeDependentes, EnumPontuacao pontuacao) {
        this.numeroDeDependentes = numeroDeDependentes;
        this.pontuacao = pontuacao;
    }

}
