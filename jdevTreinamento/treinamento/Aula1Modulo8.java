public class Aula1Modulo8 {

//    Estrutura de repetição
    public static void main(String[] args) {

        int mediaAluno = 70;
        int mediaAluno2 = 86;

        if(mediaAluno < 40) {
            System.out.println("Reprovado.");

        } else if(mediaAluno >= 40 && mediaAluno < 70) {
            System.out.println("Recuperação.");

        } else {
            System.out.println("Aprovado.");

        }

//        Operador Ternário
        String saidaResultadoAluno;
        saidaResultadoAluno = mediaAluno2 >= 70 ? "Aprovado" : "Reprovado";

    }

}


