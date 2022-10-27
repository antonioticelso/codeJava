package gft;

import java.util.Scanner;

public class CalculoViagem {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        int horas = scan.nextInt();
        int velocidade = scan.nextInt();

        System.out.printf("%.3f\n", (velocidade   * horas  )/12.0);

    }

}
