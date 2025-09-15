package br.edu.infnet.petshoptddapi.service;

import br.edu.infnet.petshoptddapi.domain.Agendamento;

public class AgendamentoService {

    public String agendar(Agendamento agendamento) {

        if (agendamento != null) {

            if (agendamento.verificarDados()) {
                return salvarAgendamento(agendamento);
            } else {
                throw new IllegalArgumentException("Dados inválidos!");
            }

        } else {
            throw new IllegalArgumentException("O agendamento não pode ser nulo, deve existir um agendamento.");
        }
    }

    private String salvarAgendamento(Agendamento agendamento) {
        return "Agendamento salvo com sucesso!";
    }
}
