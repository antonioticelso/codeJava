package desafios.dio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class MovimentarFila {

  static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
  static PrintWriter out = new PrintWriter(System.out);

  public static void main(String[] args) throws IOException {
    String request = "";
    String letra = "";
    String pass = "";

    int pont = 0;
    int size = 0;
    int first = 0;
    int last = 0;
    int notGo = 0;

    List<Integer> list = new ArrayList<Integer>();
    List<Integer> listOrder = new ArrayList<Integer>();

    // quantas vezes
    pont = toInt(read());
    
    while ( pont > 0 ) {
      pont--;
      // quantos clientes
      size = toInt(read());

      request = read();

      for (int i = 0; i < request.length(); i++) {
        letra = String.valueOf(request.charAt(i));
        if (letra.equals(" ")) {
          list.add(Integer.parseInt(pass));
          pass = "";
        } else {
          pass = pass.concat(letra);
        }
        if ( (i + 1) == request.length()) {
          list.add(Integer.parseInt(pass));
          pass = "";
        }
      }
      
      for (int i = 0; i < list.size(); i++) {
        first = list.get(i);
        if ( i == (list.size() - 1) ) {
          listOrder.add(first);
        }

        if (!( (i + 1) == list.size() )) {
          last = list.get((i + 1));
          
          if (first > last) {
            listOrder.add(first);
          }
          if (first < last) {
            listOrder.add(last);
            listOrder.add(first);
            i++;
          }
        }
        
      }
      for (int i = 0; i < list.size(); i ++) {
        if (list.get(i) == listOrder.get(i)) {
          notGo++;
        }
      }
      System.out.println(notGo);
      list.clear();
      listOrder.clear();
      notGo = 0;

    }
    
    out.close();
  }

  private static String read() throws IOException {
    return in.readLine();
  }

  private static int toInt(String s) {
    return Integer.parseInt(s);
  }
}

