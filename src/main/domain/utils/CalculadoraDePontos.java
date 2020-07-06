package domain.utils;

import domain.entities.Familia;
import domain.rules.RegraDeCalculo;

import java.util.ArrayList;
import java.util.List;

public class CalculadoraDePontos {
    List<RegraDeCalculo> regras;

    public CalculadoraDePontos(List<RegraDeCalculo> regras) {
        this.regras = regras;
    }

    public int calculaPontuacao(Familia familia) {
        return this.regras
                .stream()
                .mapToInt(regraDeCalculo -> regraDeCalculo.calcula(familia))
                .sum();
    }
}
