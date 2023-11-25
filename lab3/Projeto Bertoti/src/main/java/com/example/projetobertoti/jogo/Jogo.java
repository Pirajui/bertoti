package com.example.projetobertoti.jogo;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.io.Serializable;

@Getter
@Setter

@Entity
@Table(name = "jogo")

public class Jogo implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String ano_lan;
    private String descricao;
    private double nota;
    private String desenvolvedora;
}
