package br.edu.infnet.petshoptddapi.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AgendamentoTest {

    private Agendamento agendamento;

    @BeforeEach
    void init() {
        agendamento = new Agendamento();
    }


    @Test
    @DisplayName("Deve verificar a disponibilidade de horário na agenda quando for agendar")
    void deveVerificarDisponibilidade_quandoAgendar() {}

    @Test
    @DisplayName("Deve verificar se cliente existe antes de agendar")
    void deveVerificarExistenciaCliente_quandoAgendar() {}

    @Test
    @DisplayName("Deve verificar se pet existe antes de agendar")
    void deveVerificarExistenciaPet_quandoAgendar() {}

    @Test
    @DisplayName("Deve verificar se funcionário existe antes de agendar")
    void deveVerificarExistenciaFuncionario_quandoAgendar() {}

    @Test
    @DisplayName("Deve verificar se serviço existe antes de agendar")
    void deveVerificarExistenciaServico_quandoAgendar() {}


}
