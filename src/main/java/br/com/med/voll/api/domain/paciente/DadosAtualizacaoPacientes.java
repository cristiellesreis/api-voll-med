package br.com.med.voll.api.domain.paciente;

import br.com.med.voll.api.domain.endereco.DadosEndereco;
import jakarta.validation.constraints.NotNull;

public record DadosAtualizacaoPacientes(
        @NotNull
        Long id,
        String nome ,
        String telefone,
        DadosEndereco endereco) {
}
