package gft;

import java.io.IOException;
import java.util.Scanner;

public class PulaNome {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);

		String[] nomes = new String[10];

		for(int i=0 ; i<10 ; i++)
			nomes[i] = sc.nextLine();

		System.out.println(nomes[2]);
		System.out.println(nomes[6]);
		System.out.println(nomes[8]);

	}

	// "_______________________________________________________________"

}
