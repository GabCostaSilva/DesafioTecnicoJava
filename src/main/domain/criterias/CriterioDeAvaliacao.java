package domain.criterias;

import domain.enums.EnumPontuacao;

public interface CriterioDeAvaliacao {
    boolean ehAceito();
    EnumPontuacao getPontuacao();
}
