package jwa.io;

public class GerenciadorDeVariaveis {
    private static final Double[] registradores = new Double[26];

    public static void setVariavel(Character registrador, Double valor) {
        registradores[getOffset(registrador)] = valor;
    }

    public static Double getVariavel(Character registrador) {
        Double valor = registradores[getOffset(registrador)];
        if (valor == null) {
            throw new RegistradorNuloException(registrador);
        }
        return valor;
    }

    private static int getOffset(Character registrador) {
        return registrador - 'A';
    }
}
