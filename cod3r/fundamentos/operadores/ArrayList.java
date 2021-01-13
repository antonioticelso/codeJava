package fundamentos.operadores;

import java.util.Arrays;

public class ArrayList {
    public static void main(String[] args) {
        double notasAlunoA[] = new double[4];
        System.out.println(Arrays.toString(notasAlunoA));

        notasAlunoA[0] = 7.9;
        notasAlunoA[1] = 8.2;
        notasAlunoA[2] = 6.5;
        notasAlunoA[3] = 9;

        System.out.println(Arrays.toString(notasAlunoA));
        System.out.println(notasAlunoA[0]);
        System.out.println(notasAlunoA[notasAlunoA.length - 1]);

        double totalAlunoA = 0;
        for (int i = 0; i < notasAlunoA.length; i++) {
            totalAlunoA += notasAlunoA[i];
        }
        System.out.println(totalAlunoA / notasAlunoA.length);

        final double notaArmazenada = 7.5;
        double[] notasAlunoB = {6.9, 8.9, notaArmazenada, 9};

        double totalAlunoB = 0;
        for (int i = 0; i < notasAlunoB.length; i++) {
            totalAlunoB += notasAlunoB[i];
        }

        System.out.println(totalAlunoB / notasAlunoB.length);

    }
}

