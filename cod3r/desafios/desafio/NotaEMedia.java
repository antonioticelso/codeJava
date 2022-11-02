package desafio;

import java.util.Scanner;

public class NotaEMedia {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe a quantidade de notas: ");
        int qtdNotas = teclado.nextInt();
        double notasAluno[] = new double[qtdNotas];

        double totalAluno = 0;
        for (int i = 0; i < notasAluno.length; i++) {
            System.out.println("Informe a " + (i + 1) + "º nota: ");
            notasAluno[i] = teclado.nextDouble();
        }

        for (double notas: notasAluno) {
            totalAluno += notas;
        }

        double media = totalAluno / notasAluno.length;
        System.out.println("A media do Aluno e: " + media + " !");

        teclado.close();

    }

}


