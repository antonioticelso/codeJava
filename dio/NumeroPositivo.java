import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

// (Quantidade de numeros positivos)
public class NumeroPositivo {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    double linha = Double.parseDouble(br.readLine());
    int valor;
    int contador = 0;
    
    for (int i = 0; i < 6; i++) {
      valor = (int) linha;
      if (valor > 0) {
        contador++;
      }
      if ( i < 5) {
        linha = Double.parseDouble(br.readLine());
      }
    }
    System.out.println(contador + " valores positivos");

  }
}