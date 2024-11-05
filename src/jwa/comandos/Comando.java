package jwa.comandos;

public interface Comando {
    void executar(String[] parametros) throws RuntimeException;
}
