package domain.rules;

import domain.entities.Familia;

public class PontosPorIdade implements RegraDeCalculo{
    public int calcula(Familia familia) {
        int idadePretendente = familia.getPretendente().getIdade();

        if(idadePretendente >= 45) {
            return 3;
        }
        else if(idadePretendente >= 30) {
            return 2;
        }
        else if(idadePretendente > 0){
            return 1;
        }
        return 0;
    }
}
