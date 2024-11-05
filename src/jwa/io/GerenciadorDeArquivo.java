package jwa.io;

import jwa.estruturas.ListaEncadeada;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class GerenciadorDeArquivo {
    private ListaEncadeada<String> instrucoes;

    public GerenciadorDeArquivo() {
        instrucoes = new ListaEncadeada<>(); // Inicializa a lista encadeada
    }

    // Método para ler um arquivo e adicionar cada linha à lista de instruções
    public void carregarArquivo(String caminhoDoArquivo) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(caminhoDoArquivo));
        String linha;
        while ((linha = br.readLine()) != null) {
            instrucoes.adicionar(linha); // Adiciona cada linha na lista
        }
    }

    // Método para exibir as instruções lidas
    public void exibirInstrucoes() {
        instrucoes.exibir(); // Exibe as instruções da lista encadeada
    }

    public boolean temArquivoCarregado() {
        return !instrucoes.isEmpty();
    }
}