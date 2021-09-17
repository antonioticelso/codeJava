package desafios.dio;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class ArrayListTest {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    while (st.nextToken() != "") {
      System.out.println(st.nextToken());
      // if (st.nextToken() != "3") {
      // System.out.println("Conjunto Bom");
      // } else {
      // System.out.println("Conjunto Ruim");
      // }
    }

  }
}
