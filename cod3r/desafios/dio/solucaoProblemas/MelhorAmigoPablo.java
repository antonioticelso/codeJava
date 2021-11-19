package desafios.dio.solucaoProblemas;

import java.io.IOException;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.Map.Entry;

public class MelhorAmigoPablo {

	public static void main(String[] args) throws IOException {

		String p[] = {"Joao NAO", "Carlos SIM", "Abner NAO", "Samuel SIM", "Ricardo NAO", "Abhay SIM", "Samuel SIM", "Andres SIM",
		"Roberto NAO", "Carlos SIM", "Samuel SIM", "Samuel SIM", "Abhay SIM", "Aline SIM", "Andres SIM", "FIM"}

		// Scanner scr = new Scanner(System.in);
		String word;
		String name = "";
		String pass = "";
		String vencedor = "";
		int qtd = 1;

		TreeMap<String, Integer> friends = new TreeMap<>();
		TreeMap<String, Integer> friendsNot = new TreeMap<>();

		for (int i = 0; i < p.length; i++) {
			word = p[i];
		// }
		// while (scr.hasNextLine()) {
		// 	word = scr.nextLine();
			if (word.equalsIgnoreCase("fim")) {
			  break;
			}
			
			for (int k = 0; k < word.length(); k++) {
				String letra = String.valueOf(word.charAt(k));
				
				if (letra.equals(" ") || k == word.length() - 1) {
					name = word.substring(0, k);
					pass = word.substring(k + 1, word.length());
					if (!name.equalsIgnoreCase("pablo") && pass.equalsIgnoreCase("sim") && !friends.containsKey(name)) {
					  if (vencedor.isEmpty()) {
					    vencedor = name;
					  }
						friends.put(name, qtd);
					}
					if (!name.equalsIgnoreCase("pablo") && pass.equalsIgnoreCase("nao") && !friends.containsKey(name)) {
						friendsNot.put(name, qtd);
					}
					break;
				}

			}

		}
		
		for (Entry<String, Integer> key : friends.entrySet()) {
			System.out.println(key.getKey());
		}
		for (Entry<String, Integer> key : friendsNot.entrySet()) {
			System.out.println(key.getKey());
		}
		System.out.println();
		System.out.println("Amigo do Pablo:");
		System.out.println(vencedor);
		
		
		

		// Scanner scr = new Scanner(System.in);
		// String palavra1;
		// String palavra2;
		//
		// while (scr.hasNextLine()) {
		// palavra1 = scr.nextLine();
		// palavra2 = scr.nextLine();
		// int tamanhoMax = 0;
		//
		// if (palavra2.length() < palavra1.length()) {
		// String menorPalavra = palavra2;
		// palavra2 = palavra1;
		// palavra1 = menorPalavra;
		// }
		//
		// for (int i = 0; i < palavra1.length(); i++) {
		// for (int j = 0; j < palavra2.length(); j++) {
		// if (palavra1.charAt(i) == palavra2.charAt(j)) {
		// tamanhoMax++;
		// }
		// }
		// }
		//
		// System.out.println(tamanhoMax);
		// }

	}

	// "_______________________________________________________________"

}
