package desafios.dio;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

// (Exibindo numeros pares)
public class MinhaPrimeiraSequencia {	
    public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringTokenizer st = new StringTokenizer(br.readLine());

      int linha = Integer.parseInt(st.nextToken());

    	for (int i = 1; i <= linha; i++) {
    	  if (i % 2 == 0) {
          System.out.println(i);
    	  }
    	}
    }
    
}
