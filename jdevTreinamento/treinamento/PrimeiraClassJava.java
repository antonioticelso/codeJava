import javax.swing.JOptionPane;
import java.math.BigDecimal;

public class PrimeiraClassJava {

    static int maiorIdadeGlobal = 30;

    public static void main(String[] args) {
//        tipo:
//        byte / short / int / boolean / String / BigDecimal
        int maiorIdade = 18;

        System.out.println("Primeiro programa em Java!");
        System.out.println("Java orientado à objeto!");

        metodo2();
        System.out.printf("Variavel local: " + maiorIdade);

    }

    public static void metodo2() {
        System.out.printf("Valor global da variavel: " + maiorIdadeGlobal);

    }

}


