package quebecIntermediario;

import java.util.Scanner;

public class ReduzindoAteZero {

    public static void main(String[] args) {
        int num = Integer.parseInt(new Scanner(System.in).nextLine());
        var step = 0;

        while (num > 0) {

            if ((num % 2) == 0) {
                num /= 2;

            } else {
                num -= 1;
            }
            step++;
        }

        System.out.println( step );
    }

}
