package br.com.francilio.alencar.portifolioplanejamento.model.objetivos;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity(name = "Objetivo")
@Table(name = "Objetivo")

@Getter
@NoArgsConstructor
@AllArgsConstructor

public class ObjetivoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_objetivo;
    private Long id_empresa;
    private Long id_planejamento;
    private String ds_objetivo;
    private String ds_pronto;

    public ObjetivoModel(ObjetivoDTO objetivoDTO) {
        this.id_objetivo        =   objetivoDTO.id_objetivo();
        this.id_empresa         =   objetivoDTO.id_empresa();
        this.id_planejamento    =   objetivoDTO.id_planejamento();
        this.ds_objetivo        =   objetivoDTO.ds_objetivo();
        this.ds_pronto          =   objetivoDTO.ds_pronto();
    }
}
