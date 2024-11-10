package jwa.comandos.menu;

import jwa.comandos.Comando;
import jwa.estruturas.ListaEncadeada;
import jwa.io.GerenciadorDeArquivo;

import java.util.Arrays; // Usado para converter o comando em uma string

public class Insert implements Comando {
    private final GerenciadorDeArquivo gerenciador;
    private Integer linha;
    private String instrucao;

    public Insert(GerenciadorDeArquivo gerenciadorDeArquivo) {
        gerenciador = gerenciadorDeArquivo;
    }
    // INS <linha> <instrucao>

    @Override
    public void executar(ListaEncadeada<String> parametros) throws RuntimeException {

    }
}
