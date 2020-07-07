package domain.criterias.criteriosIdadeDoPretendente;

import domain.entities.Familia;
import domain.criterias.CriterioDeAvaliacao;
import domain.enums.EnumPontuacao;

public class CriterioIdadeDoPretendenteMaiorOuIgualA45Anos extends CriterioIdadeDoPretendenteAbstract {
    public CriterioIdadeDoPretendenteMaiorOuIgualA45Anos(int idade) {
        super(idade, EnumPontuacao.TRES);
    }

    @Override
    public boolean ehAceito() {
        return this.idade >= 45;
    }

    @Override
    public EnumPontuacao getPontuacao() {
        return this.ehAceito() ? EnumPontuacao.TRES : EnumPontuacao.ZERO;
    }
}
