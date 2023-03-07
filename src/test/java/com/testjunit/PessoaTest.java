package com.testjunit;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PessoaTest {

    @Test
   void deveCalcularIdadeCorretamente() {

    Pessoa otavio = new Pessoa("Otávio", LocalDateTime.of(2000, 1, 1, 15, 0, 0));
    //O que a gente espera do lado esquerdo, e o que vamos chamar do lado direito;
    //22 (idade esperada), jessica.getIdade() Método chamado para conferir idade esperada;
    //.assertEquals - Comparação entre números...
    Assertions.assertEquals(23, otavio.getIdade());
   }

   @Test
   void deveConferirMaiorIdade() {
    Pessoa otavio = new Pessoa("Otávio", LocalDateTime.of(2000, 1, 1, 15, 0, 0));
    //.assertTrue - método boolean, true or false;
    Assertions.assertTrue(otavio.getMaiorIdade());

    //Posso ter mais de um teste em um mesmo método;
    Pessoa antonio = new Pessoa("Antônio", LocalDateTime.now());
    //assertFalse - setar a resposta esperada como falso;
    Assertions.assertFalse(antonio.getMaiorIdade());


   }  
}
