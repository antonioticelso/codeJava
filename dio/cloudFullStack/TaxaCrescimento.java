package cloudFullStack;

import java.util.Scanner;

public class TaxaCrescimento {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double populacaoA = input.nextInt();
        double populacaoB = input.nextInt();
        int anos = 0;
        double crescimentoA;
        double crescimentoB;

        do {
            anos++;
            crescimentoA = populacaoA * (3.0 / 100);
            populacaoA += crescimentoA;
            crescimentoB = populacaoB * (1.5 / 100);
            populacaoB += crescimentoB;

        } while (populacaoA <= populacaoB);

        System.out.println(anos + " anos");

    }

}
