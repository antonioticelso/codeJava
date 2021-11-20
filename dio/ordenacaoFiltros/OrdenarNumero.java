import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;
import java.io.IOException;

// (Ordenando Numeros)
public class OrdenarNumero {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int N = Integer.parseInt(st.nextToken());

    ArrayList<Integer> entrada = new ArrayList<Integer>();
    ArrayList<Integer> pares = new ArrayList<Integer>();
    ArrayList<Integer> impares = new ArrayList<Integer>();

    for (int i = 0; i < N; i++) {

      st = new StringTokenizer(br.readLine());
      entrada.add(Integer.parseInt(st.nextToken()));

      if (entrada.get(i) % 2 == 0) {

        pares.add(entrada.get(i));

      } else {

        impares.add(entrada.get(i));

      }

    }

    Collections.sort(pares);
    Collections.sort(impares);

    Collections.reverse(impares);

    for (int par : pares) {

      System.out.println(par);

    }

    for (int impar : impares) {

      System.out.println(impar);

    }

    // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    // int linha = Integer.parseInt(br.readLine());
    // int valor = Integer.parseInt(br.readLine());

    // int par = 0;
    // int menorPar = 0;
    // int maiorPar = 0;

    // int impar = 0;
    // int menorImpar = 0;
    // int maiorImpar = 0;

    // int[] listPar = new int[linha];
    // int[] listImpar = new int[linha];

    // for (int i = 0; i < linha; i++) {
    //   if (valor % 2 == 0) {
    //     listPar[par] = valor;
    //     par++;
    //   } else {
    //     listImpar[impar] = valor;
    //     impar++;
    //   }
    //   if (i < (linha - 1)) {
    //     valor = Integer.parseInt(br.readLine());
    //   }
    // }

    // for (int i = 0; i < listPar.length; i++) {
    //   for (int j = (i + 1); j < listPar.length; j++) {
    //     if (listPar[j] == 0) {
    //       break;
    //     }
    //     if (listPar[i] > listPar[j]) {
    //       maiorPar = listPar[i];
    //       menorPar = listPar[j];
    //       listPar[i] = menorPar;
    //       listPar[j] = maiorPar;
    //     }
    //   }
    // }

    // for (int i = 0; i < listImpar.length; i++) {
    //   for (int j = (i + 1); j < listImpar.length; j++) {
    //     if (listImpar[j] == 0) {
    //       break;
    //     }
    //     if (listImpar[i] < listImpar[j]) {
    //       menorImpar = listImpar[i];
    //       maiorImpar = listImpar[j];
    //       listImpar[i] = maiorImpar;
    //       listImpar[j] = menorImpar;
    //     }
    //   }
    // }

    // for (int i = 0; i < linha; i++) {
    //   if (listPar[i] == 0) {
    //     break;
    //   }
    //   System.out.println(listPar[i]);
    // }

    // for (int i = 0; i < linha; i++) {
    //   if (listImpar[i] == 0) {
    //     break;
    //   }
    //   System.out.println(listImpar[i]);
    // }

  }
}
