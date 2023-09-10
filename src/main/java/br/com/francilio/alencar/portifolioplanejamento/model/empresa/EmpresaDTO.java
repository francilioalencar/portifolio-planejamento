package br.com.francilio.alencar.portifolioplanejamento.model.empresa;

import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public record EmpresaDTO(
        @NotNull(message = "Deve-se infromar o nome da empresa")
        @Size(min = 5 , max = 250, message = "O nome da empresa deve ter entre 5 e 250 caracteres")
        String ds_empresa,

        @NotEmpty(message = "Informe a situação da empresa A = Ativo e I = inativo")
        @Size(max = 1)
        String ds_situacao,

        @NotEmpty(message = "Informe o id da empresa")
        @Digits(integer = 12, fraction = 0, message = "O campo deve ser numérico" )
        Long id_empresa


){
    public EmpresaDTO(Empresa empesa) {
        this(
                empesa.getDs_empresa(),
                empesa.getDs_situacao(),
                empesa.getId_empresa()
                );
    }


}
