package com.tarea2.app;

public class Main {
    public static void main(String[] args) {
        imprimirCaracteres("Hola Mundo", 0);
    }

    public static void imprimirCaracteres(String cadena, int indice) {
        if (indice < cadena.length()) {
            System.out.println(cadena.charAt(indice));
            imprimirCaracteres(cadena, indice + 1);
        }
    }
}
