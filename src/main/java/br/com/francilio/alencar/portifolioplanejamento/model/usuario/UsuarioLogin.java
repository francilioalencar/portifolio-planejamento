package br.com.francilio.alencar.portifolioplanejamento.model.usuario;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public record UsuarioLogin(
        @NotEmpty(message = "Informe o login do usuário")
        String ds_login,

        @NotEmpty(message = "Informe a senha do suário")
        @Size(min = 6, message = "A senha deve ter no minimo 6 caracteres")
        @Pattern(regexp = "^(?=.*[a-z]).+$", message = "A senha deve conter letra minúscula")
        @Pattern(regexp = "^(?=.*[A-Z]).+$", message = "A senha deve conter pelo menos uma letra maiúscula")
        @Pattern(regexp = "^(?=.*\\d).+$", message = "A senha deve conter pelo menos um caractere numérico")
        String ds_senha

) {
}
