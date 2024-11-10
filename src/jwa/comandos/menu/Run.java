package jwa.comandos.menu;

import jwa.comandos.Comando;
import jwa.estruturas.ListaEncadeada;
import jwa.io.GerenciadorDeArquivo;

public class Run implements Comando {
    private final GerenciadorDeArquivo gerenciador;

    public Run(GerenciadorDeArquivo gerenciadorDeArquivo) {
        gerenciador = gerenciadorDeArquivo;
    }

    @Override
    public void executar(ListaEncadeada<String> parametros) throws RuntimeException {

    }
}
