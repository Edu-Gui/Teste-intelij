package br.com.dio.calculadora;

import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a,b;

        System.out.println("digite o valor de A");
        a= scan.nextInt();
        System.out.println("digite o valor de B");
        b= scan.nextInt();

        int somar = somar(a, b);
        int subtrair = subtrair(a, b);
        int multiplicar = multiplicar(a, b);
        double dividir = dividir(a, b);
        System.out.println("somar =" + somar);
        System.out.println("subtração =" + subtrair);
        System.out.println("multiplicação =" + multiplicar);
        System.out.println("divisão =" + dividir);
    }
    public static int somar (int a, int b){
        return a + b;
    }
    public static int subtrair (int a, int b){
        return a - b;
    }
    public static int multiplicar (int a, int b){
        return a * b;
    }
    public static double dividir (int a, int b){
        return a / b;
    }
}
