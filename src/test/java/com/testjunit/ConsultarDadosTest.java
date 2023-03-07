package com.testjunit;

import java.time.LocalDateTime;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ConsultarDadosTest {

    //BeforeEach - executa depois do teste especificado
    @BeforeEach
    void inserirDadosParaTeste() {
        BancoDeDados.inserirPessoa(new Pessoa("Cléber", LocalDateTime.of(2000, 1, 1, 00, 02, 39)));
    }

    //AfterEach - executa depois do teste especificado
    @AfterEach
    void removeDadosDoTeste() {
        BancoDeDados.removerPessoa(new Pessoa("Cléber", LocalDateTime.of(2000, 1, 1, 00, 02, 39)));
    }

    //@BeforeAll - reprodução única no início da execução do teste.
    @BeforeAll
    static void configuraConexao () {
        BancoDeDados.iniciarConexao();
        System.out.println("rodou configuraConexao;");
    }

    @Test
    void validarDadosDeRetorno() {
        Assertions.assertTrue(true);
    }

    //@AfterAll - reprodução única no final da execução do teste.
    @AfterAll
    static void finalizarConexao() {
        BancoDeDados.finalConexao();
        System.out.println("rodou finalizarConexao;");
    }  
    
}
