package com.apiToDoList.demo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "tasks")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Task {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "titulo", length = 50, nullable = false)
    private String titulo;
    @Column(name = "descricao", length = 255, nullable = false)
    private String descricao;
    @Column(name = "prioridade")
    private String prioridade;
}
