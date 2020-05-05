package desafios;

import java.util.Scanner;

public class Fahrenheit {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Qual a temperatura em Celsius: ");
        double tc = teclado.nextDouble();

        double tf = (1.8 * tc) + 32;

        System.out.printf("A temperatura em Fahrenheit é %.2f", tf);

        teclado.close();

    }
}


