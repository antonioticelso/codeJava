package cloudFullStack;

import java.util.Scanner;

public class TempoDownload {

    public static void main(String[] Args) {

        Scanner sc = new Scanner(System.in);

        double tamanhoMB = sc.nextFloat();
        double velocidadeMbps = sc.nextFloat();
        double tempoDownload = Math.ceil((tamanhoMB / velocidadeMbps) / 60);

        System.out.println(tamanhoMB);
        System.out.printf("%.2f", tempoDownload);
        System.out.println(velocidadeMbps);
        System.out.println(tempoDownload);

        //TODO: Imprima o calculo do tempo, leve em consideração que a saída é um numero com duas casas decimais:

    }

}
