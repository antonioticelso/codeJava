import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class MaiorSubstring {

  // static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
  // static PrintWriter out = new PrintWriter(System.out);

  public static void main(String[] args) throws IOException {
    
    Scanner scr = new Scanner(System.in);
    String palavra1;
    String palavra2;

    while (scr.hasNextLine()) {
      palavra1 = scr.nextLine();
      palavra2 = scr.nextLine();
      int tamanhoMax = 0;

      if (palavra2.length() > palavra1.length()) {
        String maiorPalavra = palavra2;
        palavra2 = palavra1;
        palavra1 = maiorPalavra;
      }

      for (int i = 0; i < palavra2.length(); i++) {
        for (int j = 0; j < i + 1; j++) {
          if (palavra1.contains(palavra2.substring(j, palavra2.length() - i + j))) {
            tamanhoMax = Math.max(tamanhoMax, palavra2.length() - i);
          }
        }
      }

      System.out.println(tamanhoMax);
    }


  }

  // "_______________________________________________________________"

    // String first, m, n, last; //declare suas variaveis aqui
    
    // String primeira = "";
    // String segunda = "";
    // String letraA = "";
    // String letraB = "";
    
    // int ponto = 0;
    // int corte = 0;
    // int pontoI = 0;
    // int pontoJ = 0;
    
    // boolean primIqualdade = true;
    // boolean validated = false;
    
    // while ((primeira = in.readLine()) != null) { // complete seu código
    //   segunda = in.readLine();
      
    //   for (int i = 0; i < primeira.length(); i++) {
    //     for (int j = corte; j < segunda.length(); j++) {
    //       letraA = String.valueOf( primeira.charAt(i));
    //       letraB = String.valueOf(segunda.charAt(j));
          
    //       validated = letraA.equals(letraB);
          
    //       if (validated && primIqualdade) {
    //         ponto++;
    //         corte = j + 1;
    //         primIqualdade = false;
    //         pontoI = i + 1;
    //         pontoJ = j + 1;
    //       }
    //       if (validated && pontoI == i && pontoJ == j) {
    //         ponto++;
    //         corte = j + 1;
    //         pontoI = i + 1;
    //         pontoJ = j + 1;
    //       } else {
    //         validated = false;
    //         break;
    //       }
    //       validated = false;
    //     }
    //   }
    //   System.out.println(primeira);
    //   System.out.println(segunda);
    //   System.out.println(ponto);
      
    //   ponto = 0;
    //   pontoI = 0;
    //   pontoJ = 0;
    // }
    
    // out.close();


    // String primeira;
    // String segunda;
    // String maior;

    // int join = 0;

    // while ((primeira = in.readLine()) != null) { // complete seu código
    // segunda = in.readLine();

    // if (primeira.length() < segunda.length()) {
    // maior = segunda;
    // segunda = primeira;
    // primeira = maior;
    // }

    // for (int i = 0; i < segunda.length(); i++) {

    // for (int j = 0; j < (i + 1); j++) {
    // if (primeira.contains(segunda.substring(j, segunda.length() - i + j))) {
    // join = Math.max(join, segunda.length() - i);
    // }

    // }
    // }
    // System.out.println(primeira);
    // System.out.println(segunda);

    // System.out.println(join);
    // }

    // out.close();
}
