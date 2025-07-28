package br.com.med.voll.api.domain.consulta.validacoes.agendamento;

import br.com.med.voll.api.domain.ValidacaoException;
import br.com.med.voll.api.domain.consulta.DadosAgendamentoConsulta;
import br.com.med.voll.api.domain.medico.MedicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ValidadorMedicoAtivo implements ValidadorAgendamentoDeConsulta {

    @Autowired
    private MedicoRepository repository;

    public void validar(DadosAgendamentoConsulta dados) {

        if (dados.idMedico() == null) {
            return;
        }

        var medicaEstaAtivo = repository.findAtivoById(dados.idMedico());
        if (!medicaEstaAtivo) {
            throw new ValidacaoException("Consulta não pode ser agendada com médico.");
        }
    }
}
