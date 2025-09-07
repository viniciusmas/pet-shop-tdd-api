package br.edu.infnet.petshoptddapi.domain;

import java.time.LocalDateTime;

public class Agendamento {

    private Integer id;

    private Cliente cliente;

    private Pet pet;

    private Servico servico;

    private Funcionario funcionario;

    private LocalDateTime dataHora;

    private Boolean status;

}
