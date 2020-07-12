package domain.familySelection;

import domain.entities.Familia;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ListagemDeFamilias {
    List<Familia> familias;

    public ListagemDeFamilias(List<Familia> familias) {
        this.familias = familias;
    }

    public List<Familia> ordernarFamilias() {
        Collections.sort(this.familias);
        return this.familias
                .stream()
                .filter(familia -> familia.getStatus() == 0)
                .collect(Collectors.toList());
    }
}
