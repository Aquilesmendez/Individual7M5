package com.example.individual7m5;

public class Presentador {
    private Modelo modelo;
    private Vista vista;

    public Presentador(Modelo modelo, Vista vista) {
        this.modelo = modelo;
        this.vista = vista;
    }

    public void validarContrasena(String contrasena) {
        int fortaleza = modelo.validarContrasena(contrasena);
        vista.mostrarFortalezaContrasena(fortaleza);
    }
}
