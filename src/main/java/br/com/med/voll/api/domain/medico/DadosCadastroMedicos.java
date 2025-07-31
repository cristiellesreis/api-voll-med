package br.com.med.voll.api.domain.medico;

import br.com.med.voll.api.domain.endereco.DadosEndereco;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public record DadosCadastroMedicos(

        @NotBlank
        String nome,

        @NotBlank
        @Email
        String email,

        @NotBlank
        @Pattern(regexp = "^\\(\\d{2}\\) \\d{4,5}-\\d{4}$")
        String telefone,

        @NotBlank
        @Pattern(regexp = "\\d{6}-\\d{2}/[A-Z]{2}")
        String crm,

        @NotNull
        Especialidade especialidade,

        @NotNull
        @Valid
        DadosEndereco endereco) {
}
