package domain.criterias.criteriosIdadeDoPretendente;

import domain.criterias.CriterioDeAvaliacao;
import domain.enums.EnumPontuacao;

public abstract class CriterioIdadeDoPretendenteAbstract implements CriterioDeAvaliacao {
    protected int idade;
    protected EnumPontuacao pontuacao;

    CriterioIdadeDoPretendenteAbstract(int idade, EnumPontuacao pontuacao){
        this.idade = idade;
        this.pontuacao = pontuacao;
    }
}
