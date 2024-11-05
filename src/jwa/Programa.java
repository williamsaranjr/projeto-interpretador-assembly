package jwa;

import jwa.io.GerenciadorDeArquivo;
import jwa.menu.Menu;

public class Programa {
    private static final GerenciadorDeArquivo gerenciadorDeArquivo = new GerenciadorDeArquivo();
    private static Menu menu = new Menu(gerenciadorDeArquivo);

    public static void main(String[] args) {
        Menu.exibirTitulo();

        menu.executarPrograma();
    }
}
