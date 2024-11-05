package jwa.comandos;

import jwa.io.GerenciadorDeArquivo;

import java.io.IOException;
import java.util.Scanner;

public class Load implements Comando {
    private final Scanner scanner = new Scanner(System.in);
    private final GerenciadorDeArquivo gerenciador;

    public Load(GerenciadorDeArquivo gerenciadorDeArquivo) {
        gerenciador = gerenciadorDeArquivo;
    }

    @Override
    public void executar(String[] parametros) {
        avaliar(parametros);

        try {
            gerenciador.carregarArquivo(parametros[1]);
            System.out.println("[LOAD] Arquivo carregado com sucesso!");
        } catch (IOException e) {
            throw new RuntimeException("[LOAD] Ocorreu um erro ao carregar arquivo.");
        }
    }

    private void avaliar(String[] parametros) {
        if (parametros.length != 2) {
            throw new ParametrosInsuficientesException("LOAD", "NOME DO ARQUIVO");
        }
    }
}
