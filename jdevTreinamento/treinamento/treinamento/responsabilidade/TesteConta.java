package treinamento.responsabilidade;

public class TesteConta {
    public static void main(String[] args) {
        ContaBancaria bancaria = new ContaBancaria();
        bancaria.setDescricao("Conta bancaria sua.");

        System.out.println(bancaria);
        bancaria.subtrai();
        System.out.println(bancaria);

        bancaria.sacarDinheiro(400);
        System.out.println(bancaria);

        bancaria.deposito(1.800);
        System.out.println(bancaria);

        bancaria.soma();
        System.out.println(bancaria);




    }
}


