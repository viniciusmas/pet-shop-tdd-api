package br.edu.infnet.petshoptddapi.repository;

import br.edu.infnet.petshoptddapi.domain.Agendamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AgendamentoRepository extends JpaRepository<Agendamento, Integer> {

}