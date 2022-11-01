package cloudFullStack;

import java.util.Scanner;

public class LojaDeTintas {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int areaCoberta = scanner.nextInt();
        double litroTinta = areaCoberta / 6;
        double valorLata = 80.00;
        double valorGalao = 25.00;
        double litroLata = 18.00;
        double litroGalao = 3.60;

        double quantidadeLatas = Math.ceil( litroTinta / litroLata);
        double quantidadeGaloes = Math.ceil(litroTinta / litroGalao);

        System.out.println("Quantidade(s) de lata(s) de tinta necessaria(s): " + (int) quantidadeLatas + " no valor R$ "  + quantidadeLatas * valorLata );
        System.out.println("Quantidade(s) de galao(oes) de tinta necessaria(s): " + (int) quantidadeGaloes + " no valor R$ "  + quantidadeGaloes * valorGalao);
    }

}
