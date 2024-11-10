package jwa.comandos.menu;

import jwa.comandos.Comando;
import jwa.estruturas.ListaEncadeada;
import jwa.io.GerenciadorDeArquivo;

public class Delete implements Comando {
    private final GerenciadorDeArquivo gerenciador;

    public Delete(GerenciadorDeArquivo gerenciadorDeArquivo) {
        gerenciador = gerenciadorDeArquivo;
    }

    @Override
    public void executar(ListaEncadeada<String> parametros) throws RuntimeException {
        avaliar(parametros);
    }

    private void avaliar(ListaEncadeada<String> parametros) {

    }
}
