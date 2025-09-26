package br.edu.infnet.petshoptddapi.domain;

import br.edu.infnet.petshoptddapi.dto.AgendamentoDTO;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class Agendamento {

    private Integer idCliente;

    private String nomeCliente;

    private String pet;

    private TipoServico servico;

    private Integer idFuncionario;

    private String nomeFuncionario;

    private LocalDateTime dataHora;

    private StatusAgendamento status = StatusAgendamento.DISPONIVEL;

    private String googleEventId;

    private String linkGoogleCalendar;

    public Agendamento() {
        this.setIdCliente(null);
        this.setNomeCliente(null);
        this.setPet(null);
        this.setServico(null);
        this.setIdFuncionario(null);
        this.setNomeFuncionario(null);
        this.setDataHora(LocalDateTime.now());
        this.setStatus(StatusAgendamento.DISPONIVEL);
    }

    public Agendamento(AgendamentoDTO agendamentoDTO) {
        this.setIdCliente(agendamentoDTO.getIdCliente());
        this.setNomeCliente(agendamentoDTO.getNomeCliente());
        this.setPet(agendamentoDTO.getPet());
        this.setServico(TipoServico.valueOf(agendamentoDTO.getServico()));
        this.setIdFuncionario(agendamentoDTO.getIdFuncionario());
        this.setNomeFuncionario(agendamentoDTO.getNomeFuncionario());
        this.setDataHora(agendamentoDTO.getDataHora());
        this.setStatus(StatusAgendamento.valueOf(agendamentoDTO.getStatus()));
    }

    public void verificarDisponibilidade(LocalDateTime dataHora) {
        this.setStatus(LocalDateTime.now().equals(dataHora) ? StatusAgendamento.DISPONIVEL : StatusAgendamento.AGENDADO);
    }

    public Boolean verificarDados() {
        return getIdCliente() != null && getNomeCliente() != null && getPet() != null && getServico() != null && getIdFuncionario() != null && getNomeFuncionario() != null;
    }
}