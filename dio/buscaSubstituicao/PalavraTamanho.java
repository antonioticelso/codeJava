package desafios.dio.buscaSubstituicao;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class PalavraTamanho {

  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int line = Integer.parseInt(br.readLine());

    List<String> list = new ArrayList<>();

    for (int i = 0; i < line; i++) {
      var key = br.readLine();
      list.addAll(Arrays.stream(key.split(" ")).collect(Collectors.toList()));

      var listWord = list.stream()
          .sorted(Comparator.comparingInt(String::length).reversed().thenComparing(String::compareTo))
          .collect(Collectors.joining(" "));

      System.out.println(listWord);
      list.clear();

    }

  }

  // "_______________________________________________________________"

  // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  // StringTokenizer st = new StringTokenizer(br.readLine());

  // int linha = Integer.parseInt(st.nextToken());
  // int size = 0;

  // String texto;
  // String letra;
  // String palavra = "";
  // String pmenor = "";

  // ArrayList<String> listCompl = new ArrayList<String>();
  // Collection<String> countryNames = new
  // TreeSet<String>(Collator.getInstance());
  // ArrayList<String> listPalavra = new ArrayList<String>();

  // for (int k = 0; k < linha; k++) {
  // texto = br.readLine();
  // listCompl.add(texto);
  // }

  // for (int k = 0; k < listCompl.size(); k++) {
  // texto = listCompl.get(k);
  // for (int i = 0; i < texto.length(); i++) {
  // letra = String.valueOf(texto.charAt(i));
  // if (!letra.equals(" ")) {
  // palavra = palavra.concat(letra);
  // }
  // if (letra.equals(" ") || i == (texto.length() - 1)) {
  // countryNames.add(palavra);
  // palavra = "";
  // letra = " ";
  // }
  // }

  // for (String s : countryNames) {
  // listPalavra.add(s);
  // }

  // size = listPalavra.size();
  // for (int i = 0; i < size; i++) {
  // for (int j = size - 1; j > i; j--) {
  // if ( listPalavra.get(i).length() < listPalavra.get(j).length() ) {
  // pmenor = listPalavra.get(i);
  // listPalavra.set(i, listPalavra.get(j));
  // listPalavra.set(j, pmenor);
  // pmenor = "";
  // }
  // }
  // }

  // for (int i = 0; i < size; i++) {
  // System.out.print(listPalavra.get(i));
  // if (!(i == size - 1)) {
  // System.out.print(" ");
  // }
  // }

  // System.out.println();
  // countryNames.clear();
  // listPalavra.clear();

}
