package desafio;

import java.util.Scanner;

public class CuboQuadrado {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe um numero: ");
        double n1 = teclado.nextDouble();
    
        System.out.println("Você quer o quadrado [2] ou o cubo [3]: ");
        double n2 = teclado.nextDouble();

        double resultado = "2".equals(n2) ? n1 * n1: 0;
        resultado = "3".equals(n2) ? n1 * n1 * n1 : resultado;

        if (n2 == 2) {
            System.out.printf("O quadrado de %.2f é %.2f", n1, resultado);
        } else if (n2 == 3) {
            System.out.printf("O cubo de %.2f é %.2f", n1, resultado);
        } else {
            System.out.printf("O valor informado %.2f não é contemplado essa aplicação.", n2);
        }

        teclado.close();
    }

}


