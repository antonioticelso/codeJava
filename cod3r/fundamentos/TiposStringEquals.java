package fundamentos;

public class tipoStringEquals {
    
    public static void main(String[] args) {
        System.out.println("2" == "2");

        String s1 = new String("2");
        
        System.out.println("2" == s1);
        System.out.println("2".equals(s1));

        Scanner teclado = new Scanner(System.in);

        String s2 = teclado.nextLine();

        System.out.println("2" == s2);
        System.out.println("2".equals(s2.trim()));

        teclado.close();

    }
}