package com.testjunit;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Pessoa {

    private String nome;
    private LocalDateTime nascimento;

    public Pessoa(String nome, LocalDateTime localDateTime) {
        this.nome = nome;
        this.nascimento = localDateTime;
    }

    public int getIdade() {
        return (int) ChronoUnit.YEARS.between(nascimento, LocalDateTime.now());
    }

    public boolean getMaiorIdade() {
        return getIdade() >= 18;
    }

    public String getNome() {
        return nome = getNome();
    }
    
}
