package br.edu.infnet.petshoptddapi.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;

@SpringBootTest
class AgendamentoTest {

    private Agendamento agendamento;

    @BeforeEach
    void init() {
        agendamento = new Agendamento();
        agendamento.setIdCliente(1);
        agendamento.setNomeCliente("Vinicius");
        agendamento.setPet("Spake");
        agendamento.setIdFuncionario(1);
        agendamento.setNomeFuncionario("Luana");
        agendamento.setServico(TipoServico.BANHO);
        agendamento.setDataHora(LocalDateTime.now());
        agendamento.setStatus(StatusAgendamento.AGENDADO);
    }

    @Test
    @DisplayName("Deve verificar a disponibilidade de horário na agenda quando a data for atual")
    void deveVerificarDisponibilidade_quandoDataForAtual() {
        agendamento = new Agendamento();
        agendamento.setIdCliente(2);
        agendamento.setNomeCliente("Gustavo");
        agendamento.setPet("Bob");
        agendamento.setIdFuncionario(3);
        agendamento.setNomeFuncionario("João");
        agendamento.setServico(TipoServico.BANHO);
        agendamento.setDataHora(LocalDateTime.now());
        agendamento.setStatus(StatusAgendamento.AGENDADO);
        agendamento.verificarDisponibilidade(agendamento.getDataHora());
        Assertions.assertEquals(StatusAgendamento.DISPONIVEL, agendamento.getStatus());
    }

    @Test
    @DisplayName("Deve verificar a disponibilidade de horário na agenda quando a data for futura")
    void deveVerificarDisponibilidade_quandoDataForFutura() {
        agendamento = new Agendamento();
        agendamento.setIdCliente(3);
        agendamento.setNomeCliente("Mario");
        agendamento.setPet("Rafa");
        agendamento.setIdFuncionario(4);
        agendamento.setNomeFuncionario("Pedro");
        agendamento.setServico(TipoServico.BANHO);
        agendamento.setDataHora(LocalDateTime.now().minusDays(+1));
        agendamento.setStatus(StatusAgendamento.AGENDADO);
        agendamento.verificarDisponibilidade(agendamento.getDataHora());
        Assertions.assertEquals(StatusAgendamento.AGENDADO, agendamento.getStatus());
    }

    @Test
    @DisplayName("Deve verificar se cliente existe antes de agendar")
    void deveVerificarExistenciaCliente_quandoAgendar() {
        Assertions.assertNotNull(agendamento.getNomeCliente());
    }

    @Test
    @DisplayName("Deve verificar se pet existe antes de agendar")
    void deveVerificarExistenciaPet_quandoAgendar() {
        Assertions.assertNotNull(agendamento.getPet());
    }

    @Test
    @DisplayName("Deve verificar se funcionário existe antes de agendar")
    void deveVerificarExistenciaFuncionario_quandoAgendar() {
        Assertions.assertNotNull(agendamento.getNomeFuncionario());
    }

    @Test
    @DisplayName("Deve verificar se serviço existe antes de agendar")
    void deveVerificarExistenciaServico_quandoAgendar() {
        Assertions.assertNotNull(agendamento.getServico());
    }


}
