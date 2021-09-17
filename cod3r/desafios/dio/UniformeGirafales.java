package desafios.dio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.TreeSet;

public class UniformeGirafales {

  static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
  static PrintWriter out = new PrintWriter(System.out);

  public static void main(String[] args) throws IOException {
    String l;
    String owner = "";
    String color = "";
    String size = "";
    String detail = "";
    String request = "";
    String letra = "";

    int repeat;
    int pont = 0;

    repeat = toInt(read());

    Collection<String> list = new TreeSet<String>(Collator.getInstance());
    List<String> listOrder = new ArrayList<String>();

    while (!(l = read()).equals("0")) {
      pont++;

      if (pont % 2 == 1) {
        owner = l;
        continue;
      }

      if (pont % 2 == 0) {
        for (int k = 0; k < l.length(); k++) {
          letra = String.valueOf(l.charAt(k));
          if (letra.equals(" ")) {
            size = String.valueOf(l.charAt(k + 1));

            if (size.equals("P")) {
              list.add(color + " a " + owner);
            }
            if (size.equals("M")) {
              list.add(color + " b " + owner);
            }
            if (size.equals("G")) {
              list.add(color + " c " + owner);
            }

            size = "";
            color = "";
            owner = "";
            letra = "";
            break;
          }
          color = color.concat(letra);

        }

      }

    }

    for (String i : list) {
      detail = i;
      for (int k = 0; k < detail.length(); k++) {
        letra = String.valueOf(detail.charAt(k));
        if (letra.equals(" ")) {
          size = String.valueOf(detail.charAt(k + 1));
          if (size.equals("a")) {
            request = request.concat(" P ");
            k += 2;
          }
          if (size.equals("b")) {
            request = request.concat(" M ");
            k += 2;
          }
          if (size.equals("c")) {
            request = request.concat(" G ");
            k += 2;
          }
        }

        request = request.concat(letra);
      }
      listOrder.add(request);
      request = "";
      size = "";
      letra = "";
      detail = "";
    }

    for (int j = 0; j < repeat; j++) {
      System.out.println(listOrder.get(j));
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

class Tshirt {

  private String size;
  private String color;
  private String owner;

  public Tshirt(String size, String color, String owner) {
    this.size = size;
    this.color = color;
    this.owner = owner;
  }

  public String getSize() {
    return size;
  }

  public void setSize(String size) {
    this.size = size;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public String getOwner() {
    return owner;
  }

  public void setOwner(String owner) {
    this.owner = owner;
  }

  @Override
  public String toString() {
    return this.getColor() + " " + this.getSize() + " " + this.getOwner();
  }
}
