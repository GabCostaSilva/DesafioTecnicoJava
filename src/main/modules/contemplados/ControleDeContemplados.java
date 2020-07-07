package modules.contemplados;

import java.time.LocalDate;
import java.util.UUID;

public interface ControleDeContemplados {
    int getPontuacao();
    LocalDate getDataDeSelecao();
    int getNumeroDeDependentes();
    double getRendaTotal();
    int getIdadeDoPretendente();
    void registrarContemplado(UUID idDaFamilia,
                              int criteriosAtendidos,
                              int pontuacaoTotal,
                              LocalDate dataDaSelecao);
}
