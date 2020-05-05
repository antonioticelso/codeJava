public class Aula5Modulo8 {

//    Estrutura de repetição do While
    public static void main(String[] args) {

        int n1 = 0;
//        faz primeiro a verificação, para executar a estrutura de repetição
        while (n1 <= 10) {
            System.out.println("O valor é " + n1);
            n1++;
        }

        int n2 = 0;
//        faz a estrutura de repetição para depois fazer a primeira verificação
        do {
            System.out.println("O valor é " + n2);
            n2++;

        } while (n2 <= 10);

//        faz primeiro a verificação e declaração da variável,
//        para executar a estrutura de repetição
//        Incremento
        for (int n5 = 0; n5 <= 10; n5++) {
            if(n5 == 7) {
                System.out.println("\nParei no " + n5);
                break;
            }
            System.out.println("O valor é " + n5);

        }

//        faz primeiro a verificação e declaração da variável,
//        para executar a estrutura de repetição
//        Decremento
        for (int n6 = 10; n6 >= 0; n6--) {
            if(n6 == 6) {
                System.out.println("\nVamos continuar do " + n6);
                continue;
            }
            System.out.println("O valor é " + n6);

        }

    }

}


