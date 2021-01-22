package desafios.carros;

public class Carro {

    int velocidadeAtual;

    void acelerar() {
        velocidadeAtual += 5;
    }

    void frear() {
        if (velocidadeAtual >= 5) {
            velocidadeAtual -= 5;
        } else {
            velocidadeAtual = 0;
        }
    }

//    public String toString() {
//        return "Velocidade atual eh " + velocidadeAtual + "Km/h.";
//    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Carro{" +
                "velocidadeAtual=" + velocidadeAtual +
                '}';
    }
    
}


