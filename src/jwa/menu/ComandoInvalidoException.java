package jwa.menu;

public class ComandoInvalidoException extends RuntimeException {
    public ComandoInvalidoException(String comando) {
        super(String.format("[ERRO] O comando '%s' não é válido.", comando));
    }
}