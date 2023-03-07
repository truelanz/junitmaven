package com.testjunit;

import java.util.logging.Logger;

public class BancoDeDados {

    private static final Logger LOGGER = Logger.getLogger(BancoDeDados.class.getName());

    public static void iniciarConexao() {
        //fazer algo...
        LOGGER.info("Iniciou conexao...");
    }

    public static void finalConexao() {
        //fazer algo...
        LOGGER.info("finalizou conexao...");
    }

    public static void inserirPessoa(Pessoa pessoa) {
        //inserir pessoa no Banco de Dados...
        LOGGER.info("pessoa insirida no BD...");
    }
    
    public static void removerPessoa(Pessoa pessoa) {
        //inserir pessoa no Banco de Dados...
        LOGGER.info("pessoa removida do BD...");
    }

    
}
