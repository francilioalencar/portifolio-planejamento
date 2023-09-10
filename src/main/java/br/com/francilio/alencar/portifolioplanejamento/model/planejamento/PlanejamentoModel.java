package br.com.francilio.alencar.portifolioplanejamento.model.planejamento;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity(name = "Planejamento")
@Table(name = "Planejamento")

@Getter
@NoArgsConstructor
@AllArgsConstructor

public class PlanejamentoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_plano;
    private Long id_empresa;
    private String ds_plano;
    private String ds_ano_inicio;
    private String nr_perido;
    private String ds_tipo_periodo;

    public PlanejamentoModel(PlanejamentoDTO planejamentoDTO) {

        this.id_plano           =   planejamentoDTO.id_plano();
        this.id_empresa         =   planejamentoDTO.id_empresa();
        this.ds_plano           =   planejamentoDTO.ds_plano();
        this.ds_ano_inicio      =   planejamentoDTO.ds_ano_inicio();
        this.nr_perido          =   planejamentoDTO.nr_perido();
        this.ds_tipo_periodo    =   planejamentoDTO.ds_tipo_periodo();

    }
}
