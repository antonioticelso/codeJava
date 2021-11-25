package ordenacaoFiltros;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;

public class MovimentarFila {

  private Integer smsNumber;

  public MovimentarFila(int smsNumber) {
      this.smsNumber = smsNumber;
  }

  public int getSmsNumber() {
    return this.smsNumber;
  }

  public static void main(String[] args) throws IOException {

    Scanner scanner = new Scanner(System.in);
    int N = scanner.nextInt();
    scanner.nextLine();
    int peopleOnQueue;
    ArrayList<Integer> currentQueue = new ArrayList<>();
    HashMap<Integer, Integer> numToIndexOriginal = new HashMap<>();
    int currentSmsNumber;
    int numSwitches;

    for (int i = 0; i < N; i++) {

      peopleOnQueue = scanner.nextInt();
      numSwitches = 0;

      for (int j = 0; j < peopleOnQueue; j++) {

        currentSmsNumber = scanner.nextInt();
        currentQueue.add(currentSmsNumber);
        numToIndexOriginal.put(currentSmsNumber, currentQueue.size() - 1);

      }

      SmsNumberComparator comparator = new SmsNumberComparator();
      Collections.sort(currentQueue, comparator);

      for (int j = 0; j < currentQueue.size(); j++) {

        int originalIndex = numToIndexOriginal.get(currentQueue.get(j));

        if (originalIndex != j) {

          numSwitches++;

        }

      }

      System.out.println(peopleOnQueue - numSwitches);
      currentQueue = new ArrayList<>();

    }

    scanner.close();

  }

  static class SmsNumberComparator implements Comparator<Integer> {

    public SmsNumberComparator() {
    }

    @Override
    public int compare(Integer num0, Integer num1) {

      int res = num0.compareTo(num1);
      return -res;

    }

  }
}

// static BufferedReader in = new BufferedReader(new
// InputStreamReader(System.in));
// static PrintWriter out = new PrintWriter(System.out);

// public static void main(String[] args) throws IOException {
// String request = "";
// String letra = "";
// String pass = "";

// int pont = 0;
// int size = 0;
// int first = 0;
// int last = 0;
// int notGo = 0;

// List<Integer> list = new ArrayList<Integer>();
// List<Integer> listOrder = new ArrayList<Integer>();

// // quantas vezes
// pont = toInt(read());

// while ( pont > 0 ) {
// pont--;
// // quantos clientes
// size = toInt(read());

// request = read();

// for (int i = 0; i < request.length(); i++) {
// letra = String.valueOf(request.charAt(i));
// if (letra.equals(" ")) {
// list.add(Integer.parseInt(pass));
// pass = "";
// } else {
// pass = pass.concat(letra);
// }
// if ( (i + 1) == request.length()) {
// list.add(Integer.parseInt(pass));
// pass = "";
// }
// }

// for (int i = 0; i < list.size(); i++) {
// first = list.get(i);
// if ( i == (list.size() - 1) ) {
// listOrder.add(first);
// }

// if (!( (i + 1) == list.size() )) {
// last = list.get((i + 1));

// if (first > last) {
// listOrder.add(first);
// }
// if (first < last) {
// listOrder.add(last);
// listOrder.add(first);
// i++;
// }
// }

// }
// for (int i = 0; i < list.size(); i ++) {
// if (list.get(i) == listOrder.get(i)) {
// notGo++;
// }
// }
// System.out.println(notGo);
// list.clear();
// listOrder.clear();
// notGo = 0;

// }

// out.close();
// }

// private static String read() throws IOException {
// return in.readLine();
// }

// private static int toInt(String s) {
// return Integer.parseInt(s);
// }

// }
