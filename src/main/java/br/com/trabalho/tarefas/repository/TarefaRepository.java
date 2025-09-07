package br.com.trabalho.tarefas.repository;

import br.com.trabalho.tarefas.model.Tarefa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TarefaRepository extends JpaRepository<Tarefa, Long> {
    // Apenas os métodos básicos herdados do JpaRepository
    // save(), findById(), findAll(), deleteById(), etc.
}
