package domain.rules;


import domain.entities.Familia;

public class PontosPorRenda implements RegraDeCalculo{
    @Override
    public int calcula(Familia familia) {
        if(901 > familia.getRendaTotal()) {
            return 5;
        }
        else if(1501 > familia.getRendaTotal()) {
            return 3;
        }
        else if(2001 > familia.getRendaTotal()){
            return 1;
        }
        return 0;
    }
}
