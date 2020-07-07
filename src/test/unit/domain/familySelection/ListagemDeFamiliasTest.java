package unit.domain.familySelection;

import domain.entities.Familia;
import domain.familySelection.ListagemDeFamilias;
import org.junit.jupiter.api.Test;
import unit.domain.TestAbstract;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ListagemDeFamiliasTest extends TestAbstract {
    List<Familia> familias;
    ListagemDeFamilias listagemDeFamilias;
    public ListagemDeFamiliasTest() {
        familias = new ArrayList<>();
        Familia familia1 = this.familiaFactory.createFamiliaValidaCom1Dependente();
        Familia familia2 = this.familiaFactory.createFamiliaValidaCom3Dependentes(45);
        Familia familia3 = this.familiaFactory.createFamiliaValidaPorRenda(900);

        familias.add(familia1);
        familias.add(familia2);
        familias.add(familia3);

        this.listagemDeFamilias = new ListagemDeFamilias(familias);
    }

    @Test
    void deveRetornarFamiliasOrdenasPorPontuacao() {
        List<Familia> sorted = listagemDeFamilias.ordernarFamilias();
        assertNotNull(sorted);
    }
}
