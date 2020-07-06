package domain.rules;

import domain.entities.Familia;

public class PontosPorQtdDependentes implements RegraDeCalculo{
    @Override
    public int calcula(Familia familia) {
        int qtdDependentes = familia.countDependentes();

        if(qtdDependentes >= 3) {
            return 3;
        }
        else if(qtdDependentes >= 1) {
            return 2;
        }
        return 0;
    }
}
