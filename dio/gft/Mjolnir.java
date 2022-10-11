package gft;

import java.io.IOException;
import java.util.Scanner;

public class Mjolnir {

	public static void main(String[] args) throws IOException {

		Scanner leitor = new Scanner(System.in);
		int C = leitor.nextInt();
		String nome;
		int N;

		for (int i = 0; i < C; i++) {
			nome = leitor.next();
			N = leitor.nextInt();
			if (nome.equals("Thor")) System.out.println( "Y" );
			else System.out.println( "N" );
		}

	}

	// "_______________________________________________________________"

}
