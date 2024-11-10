package jwa.comandos.menu;

import jwa.utils.StringUtils;

import java.util.Arrays;

public class ParametrosInsuficientesException extends RuntimeException {
    public ParametrosInsuficientesException(String comando, String... nomeDosParametros) {
        super(String.format(
                "[ERRO] Um ou mais parâmetros não estão corretos. Tente novamente dessa forma:\n> %s %s",
                comando.toUpperCase(),
                String.join(
                        StringUtils.ESPACO,
                        Arrays
                        .stream(nomeDosParametros)
                        .map((parametro) -> "<" + parametro + ">").toList()
                )
        ));
    }
}
