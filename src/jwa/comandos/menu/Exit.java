package jwa.comandos.menu;

import jwa.comandos.Comando;
import jwa.estruturas.ListaEncadeada;
import jwa.io.GerenciadorDeArquivo;

import java.io.IOException;
import java.util.Scanner;

public class Exit implements Comando {
    private final GerenciadorDeArquivo gerenciador;
    Scanner scanner = new Scanner(System.in);

    public Exit(GerenciadorDeArquivo gerenciador) {
        this.gerenciador = gerenciador;
    }

    @Override
    public void executar(ListaEncadeada<String> parametros) throws RuntimeException {
        if (gerenciador.isSaved()) {
            salvar();
        }
    }

    private void salvar() {
        var opcao = "";
        while (opcao.equals("S") || opcao.equals("N")) {
            System.out.println("[EXIT] O arquivo não foi salvo. Gostaria de salvar? (S/N)\n>> ");
            opcao = scanner.nextLine().trim().toUpperCase();
        } if (opcao.equals("N")) {
            return;
        }
        try {
            gerenciador.salvarArquivo();
        } catch (IOException e) {
            throw new RuntimeException("[EXIT] Erro ao salvar o arquivo.");
        }
    }
}
