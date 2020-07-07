package domain.criterias;

import domain.entities.Familia;
import domain.enums.EnumPontuacao;

public interface CriterioDeAvaliacao {
    boolean ehAceito();
    EnumPontuacao getPontuacao();
}
