import java.text.Collator;
import java.util.Collection;
import java.util.TreeSet;

public class ArrayListDio {
  public static void main(String[] args) {

    int qtd = 2;
    Collection<String> list = new TreeSet<String>(Collator.getInstance());
    // SortedSet<String> list = new TreeSet<String>();

    String texto;
    String palavra = "";

    texto = "carne laranja suco picles laranja picles" + " ";
    
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
      texto = "laranja pera laranja pera pera" + " ";
    }


  }
}

