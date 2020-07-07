package domain.familySelection.criteriaProcessors;

import domain.criterias.CriterioDeAvaliacao;
import domain.criterias.criteriosIdadeDoPretendente.CriterioIdadeDoPretendenteAbaixoDe30;
import domain.criterias.criteriosIdadeDoPretendente.CriterioIdadeDoPretendenteDe30A44;
import domain.criterias.criteriosIdadeDoPretendente.CriterioIdadeDoPretendenteMaiorOuIgualA45Anos;
import domain.entities.Familia;

import java.util.List;
import java.util.stream.Collectors;

public class ProcessadorIdadeDoPretendente extends ProcessadorDeCriteriosAbstract {
    private int idade;
    public ProcessadorIdadeDoPretendente(Familia familia) {
        super(familia);
        this.idade = familia.getPretendente().getIdade();
        this.criterios.add(new CriterioIdadeDoPretendenteMaiorOuIgualA45Anos(this.idade));
        this.criterios.add(new CriterioIdadeDoPretendenteDe30A44(this.idade));
        this.criterios.add(new CriterioIdadeDoPretendenteAbaixoDe30(this.idade));
    }
}