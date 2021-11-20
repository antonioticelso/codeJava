import java.io.IOException;
import java.util.Scanner;

public class VogalExtraterrestre {

	public static void main(String[] args) throws IOException {

		// insira sua solução aqui
		Scanner scr = new Scanner(System.in);
		String palavra1;
		String palavra2;

		while (scr.hasNextLine()) {
			palavra1 = scr.nextLine();
			palavra2 = scr.nextLine();
			int tamanhoMax = 0;

			if (palavra2.length() < palavra1.length()) {
				String menorPalavra = palavra2;
				palavra2 = palavra1;
				palavra1 = menorPalavra;
			}

			for (int i = 0; i < palavra1.length(); i++) {
				for (int j = 0; j < palavra2.length(); j++) {
					if (palavra1.charAt(i) == palavra2.charAt(j)) {
						tamanhoMax++;
					}
				}
			}

			System.out.println(tamanhoMax);
		}


	}

	// "_______________________________________________________________"


}
