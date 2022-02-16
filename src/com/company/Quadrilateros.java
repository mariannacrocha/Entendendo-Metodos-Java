package com.company;

public class Quadrilateros {

    //calculando área do quadrado
    public static void calculaArea (double lado) {

        System.out.println("A área do qudrado é " + (lado * lado));
    }

    //calculando área do retângulo
    public static void calculaArea(double lado1, double lado2) {
        System.out.println("A área do retângulo é " + (lado1 * lado2));
    }

    //calculando área do trapézio
    public static void calculaArea(double baseMaior, double baseMenor, double altura) {
        System.out.println("A área do trapézio é " + ((baseMaior+baseMenor)*altura/2));
    }
}
