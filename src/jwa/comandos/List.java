package jwa.comandos;

import jwa.io.GerenciadorDeArquivo;

public class List implements Comando {
    private final GerenciadorDeArquivo gerenciador;

    public List(GerenciadorDeArquivo gerenciadorDeArquivo) {
        gerenciador = gerenciadorDeArquivo;
    }

    @Override
    public void executar(String[] parametros) {
        avaliar();

        gerenciador.exibirInstrucoes();
    }

    private void avaliar() {
        if (!gerenciador.temArquivoCarregado()) {
            throw new RuntimeException("[LIST] Não há nenhum arquivo carregado na memória.");
        }
    }
}
