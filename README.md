# pet-shop-agendamento-api
API de Teste com TDD

## Funcionalidade Agendamento

Essa API vai se integrar com pet-shop-api para realizar os agendamentos e organizar os 
horários dos serviços (banho, tosa etc.), evitando conflitos de agenda e garantindo 
que cada pet seja atendido corretamente.

## Classes de Modelo e Serviços

### Agendamento
Contém as informações para realizar o agendamento (Nome do cliente, nome do pet, nome do funcionário, o tipo do serviço, etc.)

### StatusAgendamento
Enum contendo os status do agendamento: 
* AGENDADO
* CONCLUIDO
* CANCELADO
* DISPONIVEL

### TipoServico
Enum contendo os tipos de serviços: 
* BANHO
* TOSA
* BANHO_TOSA

### AgendamentoService
Classe de serviço que contém o método agendar que realiza o agendamento.

## Classes de testes

### AgendamnetoTest
Essa classe tem os seguintes teste:
* Deve verificar a disponibilidade de horário na agenda quando a data for atual
* Deve verificar a disponibilidade de horário na agenda quando a data for futura
* Deve verificar se cliente existe antes de agendar
* Deve verificar se pet existe antes de agendar
* Deve verificar se funcionário existe antes de agendar
* Deve verificar se serviço existe antes de agendar

### AgendamentoServiceTest
Essa classe tem os seguintes teste:
* Deve lançar um IllegalArgumentException quando chamar o método agendar
* Deve realizar um novo agendamento quando chamar o método agendar
* Deve evitar um novo agendamento quando os dados forem inválidos
