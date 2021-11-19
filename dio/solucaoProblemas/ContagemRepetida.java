package desafios.dio.solucaoProblemas;

import java.io.IOException;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.Map.Entry;

public class ContagemRepetida {


	public static void main(String[] args) throws IOException {

		// insira sua solução aqui
		Scanner scr = new Scanner(System.in);
		int valores = scr.nextInt();
		int qtd = 1;

		TreeMap<Integer, Integer> numeros = new TreeMap<>();

		// declare as variaveis corretamente e continue a sua solução

		for (int i = 0; i < valores; i++) {
			int k;
			var numero = scr.nextInt();

			if (numeros.containsKey(numero)) {
				k = numeros.get(numero) + qtd;
				numeros.put(numero, k);

			} else {
				numeros.put(numero, qtd);

			}
		}

		// numeros.entrySet().stream().sorted(Map.Entry.comparingByKey())
		// .forEach(e -> System.out.println("" + " aparece " + "" + " vez(es)"));

		for (Entry<Integer, Integer> key : numeros.entrySet()) {
			System.out.println(key.getKey() + " aparece " + key.getValue() + " vez(es)");
		}
			 
			 

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
