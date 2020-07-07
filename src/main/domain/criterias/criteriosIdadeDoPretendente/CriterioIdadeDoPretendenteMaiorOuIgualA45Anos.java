package domain.criterias.criteriosIdadeDoPretendente;

import domain.enums.EnumPontuacao;

public class CriterioIdadeDoPretendenteMaiorOuIgualA45Anos extends CriterioIdadeDoPretendenteAbstract {
    public CriterioIdadeDoPretendenteMaiorOuIgualA45Anos(int idade) {
        super(idade, EnumPontuacao.TRES);
    }

    @Override
    public boolean ehAtendido() {
        return this.idade >= 45;
    }

    @Override
    public EnumPontuacao getPontuacao() {
        return this.ehAtendido() ? EnumPontuacao.TRES : EnumPontuacao.ZERO;
    }
}
