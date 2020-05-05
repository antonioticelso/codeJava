package desafios;

import java.util.Scanner;


public class Triangulo {

public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    System.out.println("Informe a base do triangulo: ");
    double base = teclado.nextDouble();

    System.out.println("Informe a altura do triangulo: ");
    double altura = teclado.nextDouble();

    double resultado = (base * altura) / 2;

    System.out.printf("A área do triangulo é %.2f", resultado);

    teclado.close();

}

}


