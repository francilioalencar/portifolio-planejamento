package br.com.francilio.alencar.portifolioplanejamento.model.swot;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity(name = "Swot")
@Table(name = "swot")

@Getter
@NoArgsConstructor
@AllArgsConstructor

public class SwotModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_swot;
    private Long id_planejamento;
    private Long id_empresa;
    private Long id_objetivo;
    private String ds_swot;
    private String ie_relevancia;
    private String ie_desempenho;

    public SwotModel(SwotDTO swotDTO) {
        this.id_swot            =   swotDTO.id_swot();
        this.id_planejamento    =   swotDTO.id_planejamento();
        this.id_empresa         =   swotDTO.id_empresa();
        this.id_objetivo        =   swotDTO.id_objetivo();
        this.ds_swot            =   swotDTO.ds_swot();
        this.ie_relevancia      =   swotDTO.ie_relevancia();
        this.ie_desempenho      =   swotDTO.ie_desempenho();
    }
}
