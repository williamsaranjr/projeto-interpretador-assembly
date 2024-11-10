package jwa.io;

public class RegistradorNuloException extends RuntimeException {
    public RegistradorNuloException(Character registrador) {
        super(String.format("[ERRO] O registrador '%c' não tem valor atribuído.", registrador));
    }
}
