import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.*;

public class EntrevistaEmbaracosa {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // insira sua solução aqui
        ArrayList<Character> list = new ArrayList<>();

        String text;
        Character first, last;
        int corte = 0;
        int pontoA = 0;
        int pontoB = 0;

        text = st.nextToken();

        while (text != null || text != "") {
            for (int i = 0; i < text.length(); i++) {
                list.add(text.charAt(i));
            }

            for (int i = 1; i < list.size(); i++) {
                last = list.get(i);

                for (int j = (i - 1); j > -1; j--) {
                    first = list.get(j);
                    if (last.equals(first)) {
                        corte++;
                        break;
                    }
                }

                if (corte == 1) {
                    pontoA = i;
                }
                if (corte == 2) {
                    pontoB = i;
                }

                if (pontoB == (pontoA + 1)) {
                    System.out.println(text.substring(0, pontoA));
                    break;
                } else {
                    pontoA = pontoB;
                    corte = 1;
                }
            }

            if (pontoA == 0 && pontoB == 0) {
                System.out.println(text);
                break;
            }

            st = new StringTokenizer(br.readLine());
            text = st.nextToken();

            list = new ArrayList<>();
            corte = 0;
            pontoA = 0;
            pontoB = 0;

        }

    }
}