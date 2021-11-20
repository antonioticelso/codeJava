import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Weblogger {

	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter out = new PrintWriter(System.out);

	public static void main(String[] args) throws IOException {

		// insira sua solução aqui
		String word = "";
		String texto = "";

		int pass1 = 0;
		int pass2 = 0;
		
		while ((word = in.readLine()) != null) {
			for (int k = 0; k < word.length(); k++) {
				String letra = String.valueOf(word.charAt(k));
				
				if (letra.equals("_")) {
					if (pass1 == 0) {
						texto = texto.concat("<i>");
						pass1++;
						continue;
					} else {
						texto = texto.concat("</i>");
						pass1 = 0;
						continue;
					}
				}
				if (letra.equals("*")) {
					if (pass2 == 0) {
						texto = texto.concat("<b>");
						pass2++;
						continue;
					} else {
						texto = texto.concat("</b>");
						pass2 = 0;
						continue;
					}
				}
				if (!letra.equals("_") || !letra.equals("*")) {
					texto = texto.concat(letra);
				}
			}
			
			System.out.println(texto);
			texto = "";
		}
		
		out.close();

	}

	// "_______________________________________________________________"
    
	// Scanner scr = new Scanner(System.in);
    // String linha;
        
    // while(scr.hasNextLine()) {
    //   linha = scr.nextLine();
    //   boolean inicio = true;
    
    //   while (linha.contains("_") || linha.contains("*")) {
    //     if (linha.contains("_") && inicio) {
    //       linha = linha.replaceFirst("_", "<i>");
    //       inicio = false;
    //     } else if (linha.contains("_") && !inicio) {
    //       linha = linha.replaceFirst("_", "</i>");
    //       inicio = true;
    //     } else if (linha.contains("*") && inicio) {
    //       linha = linha.replaceFirst("\\*", "<b>");
    //       inicio = false;
    //     } else if (linha.contains("*") && !inicio) {
    //       linha = linha.replaceFirst("\\*", "</b>");
    //       inicio = true;
    //     }
    //   }
            
    //   System.out.println(linha);
    // }


}
