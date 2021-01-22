package desafios.carros;

public class Ferrari extends Carro {

    @Override
    void acelerar() {
        // TODO Auto-generated method stub
        velocidadeAtual += 15;
    }

    @Override
    void frear() {
        // TODO Auto-generated method stub
        if (velocidadeAtual >= 5) {
            velocidadeAtual -= 10;
        } else {
            velocidadeAtual = 0;
        }
    }
    
}

