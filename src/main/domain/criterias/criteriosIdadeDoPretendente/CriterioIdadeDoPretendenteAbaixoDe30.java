package domain.criterias.criteriosIdadeDoPretendente;

import domain.enums.EnumPontuacao;

public class CriterioIdadeDoPretendenteAbaixoDe30 extends CriterioIdadeDoPretendenteAbstract{
    public CriterioIdadeDoPretendenteAbaixoDe30(int idade) {
        super(idade, EnumPontuacao.UM);
    }

    @Override
    public boolean ehAceito() {
        return this.idade <= 30;
    }

    @Override
    public EnumPontuacao getPontuacao() {
        return this.ehAceito() ? EnumPontuacao.UM : EnumPontuacao.ZERO;
    }
}
