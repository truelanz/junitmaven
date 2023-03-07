package com.testjunit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExceptionsTest {

    @Test
    void validarExptionTransferencia() {
        Conta contaOrigem = new Conta("52112358", 500);
        Conta contaDestino = new Conta("56888754", 500);

        Transferencia transferenciaEntreContas = new Transferencia();

        //assertThrows - Verificar se será lançada uma exception...
        Assertions.assertThrows(IllegalArgumentException.class, () ->
            transferenciaEntreContas.transferencia(contaOrigem, contaDestino, -1));
            
        //assertDoesNotThrow - Verificar se NÃO será lançada uma exception...
        /* Assertions.assertDoesNotThrow(() ->
            transferenciaEntreContas.transferencia(contaOrigem, contaDestino, -1)); */
    }
}
