import java.io.IOException;
import java.util.Scanner;

// (Contagem de cedulas)
public class ContagemCedula {
	
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);

        int notasInseridas = leitor.nextInt();
        int atual = notasInseridas;
        
        int notas100 = atual / 100;
        atual -= notas100 * 100;
        int notas50 = atual / 50;
        atual -=  notas50 * 50;
        int notas20 = atual / 20;
        atual -=  notas20 * 20;
        int notas10 = atual / 10;
        atual -= notas10 * 10;
        int notas5 = atual / 5;
        atual -= notas5 * 5;
        int notas2 = atual / 2;
        atual -= notas2 * 2;
        int notas1 = atual;
                
        //continue a solucao de acordo com os exemplos de saída
        System.out.println(notasInseridas);
        System.out.println(notas100 + " nota(s) de R$ 100,00");
        System.out.println(notas50 + " nota(s) de R$ 50,00");
        System.out.println(notas20 + " nota(s) de R$ 20,00");
        System.out.println(notas10 + " nota(s) de R$ 10,00");
        System.out.println(notas5 + " nota(s) de R$ 5,00");
        System.out.println(notas2 + " nota(s) de R$ 2,00");
        System.out.println(notas1 + " nota(s) de R$ 1,00");
    }
	
}