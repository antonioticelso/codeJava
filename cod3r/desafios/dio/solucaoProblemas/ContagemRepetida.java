package desafios.dio.solucaoProblemas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class ContagemRepetida {

//	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
//	static PrintWriter out = new PrintWriter(System.out);

	public static void main(String[] args) throws IOException {

		// insira sua solução aqui
		Scanner scr = new Scanner(System.in);
		int valores = scr.nextInt();
		Map<Integer, Integer> numeros = new HashMap<>();

 //declare as variaveis corretamente e continue a sua solução

	 for (int i = 0; i < valores; i++) {
		 var numero = scr.nextInt();
 
		 if(numeros.containsKey(numero)) {
			 
		 } else {
			 
		 }
	 }

	 numeros.entrySet()
			 .stream()
			 .sorted(Map.Entry.comparingByKey())
			 .forEach(e -> System.out.println( + " aparece " +  + " vez(es)"));
			 
			 

	}

	// "_______________________________________________________________"

	// int qtd = Integer.parseInt(in.readLine());
	// String word;
	// String palavra = "";
	// String fernandaWord = "";
	// String marciaWord = "";

	// for (int i = 0; i < qtd; i++) {

	// 	word = in.readLine();
	// 	int pass = 0;
	// 	for (int k = 0; k < word.length(); k++) {
	// 		String letra = String.valueOf(word.charAt(k));

	// 		if (!letra.equals(" ")) {
	// 			palavra = palavra.concat(letra);
	// 		}
	// 		if (letra.equals(" ") || k == word.length() - 1) {
	// 			if (pass == 0) {
	// 				fernandaWord = palavra;
	// 				pass++;
	// 				palavra = "";
	// 			}
	// 			if (pass > 0) {
	// 				marciaWord = palavra;
	// 				palavra = "";
	// 			}
	// 		}
	// 	}

	// 	if (fernandaWord.equals(marciaWord)) {
	// 		System.out.println("empate");
	// 	}

	// 	if (fernandaWord.equals("pedra") && (marciaWord.equals("tesoura") || marciaWord.equals("lagarto"))) {
	// 		System.out.println("fernanda");
	// 	}
	// 	if (fernandaWord.equals("papel") && (marciaWord.equals("pedra") || marciaWord.equals("spock"))) {
	// 		System.out.println("fernanda");
	// 	}
	// 	if (fernandaWord.equals("tesoura") && (marciaWord.equals("papel") || marciaWord.equals("lagarto"))) {
	// 		System.out.println("fernanda");
	// 	}
	// 	if (fernandaWord.equals("spock") && (marciaWord.equals("tesoura") || marciaWord.equals("pedra"))) {
	// 		System.out.println("fernanda");
	// 	}
	// 	if (fernandaWord.equals("lagarto") && (marciaWord.equals("spock") || marciaWord.equals("papel"))) {
	// 		System.out.println("fernanda");
	// 	}

	// 	if (marciaWord.equals("pedra") && (fernandaWord.equals("tesoura") || fernandaWord.equals("lagarto"))) {
	// 		System.out.println("marcia");
	// 	}
	// 	if (marciaWord.equals("papel") && (fernandaWord.equals("pedra") || fernandaWord.equals("spock"))) {
	// 		System.out.println("marcia");
	// 	}
	// 	if (marciaWord.equals("tesoura") && (fernandaWord.equals("papel") || fernandaWord.equals("lagarto"))) {
	// 		System.out.println("marcia");
	// 	}
	// 	if (marciaWord.equals("spock") && (fernandaWord.equals("tesoura") || fernandaWord.equals("pedra"))) {
	// 		System.out.println("marcia");
	// 	}
	// 	if (marciaWord.equals("lagarto") && (fernandaWord.equals("spock") || fernandaWord.equals("papel"))) {
	// 		System.out.println("marcia");
	// 	}

	// }

	// out.close();



}
