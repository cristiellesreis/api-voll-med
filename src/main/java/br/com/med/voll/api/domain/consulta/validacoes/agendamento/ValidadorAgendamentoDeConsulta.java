package br.com.med.voll.api.domain.consulta.validacoes.agendamento;

import br.com.med.voll.api.domain.consulta.DadosAgendamentoConsulta;

public interface ValidadorAgendamentoDeConsulta {

    default void validar(DadosAgendamentoConsulta dados) {
    }
}
