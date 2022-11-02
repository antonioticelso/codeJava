package cloudFullStack;

import java.util.Scanner;

public class AnoBissexto {

    public static void main(String[] args){
        Scanner ent = new Scanner(System.in);
        int ano = ent.nextInt();

        if (ano % 4 == 0) {
            if (ano % 100 == 0) {
                if (ano % 400 == 0) {
                    System.out.println("Bissexto");
                } else {
                    System.out.println(" Nao Bissexto");
                }
            } else {
                System.out.println("Bissexto");
            }
        }


        if (ano % 4 == 0 && ano % 100 != 0)
            System.out.println("Bissexto");
        if (ano % 4 == 0 && ano % 100 == 0 && ano % 400 == 0)
            System.out.println("Bissexto");
        else System.out.println("Nao Bissexto");




    }

}
