package jwa.comandos;

import jwa.io.GerenciadorDeArquivo;

public class Insert implements Comando {
    private final GerenciadorDeArquivo gerenciador;

    public Insert(GerenciadorDeArquivo gerenciadorDeArquivo) {
        gerenciador = gerenciadorDeArquivo;
    }

    @Override
    public void executar(String[] parametros) {

    }
}
