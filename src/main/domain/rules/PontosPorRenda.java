package domain.rules;


import domain.entities.Familia;

public class PontosPorRenda implements RegraDeCalculo{
    @Override
    public int calcula(Familia familia) {
        if(familia.getRendaTotal() <= 900) {
            return 5;
        }
        else if(familia.getRendaTotal() <= 1500){
            return 3;
        }
        else if(familia.getRendaTotal() <= 2000){
            return 1;
        }
        return 0;
    }
}
