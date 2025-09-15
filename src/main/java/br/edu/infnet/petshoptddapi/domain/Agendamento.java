package br.edu.infnet.petshoptddapi.domain;

import java.time.LocalDateTime;

public class Agendamento {

    private String cliente;

    private String pet;

    private TipoServico servico;

    private String funcionario;

    private LocalDateTime dataHora;

    private StatusAgendamento status = StatusAgendamento.DISPONIVEL;

    public Agendamento() {
        this.setCliente(null);
        this.setPet(null);
        this.setServico(null);
        this.setFuncionario(null);
        this.setDataHora(LocalDateTime.now());
        this.setStatus(StatusAgendamento.DISPONIVEL);
    }

    public void verificarDisponibilidade(LocalDateTime dataHora) {
        this.setStatus(LocalDateTime.now().equals(dataHora) ? StatusAgendamento.DISPONIVEL : StatusAgendamento.AGENDADO);
    }

    public Boolean verificarDados() {
        return getCliente() != null && getPet() != null && getServico() != null && getFuncionario() != null;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getPet() {
        return pet;
    }

    public void setPet(String pet) {
        this.pet = pet;
    }

    public TipoServico getServico() {
        return servico;
    }

    public void setServico(TipoServico servico) {
        this.servico = servico;
    }

    public String getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(String funcionario) {
        this.funcionario = funcionario;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    public StatusAgendamento getStatus() {
        return status;
    }

    public void setStatus(StatusAgendamento status) {
        this.status = status;
    }
}
