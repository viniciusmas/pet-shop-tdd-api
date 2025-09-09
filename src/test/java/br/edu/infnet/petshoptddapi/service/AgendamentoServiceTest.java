package br.edu.infnet.petshoptddapi.service;

import br.edu.infnet.petshoptddapi.domain.Agendamento;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AgendamentoServiceTest {

    private AgendamentoService agendamentoService;

    @BeforeEach
    void init() {
        agendamentoService = new AgendamentoService();
    }

    @Test
    @DisplayName("Deve lançar um UnsupportedOperationException quando chamar o método agendar")
    void deveLancarUnsupportedOperationExceptionQuandoAgendar() {
        Agendamento agendamento = new Agendamento();
        Assertions.assertThrows(UnsupportedOperationException.class, () -> agendamentoService.agendar(agendamento), "Método agendar ainda não foi implementado.");
    }
}
