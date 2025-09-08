package br.edu.infnet.petshoptddapi.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class AgendamentoServiceTest {

    private AgendamentoService agendamentoService;

    @BeforeEach
    void init() {
        agendamentoService = new AgendamentoService();
    }

    @Test
    @DisplayName("Deve lançar um UnsupportedOperationException quando chamar o método agendar")
    void deveLancarUnsupportedOperationExceptionQuandoAgendar() {
        agendamentoService.agendar(null);
    }
}
