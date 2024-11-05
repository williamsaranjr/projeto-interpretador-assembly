package jwa.comandos;

import jwa.io.GerenciadorDeArquivo;

public class Run implements Comando {
    private final GerenciadorDeArquivo gerenciador;

    public Run(GerenciadorDeArquivo gerenciadorDeArquivo) {
        gerenciador = gerenciadorDeArquivo;
    }

    @Override
    public void executar(String[] parametros) {

    }
}
