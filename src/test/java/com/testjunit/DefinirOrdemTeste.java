package com.testjunit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
//import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

//Escolher ordem de execução dos testes.
//@TestMethodOrder(MethodOrderer.OrderAnnotation.class) - Escolha a ordem atravéz de números @Order(numero)
//@TestMethodOrder(MethodOrderer.MethodName.class) - Executa em ordem alfabetica.
//@TestMethodOrder(MethodOrderer.Random.class) - Executa em ordem aleatória.
@TestMethodOrder(MethodOrderer.DisplayName.class) //- Executa em ordem alfabetica inserida pelo DisplayName("Letra").
public class DefinirOrdemTeste {

    @DisplayName("D - QUARTO TESTE")
    //@Order(3)
    @Test
    void validarFluxoA () {
        Assertions.assertTrue(true);
    }
    
    @DisplayName("C - TERCEIRO TESTE")
    //@Order(1)
    @Test
    void validarFluxoB () {
        Assertions.assertTrue(true);
    }

    @DisplayName("B - SEGUNDO TESTE")
    //@Order(4)
    @Test
    void validarFluxoC () {
        Assertions.assertTrue(true);
    }
    
    @DisplayName("A - PRIMEIRO TESTE")
    //@Order(2)
    @Test
    void validarFluxoD () {
        Assertions.assertTrue(true);
    }
}
