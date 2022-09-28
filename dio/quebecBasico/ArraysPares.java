package quebecBasico;

public class ArraysPares {

    public static void main(String[] args){

        int[] p = {2, 3, 5, 7, 11, 13, 18, 34};

        for (int i = 0; i < p.length; i++){
            if ( p[i] % 2 == 0 ){
                System.out.println( p[i] );
            }
        }

    }

}
