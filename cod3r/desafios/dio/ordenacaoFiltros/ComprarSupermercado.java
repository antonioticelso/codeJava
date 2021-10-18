package desafios.dio.ordenacaoFiltros;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

// (Compras no Supermercado)
public class ComprarSupermercado {
  public static void main(String[] args) throws IOException {

    Scanner scr = new Scanner(System.in);
    String produtos;

    List<List<String>> listaProdutos = new ArrayList<>() {

      private static final long serialVersionUID = 1L;

      @Override
      public String toString() {

        StringBuilder stb = new StringBuilder();

        for (int i = 0; i < this.size(); i++) {

          stb.append(this.get(i) + " ");

        }

        return stb.toString();

      }

    };

    Set<String> set = new TreeSet<>();

    int N = scr.nextInt();

    scr.nextLine();

    for (int i = 0; i < N; i++) {

      produtos = scr.nextLine();
      String[] produto = produtos.split(" ");

      for (int j = 0; j < produto.length; j++) {

        set.add(produto[j].toLowerCase());

      }

      List<String> listaP = new ArrayList<>() {

        private static final long serialVersionUID = 1L;

        @Override
        public String toString() {

          StringBuilder stb = new StringBuilder();

          for (int i = 0; i < this.size(); i++) {

            stb.append(this.get(i) + " ");

          }

          return stb.toString();

        }

      };

      Iterator<String> iterator = set.iterator();

      while (iterator.hasNext()) {

        listaP.add(iterator.next());

      }

      listaProdutos.add(listaP);
      set.clear();

    }

    listaProdutos.forEach(System.out::println);
    scr.close();

    // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    // int qtd = Integer.parseInt(br.readLine());
    // Collection<String> list = new TreeSet<String>(Collator.getInstance());
    // // SortedSet<String> list = new TreeSet<String>();

    // String texto;
    // String palavra = "";

    // texto = (String) (br.readLine() + " ");

    // for ( int i = 0; i < qtd; i++) {

    // for (int k = 0; k < texto.length(); k++) {
    // String letra = String.valueOf(texto.charAt(k));
    // if (letra.equals(" ")) {
    // list.add(palavra);
    // palavra = "";
    // }
    // palavra = palavra.concat(letra);

    // }

    // for (String k : list) {
    // System.out.print(k + " ");
    // }
    // if (i == qtd) {
    // break;
    // }
    // list.clear();
    // System.out.println();
    // texto = (String) (br.readLine() + " ");
    // }

  }
}