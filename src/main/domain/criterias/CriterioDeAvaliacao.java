package domain.criterias;

import domain.enums.EnumPontuacao;

public interface CriterioDeAvaliacao {
    boolean ehAtendido();
    EnumPontuacao getPontuacao();
}
