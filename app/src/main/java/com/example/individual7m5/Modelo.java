package com.example.individual7m5;

public class Modelo {
    public int validarContrasena(String contrasena) {
        // Validar la longitud de la contraseña
        if (contrasena.length() < 5) {
            return 0; // Debil: La contraseña es demasiado corta
        }

        // Validar que la contraseña contenga al menos una letra mayúscula
        boolean contieneMayuscula = false;
        for (int i = 0; i < contrasena.length(); i++) {
            if (Character.isUpperCase(contrasena.charAt(i))) {
                contieneMayuscula = true;
                break;
            }
        }

        // Verificar fortaleza de la contraseña
        if (!contieneMayuscula) {
            return 1; // Media: La contraseña tiene 5 o más caracteres pero no contiene mayúsculas
        } else {
            return 2; // Fuerte: La contraseña tiene 5 o más caracteres y contiene mayúsculas
        }
    }
}
