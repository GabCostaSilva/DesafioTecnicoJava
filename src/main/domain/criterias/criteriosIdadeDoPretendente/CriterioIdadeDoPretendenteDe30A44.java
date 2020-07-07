package domain.criterias.criteriosIdadeDoPretendente;

import domain.enums.EnumPontuacao;

public class CriterioIdadeDoPretendenteDe30A44 extends CriterioIdadeDoPretendenteAbstract{
    public CriterioIdadeDoPretendenteDe30A44(int idade) {
        super(idade, EnumPontuacao.DOIS);
    }

    @Override
    public boolean ehAtendido() {
        return this.idade >= 30 && this.idade <= 44;
    }

    @Override
    public EnumPontuacao getPontuacao() {
        return this.ehAtendido() ? EnumPontuacao.DOIS : EnumPontuacao.ZERO;
    }
}
