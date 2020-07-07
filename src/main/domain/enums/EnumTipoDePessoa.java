package domain.enums;

import java.util.List;
import java.util.Random;

public enum EnumTipoDePessoa {
    CONJUGE, DEPENDENTE, PRETENDENTE;

    private static final List<EnumTipoDePessoa> VALUES = List.of(values());
    private static final int SIZE = VALUES.size();
    private static final Random RANDOM = new Random();

    public static EnumTipoDePessoa getTipoAleatorio() {
        return VALUES.get(RANDOM.nextInt(SIZE));
    }
}
