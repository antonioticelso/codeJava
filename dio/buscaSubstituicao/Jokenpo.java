import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Jokenpo {

	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter out = new PrintWriter(System.out);

	public static void main(String[] args) throws IOException {

		// insira sua solução aqui
		int qtd = Integer.parseInt(in.readLine());
		String word;
		String palavra = "";
		String fernandaWord = "";
		String marciaWord = "";

		for (int i = 0; i < qtd; i++) {

			word = in.readLine();
			int pass = 0;
			for (int k = 0; k < word.length(); k++) {
				String letra = String.valueOf(word.charAt(k));

				if (!letra.equals(" ")) {
					palavra = palavra.concat(letra);
				}
				if (letra.equals(" ") || k == word.length() - 1) {
					if (pass == 0) {
						fernandaWord = palavra;
						pass++;
						palavra = "";
					}
					if (pass > 0) {
						marciaWord = palavra;
						palavra = "";
					}
				}
			}

			if (fernandaWord.equals(marciaWord)) {
				System.out.println("empate");
			}

			if (fernandaWord.equals("pedra") && (marciaWord.equals("tesoura") || marciaWord.equals("lagarto"))) {
				System.out.println("fernanda");
			}
			if (fernandaWord.equals("papel") && (marciaWord.equals("pedra") || marciaWord.equals("spock"))) {
				System.out.println("fernanda");
			}
			if (fernandaWord.equals("tesoura") && (marciaWord.equals("papel") || marciaWord.equals("lagarto"))) {
				System.out.println("fernanda");
			}
			if (fernandaWord.equals("spock") && (marciaWord.equals("tesoura") || marciaWord.equals("pedra"))) {
				System.out.println("fernanda");
			}
			if (fernandaWord.equals("lagarto") && (marciaWord.equals("spock") || marciaWord.equals("papel"))) {
				System.out.println("fernanda");
			}

			if (marciaWord.equals("pedra") && (fernandaWord.equals("tesoura") || fernandaWord.equals("lagarto"))) {
				System.out.println("marcia");
			}
			if (marciaWord.equals("papel") && (fernandaWord.equals("pedra") || fernandaWord.equals("spock"))) {
				System.out.println("marcia");
			}
			if (marciaWord.equals("tesoura") && (fernandaWord.equals("papel") || fernandaWord.equals("lagarto"))) {
				System.out.println("marcia");
			}
			if (marciaWord.equals("spock") && (fernandaWord.equals("tesoura") || fernandaWord.equals("pedra"))) {
				System.out.println("marcia");
			}
			if (marciaWord.equals("lagarto") && (fernandaWord.equals("spock") || fernandaWord.equals("papel"))) {
				System.out.println("marcia");
			}

		}

		out.close();

	}

	// "_______________________________________________________________"

	// public static void main(String[] args) {
	// 	Scanner scr = new Scanner(System.in);
	// 	int casos = scr.nextInt();

	// 	scr.nextLine();
	// 	List<Regra> regras = new ArrayList<>();
	// 	regras.add(new Regra("tesoura", "papel"));
	// 	regras.add(new Regra("papel", "pedra"));
	// 	regras.add(new Regra("pedra", "lagarto"));
	// 	regras.add(new Regra("lagarto", "spock"));
	// 	regras.add(new Regra("spock", "tesoura"));
	// 	regras.add(new Regra("tesoura", "lagarto"));
	// 	regras.add(new Regra("lagarto", "papel"));
	// 	regras.add(new Regra("papel", "spock"));
	// 	regras.add(new Regra("spock", "pedra"));
	// 	regras.add(new Regra("pedra", "tesoura"));

	// 	for (int i = 0; i < casos; i++) {
	// 		List<String> palavras = Arrays.asList(scr.nextLine().split(" "));
	// 		if (palavras.get(0).equals(palavras.get(1))) {
	// 			System.out.println("empate");
	// 		} else {
	// 			boolean primeiro = false;
	// 			for (Regra r : regras) {
	// 				if (r.getVence().equals(palavras.get(0)) && r.getPerde().equals(palavras.get(1))) {
	// 					primeiro = true;
	// 					break;
	// 				}
	// 			}

	// 			if (primeiro) {
	// 				System.out.println("fernanda");
	// 			} else {
	// 				System.out.println("marcia");
	// 			}
	// 		}
	// 	}
	// }

	// public static class Regra {
	// 	private String vence;
	// 	private String perde;

	// 	public Regra(String vence, String perde) {
	// 		this.vence = vence;
	// 		this.perde = perde;
	// 	}

	// 	public String getVence() {
	// 		return vence;
	// 	}

	// 	public void setVence(String vence) {
	// 		this.vence = vence;
	// 	}

	// 	public String getPerde() {
	// 		return perde;
	// 	}

	// 	public void setPerde(String perde) {
	// 		this.perde = perde;
	// 	}
	// }

}
