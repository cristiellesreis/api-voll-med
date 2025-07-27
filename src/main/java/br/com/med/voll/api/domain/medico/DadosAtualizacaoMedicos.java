package br.com.med.voll.api.domain.medico;

import br.com.med.voll.api.domain.endereco.DadosEndereco;
import jakarta.validation.constraints.NotNull;

public record DadosAtualizacaoMedicos(
        @NotNull
        Long id,
        String nome ,
        String telefone,
        DadosEndereco endereco) {
}
