package gft;

import java.io.IOException;
import java.util.Scanner;

public class Multiplos {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);

        int pont1  = leitor.nextInt();
        int pont2  = leitor.nextInt();

        if (pont1 < 0) {
            pont1 = pont1 * -1;
        }
        if (pont2 < 0) {
            pont2 = pont2 * -1;
        }

        if ( pont1 < pont2) {
            if (pont2 % pont1 == 0) {
                System.out.println("Sao Multiplos");
            } else {
                System.out.println("Nao sao Multiplos");
            }
        } else {
            if (pont1 % pont2 == 0) {
                System.out.println("Sao Multiplos");
            } else {
                System.out.println("Nao sao Multiplos");
            }

        }

    }

}
