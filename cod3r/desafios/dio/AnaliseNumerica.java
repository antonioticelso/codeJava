package desafios.dio;

import java.io.IOException;
import java.util.Scanner;

// (Analise de Numeros)
public class AnaliseNumerica {
  public static void main(String[] args) throws IOException {
    Scanner leitor = new Scanner(System.in);
    int par = 0;
    int impar = 0;
    int positivo = 0;
    int negativo = 0;
    int valor = Integer.parseInt(leitor.nextLine());

    for (int i = 0; i < 5; i++) {
      if (valor % 2 == 0) {
      	par++;
    	} else {
    	  impar++;
    	}        	
    	if (valor > 0) {
    	  positivo++;
      } else if (valor < 0) {
    	  negativo++;
      }
  
      if (i < 4) {
      	valor = Integer.parseInt(leitor.nextLine());
     	}
    }

    System.out.println(par + " valor(es) par(es)");
    System.out.println(impar + " valor(es) impar(es)");
    System.out.println(positivo + " valor(es) positivo(s)");
    System.out.println(negativo + " valor(es) negativo(s)");
  }
	
}