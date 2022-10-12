package gft;

import java.util.Locale;
import java.util.Scanner;

public class LeiaCpf {

    public static void main(String[] args) {

        Locale.setDefault(new Locale("en", "US"));

        Scanner sc = new Scanner(System.in);

        String cpf = sc.nextLine();
        String ponto = ".";
        String barra = "-";

        for (int i = 0; i < cpf.length(); i++) {
            if (cpf.charAt(i) == ponto.charAt(0) || cpf.charAt(i) == barra.charAt(0)) {
                System.out.println();
                continue;
            }
            System.out.print(cpf.charAt(i));
        }

        sc.close();
    }

}
