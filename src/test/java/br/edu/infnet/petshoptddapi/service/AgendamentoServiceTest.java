package br.edu.infnet.petshoptddapi.service;

import br.edu.infnet.petshoptddapi.domain.Agendamento;
import br.edu.infnet.petshoptddapi.domain.StatusAgendamento;
import br.edu.infnet.petshoptddapi.domain.TipoServico;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;

@SpringBootTest
class AgendamentoServiceTest {

    private AgendamentoService agendamentoService;
    private Agendamento agendamento;

    @BeforeEach
    void init() {
        agendamentoService = new AgendamentoService();
        agendamento = new Agendamento();
        agendamento.setCliente("Vinicius");
        agendamento.setPet("Spake");
        agendamento.setFuncionario("Luana");
        agendamento.setServico(TipoServico.BANHO);
        agendamento.setDataHora(LocalDateTime.now());
        agendamento.setStatus(StatusAgendamento.AGENDADO);
    }

    @Test
    @DisplayName("Deve lançar um IllegalArgumentException quando chamar o método agendar")
    void deveLancarUnsupportedOperationExceptionQuandoAgendar() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> agendamentoService.agendar(null), "O agendamento não pode ser nulo, deve existir um agendamento.");

    }

    @Test
    @DisplayName("Deve realizar um novo agendamento quando chamar o método agendar")
    void deveRealizarNovoAgendamentoQuandoAgendar() {
        String msg = agendamentoService.agendar(agendamento);
        Assertions.assertEquals(msg,"Agendamento salvo com sucesso!");
    }

    @Test
    @DisplayName("Deve evitar um novo agendamento quando os dados forem inválidos")
    void deveEvitarNovoAgendamentoQuandoDadosInvalidos() {
        agendamento = new Agendamento();
        Assertions.assertThrows(IllegalArgumentException.class, () -> agendamentoService.agendar(agendamento), "Dados inválidos!");
    }
}
