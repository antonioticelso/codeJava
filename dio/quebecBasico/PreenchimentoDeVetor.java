package quebecBasico;

import java.util.Scanner;

public class PreenchimentoDeVetor {

    public static void main(String[] args){
//        Scanner leitor = new Scanner(System.in);
//        int t = leitor.nextInt();
        int t = 3;

        for(int i = 0; i < 1000; i++ ){
            for(int j = 0; j< t; j++){
                System.out.println("N[" + i  + "] = "+  j );
                if( j == (t - 1) || i == 999){
                    break;
                }
                i++;
            }
        }

    }
}
