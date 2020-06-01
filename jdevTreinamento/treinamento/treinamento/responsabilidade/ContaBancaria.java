package treinamento.responsabilidade;

public class ContaBancaria {

    private String descricao;
    private double saldo = 8.000;

    public void soma() {
        saldo += 100;
    }
    public void subtrai() {
        saldo -= 100;
    }
    public void sacarDinheiro(double saque) {
        saldo -= saque;

    }
    public void deposito(double deposito) {
        saldo += deposito;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getDescricao() {
        return descricao;
    }

    public ContaBancaria setDescricao(String descricao) {
        this.descricao = descricao;
        return this;
    }

    @Override
    public String toString() {
        return "ContaBancaria{" +
                "descricao='" + descricao + '\'' +
                ", saldo=" + saldo +
                '}';
    }

}


