package desafios;

import java.util.Scanner;

public class Bhaskara {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("---------- Formula de Bhaskara ----------");
        System.out.println("Informe o valor de 'A': ");
        double a = teclado.nextDouble();

        System.out.println("Informe o valor de 'B': ");
        double b = teclado.nextDouble();

        System.out.println("Informe o valor de 'C': ");
        double c = teclado.nextDouble();

        // double x1 = a 

        teclado.close();

    }

}

// ax2 + bx + c = 0
// a = 1
// b = 12
// c = -13
