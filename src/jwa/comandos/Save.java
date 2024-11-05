package jwa.comandos;

import jwa.io.GerenciadorDeArquivo;

public class Save implements Comando {
    private final GerenciadorDeArquivo gerenciador;

    public Save(GerenciadorDeArquivo gerenciadorDeArquivo) {
        gerenciador = gerenciadorDeArquivo;
    }

    @Override
    public void executar(String[] parametros) {

    }
}
