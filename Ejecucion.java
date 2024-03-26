package org.example.CalculadoraBasica;


public class Ejecucion {
    public static void main(String[] args){
        float resSuma = Calculadora.sumar(5,3);
        System.out.println("Suma: " + resSuma);
        double resResta = Calculadora.restar(5, 3);
        System.out.println("Resta: " + resResta);
        double resMultiplicacion = Calculadora.multiplicar(5, 3);
        System.out.println("Multiplicación: " + resMultiplicacion);
        double resDivision = Calculadora.dividir(6, 3);
        System.out.println("División: " + resDivision);
    }
}

