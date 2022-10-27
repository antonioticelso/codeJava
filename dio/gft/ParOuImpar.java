package gft;

import java.io.IOException;
import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);

        int pares = 0;
        int impares = 0;
        int positivos = 0;
        int negativos = 0;
        int test = 0;

        for (int i = 0; i < 5; i++) {
            test = leitor.nextInt();
            System.out.println(test);
            if (test == 0) {
                pares++;
                continue;
            }
            if (test < 0) {
                negativos++;
            } else {
                positivos++;
            }
            if (test % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }

        System.out.println(pares + " par(es)");
        System.out.println(impares + " impar(es)");
        System.out.println(positivos + " positivo(s)");
        System.out.println(negativos + " negativo(s)");
    }

}
