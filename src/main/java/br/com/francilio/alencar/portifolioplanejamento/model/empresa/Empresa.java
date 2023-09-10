package br.com.francilio.alencar.portifolioplanejamento.model.empresa;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity(name = "Empresa")
@Table(name = "Empresa")

@Getter
@NoArgsConstructor
@AllArgsConstructor

public class Empresa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long    id_empresa;
    private String  ds_empresa;
    private String  ds_situacao;


    public Empresa(EmpresaDTO empresaP) {
        this.ds_empresa  =   empresaP.ds_empresa();
        this.ds_situacao =   empresaP.ds_situacao();
        this.id_empresa  =   empresaP.id_empresa();

    }
}
