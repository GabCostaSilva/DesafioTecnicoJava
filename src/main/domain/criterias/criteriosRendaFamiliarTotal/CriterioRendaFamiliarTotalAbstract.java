package domain.criterias.criteriosRendaFamiliarTotal;

import domain.criterias.CriterioDeAvaliacao;
import domain.enums.EnumPontuacao;

public abstract class CriterioRendaFamiliarTotalAbstract implements CriterioDeAvaliacao {
    protected double renda;
    protected EnumPontuacao pontuacao;

    CriterioRendaFamiliarTotalAbstract(double renda, EnumPontuacao pontuacao){
        this.renda = renda;
        this.pontuacao = pontuacao;
    }

}
