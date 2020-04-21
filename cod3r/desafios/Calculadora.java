package desafios;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        double n1 = teclado.nextDouble();

        System.out.println("Digite a operação: [+] [-] [*] [/] [%]");

        String op = teclado.nextLine();

        System.out.println("Digite um valor: ");
        double n2 = teclado.nextDouble();

        double resultado = "+".equals(op) ? n1 + n2 : 0;
        resultado = "-".equals(op) ? n1 - n2 : resultado;
        resultado = "*".equals(op) ? n1 * n2 : resultado;
        resultado = "/".equals(op) ? n1 / n2 : resultado;
        resultado = "%".equals(op) ? n1 % n2 : resultado;

        System.out.printf("%.2f %s %.2f = %.2f ", n1, op, n2, resultado);
        
        teclado.close();
    
    }
}


