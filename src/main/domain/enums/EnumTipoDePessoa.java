package domain.enums;

import java.util.List;
import java.util.Random;

public enum EnumTipoDePessoa {
    CONJUGE("CONJUGE"), DEPENDENTE("DEPENDENTE"), PRETENDENTE("PRETENDENTE");

    private static final List<EnumTipoDePessoa> VALUES = List.of(values());
    private static final int SIZE = VALUES.size();
    private static final Random RANDOM = new Random();

    private String tipo;

    EnumTipoDePessoa(String tipo) {
        this.tipo = tipo;
    }
    public static EnumTipoDePessoa getTipoAleatorio() {
        return VALUES.get(RANDOM.nextInt(SIZE));
    }
    public String getTipo() {
        return tipo;
    }
}
