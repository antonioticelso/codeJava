package desafios;

import java.util.Scanner;

public class Celsius {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Qual a temperatura em Fahrenheit: ");
        double tf = teclado.nextDouble();

        double tc = (tf - 32) / 1.8;
    
        System.out.printf("A temperatura em Celsius é %.2f", tc);

        teclado.close();
    
    }
    

}


