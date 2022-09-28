package quebecBasico;

import java.io.IOException;
import java.util.Scanner;

public class CalculoSimples {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);

        int cod1 = leitor.nextInt();
        int n1 = leitor.nextInt();
        double valor1 = leitor.nextDouble();

        double total = 0;
        total = total + (n1 * valor1);

        cod1 = leitor.nextInt();
        n1 = leitor.nextInt();
        valor1 = leitor.nextDouble();

        total = total + (n1 * valor1);

        System.out.println(String.format("VALOR A PAGAR: R$ %.2f", total));

    }

}
