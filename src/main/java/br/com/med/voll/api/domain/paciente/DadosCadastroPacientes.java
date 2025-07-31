package br.com.med.voll.api.domain.paciente;

import br.com.med.voll.api.domain.endereco.DadosEndereco;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public record DadosCadastroPacientes(
    @NotBlank
    String nome,

    @NotBlank
    @Email
    String email,

    @NotBlank
    @Pattern(regexp = "^\\(\\d{2}\\) \\d{4,5}-\\d{4}$")
    String telefone,

    @NotBlank
    @Pattern(regexp = "\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}")
    String cpf,

    @NotNull
    @Valid
    DadosEndereco endereco){
}
