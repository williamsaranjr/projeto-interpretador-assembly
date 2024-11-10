package jwa.comandos.menu;

import jwa.comandos.Comando;
import jwa.estruturas.ListaEncadeada;
import jwa.io.GerenciadorDeArquivo;

public class List implements Comando {
    private final GerenciadorDeArquivo gerenciador;

    public List(GerenciadorDeArquivo gerenciadorDeArquivo) {
        gerenciador = gerenciadorDeArquivo;
    }

    @Override
    public void executar(ListaEncadeada<String> parametros) throws RuntimeException {
        avaliar();

        var instrucoes = gerenciador.getInstrucoes();

        for (int i = 1; i <= instrucoes.getSize(); i++) {
            System.out.printf(
                    "[%d] %s%n",
                    i,
                    instrucoes.get(i).getData()
            );
        }
    }

    private void avaliar() {
        if (!gerenciador.temArquivoCarregado()) {
            throw new RuntimeException("[LIST] Não há nenhum arquivo carregado na memória.");
        }
    }
}
