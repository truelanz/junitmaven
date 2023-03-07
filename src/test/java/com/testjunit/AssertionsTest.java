package com.testjunit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/*----------------IMPORTAÇÃO ESTÁTICA-------------------
 *  Com a importação estática do método, não é necessário ficar chamando "Assertions" para cada
 * método da biblioteca Assertions...
 * 
 * import static org.junit.jupiter.api.Assertions.*;
 ------------------------------------------------------*/

public class AssertionsTest {

    @Test
    void validarLancamentos() {

        int[] primeiroLancamento = {10, 20, 30, 40, 50};
        int[] segundoLancamento = {10, 20, 30, 40, 50};
        //assertArrayEquals - Confere se os arrays são iguais.
        Assertions.assertArrayEquals(primeiroLancamento, segundoLancamento);

        int[] primeiroLancamento2 = {45, 8, 30, 7, 50};
        int[] segundoLancamento2 = {13, 15, 30, 40, 52};
        //assertNotEquals - Confere se os itens são diferentes.
        Assertions.assertNotEquals(primeiroLancamento2, segundoLancamento2);
    }

    @Test
    void validarNull () {
        Pessoa pessoa = null;
        //assertNull - ver se conteúdo é = null;
        Assertions.assertNull(pessoa);

        Pessoa claudio = new Pessoa("Cláudio", null);
        //assertNotNull - ver se conteúdo NÃO é = null;
        Assertions.assertNotNull(claudio);
    }

    @Test 
    void validarTiposDiferentes () {
        double valor = 5.6;
        double outroValor = 5.6;
        //assertEquals - conteúdos são iguais?
        Assertions.assertEquals(valor, outroValor);

    }

    
}
