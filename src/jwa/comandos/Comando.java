package jwa.comandos;

import jwa.estruturas.ListaEncadeada;

public interface Comando {
    void executar(ListaEncadeada<String> parametros) throws RuntimeException;
}
