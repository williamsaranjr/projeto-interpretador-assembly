package jwa.io;

import jwa.estruturas.ListaEncadeada;

import java.io.*;

public class GerenciadorDeArquivo {
    private ListaEncadeada<String> instrucoes;
    private String nomedoArquivo;
    private boolean isSaved;

    public GerenciadorDeArquivo() {
        instrucoes = new ListaEncadeada<>();
        isSaved = true;
    }

    public ListaEncadeada<String> getInstrucoes() {
        return instrucoes;
    }

    public String getNomedoArquivo() {
        return nomedoArquivo;
    }

    public boolean isSaved() {
        return isSaved;
    }

    public void carregarArquivo(String caminhoDoArquivo) throws IOException {
        // Ler o arquivo e inserir no fim da lista
        BufferedReader br = new BufferedReader(new FileReader(caminhoDoArquivo));
        String linha;
        while ((linha = br.readLine()) != null) {
            instrucoes.insertTail(linha);
        }
        br.close();
    }

    public boolean temArquivoCarregado() {
        return !instrucoes.isEmpty();
    }

    public void salvarArquivo() throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(nomedoArquivo));
        for (int i = 0; i < instrucoes.getSize(); i++) {
            bw.write(instrucoes.get(i).getData());
            bw.newLine();
        }
        bw.close();
    }
}