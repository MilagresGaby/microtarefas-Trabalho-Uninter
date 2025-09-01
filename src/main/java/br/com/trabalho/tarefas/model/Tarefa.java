package br.com.trabalho.tarefas.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.time.LocalDate;

import jakarta.persistence.*;

@Entity
@Table(name = "tarefas")
public class Tarefa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Nome da tarefa não pode estar vazio")
    @Size(max = 100, message = "Nome da tarefa deve ter no máximo 100 caracteres")
    @Column(nullable = false, length = 100)
    private String nome;

    @NotNull(message = "Data de entrega é obrigatória")
    @Column(name = "data_entrega", nullable = false)
    private LocalDate dataEntrega;

    @NotBlank(message = "Responsável não pode estar vazio")
    @Size(max = 50, message = "Nome do responsável deve ter no máximo 50 caracteres")
    @Column(nullable = false, length = 50)
    private String responsavel;

    // Construtores
    public Tarefa() {
    }

    public Tarefa(String nome, LocalDate dataEntrega, String responsavel) {
        this.nome = nome;
        this.dataEntrega = dataEntrega;
        this.responsavel = responsavel;
    }

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataEntrega() {
        return dataEntrega;
    }

    public void setDataEntrega(LocalDate dataEntrega) {
        this.dataEntrega = dataEntrega;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

    // toString
    @Override
    public String toString() {
        return "Tarefa{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", dataEntrega=" + dataEntrega +
                ", responsavel='" + responsavel + '\'' +
                '}';
    }

    // equals e hashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tarefa tarefa = (Tarefa) o;
        return id != null && id.equals(tarefa.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}