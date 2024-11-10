package jwa.menu;

import jwa.comandos.*;
import jwa.comandos.menu.*;
import jwa.estruturas.ListaEncadeada;
import jwa.io.GerenciadorDeArquivo;
import jwa.utils.StringUtils;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Menu {
    private final Scanner scanner = new Scanner(System.in);
    private final Map<String, Comando> HASHMAP_COMANDOS;
    private String opcao = "";

    public Menu(GerenciadorDeArquivo gerenciadorDeArquivo) {
        HASHMAP_COMANDOS = inicializarHashMap(gerenciadorDeArquivo);
    }

    public static void exibirTitulo() {
        System.out.println("-=-=- Interpretador de Assembly -=-=-");
    }

    public void executarPrograma() {
        // Loop para executar enquanto o usuário não finalizar a execução
        while (!opcao.equals("EXIT")) {
            opcao = lerEntrada();

            executarComando();
        }
    }

    private void executarComando() {
        try {
            Comando executavel = getComando(opcao);

            ListaEncadeada<String> instrucoes = getInstrucoes(opcao);

            executavel.executar(instrucoes);
        } catch (RuntimeException excecao) {
            System.out.println(excecao.getMessage());
        }
    }

    // Retorna a entrada do usuário sem espaços e em upper case
    private String lerEntrada() {
        System.out.print(">> ");
        return scanner.nextLine().trim().toUpperCase();
    }

    private ListaEncadeada<String> getInstrucoes(String comando) {
        var lista = new ListaEncadeada<String>();

        for (String instrucao: comando.split(StringUtils.ESPACO)) {
            lista.addLast(instrucao);
        }

        return lista;
    }

    private Comando getComando(String parametros) throws ComandoInvalidoException {
        // Pega a primeira palavra do comando
        String opcao = parametros.split(StringUtils.ESPACO)[0];

        Comando comando = HASHMAP_COMANDOS.get(opcao);
        // Se o comando não existir, lança uma exceção
        if (comando == null) {
            throw new ComandoInvalidoException(opcao);
        }

        return comando;
    }

    private Map<String, Comando> inicializarHashMap(GerenciadorDeArquivo gerenciadorDeArquivo) {
        Map<String, Comando> hashmap = new HashMap<>();

        hashmap.put("LOAD", new Load(gerenciadorDeArquivo));
        hashmap.put("LIST", new List(gerenciadorDeArquivo));
        hashmap.put("RUN", new Run(gerenciadorDeArquivo));
        hashmap.put("INS", new Insert(gerenciadorDeArquivo));
        hashmap.put("DEL", new Delete(gerenciadorDeArquivo));
        hashmap.put("SAVE", new Save(gerenciadorDeArquivo));
        hashmap.put("EXIT", new Exit(gerenciadorDeArquivo));

        return hashmap;
    }
}