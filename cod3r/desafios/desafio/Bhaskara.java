package desafio;

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

        double delta = (b * b) - (4 * a * c);
        double x1 = ((-b) + Math.sqrt(delta)) / (2 * a);
        double x2 = ((-b) - Math.sqrt(delta)) / (2 * a);

        System.out.printf("X' = %.2f \n X'' = %.2f", x1, x2);

        teclado.close();

    }

}

// ax2 + bx + c = 0
// a = 1
// b = 12
// c = -13
