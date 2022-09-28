package quebecIntermediario;

import java.util.Scanner;

public class ContaPar {
    public static void main(String[] args) {
        int num = Integer.parseInt(new Scanner(System.in).nextLine());
        var count = 0;

        for (var i = 1; i <= num; i++) {
            var strNum = String.valueOf(i);

            if (i < 10) {
                if (i % 2 == 0) {
                    count++;
                }
                continue;
            }

            char[] vs = strNum.toCharArray();
            int novoPar = 0;
            if (i >= 10 && i <= num) {
                novoPar = (int)Character.getNumericValue(vs[0]) + (int)Character.getNumericValue(vs[1]);
                if (novoPar % 2 == 0) {
                    count++;
                }
                continue;
            }

        }
        System.out.println( count );
    }

}
