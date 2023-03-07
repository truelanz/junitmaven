package com.testjunit;

public class Transferencia {

    public void transferencia(Conta nome, Conta nome2, int valor){
        if(valor <= 0) {
            throw new IllegalArgumentException("Valor deve ser maior que 0(zero)!");
        }
    }  
}
