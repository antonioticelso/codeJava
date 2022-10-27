package gft;

import java.util.Scanner;

public class Circulos {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        double raio = scan.nextDouble();
        double massa = Math.pow( raio   ,2);
        double area = Math.ceil(( 3.14159 * massa));

        System.out.println(raio);
        System.out.println(massa);
        System.out.println(area);

        System.out.printf("A=%.4f\n", area);

    }

}
