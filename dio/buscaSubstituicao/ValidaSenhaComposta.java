import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class ValidaSenhaComposta {

  public final static int MAX = 32;
  static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
  static PrintWriter out = new PrintWriter(System.out);

	public static void main(String[] args) throws IOException {

     //insira sua solução aqui
		String pass = in.readLine();
		String pattern = "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=\\S+$).{6,}";
		String patternSpe = "(?=.*[@#$%^&+=!]).{6,}";
		// String pattern = "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}";
		
		boolean validatedAlf = false;
		boolean validatedSpace = false;
		int c = 0;

    while (pass != null || pass != "") {
      validatedAlf = pass.matches(pattern);

  		if (validatedAlf) {
  		  validatedSpace = pass.matches(patternSpe);

  		  if (validatedSpace) {
        	System.out.println("Senha invalida.");
  		    
  		  } else {
          System.out.println("Senha valida.");
  		  }

  		} else {
      	System.out.println("Senha invalida.");
  		}
        
        
  		pass = in.readLine();
  		c++;
    	if(pass == null || pass == "") { //complete o if de acordo com suas variaveis
    	  break;
    	}

    }

    out.close();
    
	}

  // "_______________________________________________________________"

	// Scanner scr = new Scanner(System.in);
	// String senha;
	// final String requeridos = "^(?:(?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).*)$";
	// final String permitidos = "[a-zA-Z0-9]+";
	
	// while(scr.hasNextLine()) {
	// 	senha = scr.nextLine();
		
	// 	if(senha.length() >=6 && senha.length() <= 32 && senha.matches(permitidos) && senha.matches(requeridos)){
	// 		System.out.println("Senha valida.");
	// 	} else {
	// 		System.out.println("Senha invalida.");
	// 	}
	// }

}
