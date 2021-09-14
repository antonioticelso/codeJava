package desafios.dio;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.Collator;
import java.io.IOException;
import java.util.Collection;
import java.util.TreeSet;

// (Compras no Supermercado)
public class ComprarSupermercado {
  public static void main(String[] args) throws IOException {
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int qtd = Integer.parseInt(br.readLine());
    Collection<String> list = new TreeSet<String>(Collator.getInstance());
    // SortedSet<String> list = new TreeSet<String>();

    String texto;
    String palavra = "";

    texto = (String) (br.readLine() + " ");
    
    for ( int i = 0; i < qtd; i++) {
      
      for (int k = 0; k < texto.length(); k++) {
        String letra = String.valueOf(texto.charAt(k));
        if (letra.equals(" ")) {
          list.add(palavra);
          palavra = "";
        }
        palavra = palavra.concat(letra);
  
      }

      for (String k : list) {
        System.out.print(k + " ");
      }
      if (i == qtd) {
        break;
      }
      list.clear();
      System.out.println();
      texto = (String) (br.readLine() + " ");
    }

  }
}