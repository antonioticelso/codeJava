package gft;

import java.io.IOException;
import java.util.Scanner;

public class LeiaPar {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int N = leitor.nextInt();

        for (int i = 1; i <= N; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

    }

}
