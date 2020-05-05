package fundamentos;

import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        
        System.out.println("Olá meu povo!");

        Scanner teclado = new Scanner(System.in);

        String text = teclado.nextLine();

        System.out.println("Você falou: " + text + "Tudo bem, e com espero que esteja também.");

        

        teclado.close();
    }
}