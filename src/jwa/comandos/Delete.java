package jwa.comandos;

import jwa.io.GerenciadorDeArquivo;

public class Delete implements Comando {
    private final GerenciadorDeArquivo gerenciador;

    public Delete(GerenciadorDeArquivo gerenciadorDeArquivo) {
        gerenciador = gerenciadorDeArquivo;
    }

    @Override
    public void executar(String[] parametros) {

    }
}
