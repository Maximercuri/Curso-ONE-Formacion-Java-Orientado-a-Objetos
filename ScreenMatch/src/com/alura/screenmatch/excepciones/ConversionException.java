package com.alura.screenmatch.excepciones;

public class ConversionException extends RuntimeException {
    String mensaje;

    public ConversionException(String mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public String getMessage() {
        return this.mensaje;
    }
}
