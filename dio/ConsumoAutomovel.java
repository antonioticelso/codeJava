package desafios.dio;

import java.io.IOException;
import java.util.Scanner;

// (Consumo medio do automovel)
public class ConsumoAutomovel {
	
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);

        //declare as variaveis corretamente
        int quilometro = leitor.nextInt();
        double  litro = leitor.nextDouble();

        double media =  quilometro / litro;  //insira as variaveis de acordo com o enunciado
        System.out.println(String.format("%.3f km/l", media ));   
    }
	
}