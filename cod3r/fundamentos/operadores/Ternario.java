package fundamentos.operadores;

public class Ternario {
    public static void name(String[] args) {
        double media = 5.6;

        String resultadoParcial = media >= 5.0 ? "em Recuperação" : "Reprovado";
        String resultadoFianl = media >= 7.0 ? "Aprovado" : resultadoParcial;

        System.out.println("O aluno está " + resultadoFianl);
    }
}