package desafios.compras;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

    final String nome;
    final List<Compra> compraList = new ArrayList<>();

    Cliente (String nome) {
        this.nome = nome;
    }

    void adicionarCompra(Compra compra) {
        this.compraList.add(compra);
    }

    double obterValorTotal() {
        double total = 0;

        for (Compra compra: compraList) {
            total += compra.obterValorTotal();
        }

        return total;
    }

}


