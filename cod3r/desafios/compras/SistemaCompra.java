package desafios.compras;


public class SistemaCompra {

    public static void main(String[] args) {

        Cliente cliente = new Cliente("Maria");

        Compra compra1 = new Compra();
        compra1.adicionarItem1("Caneta", 9.65, 100);
        compra1.adicionarItem(new Produto("notebook", 1980.99), 2);

        Compra compra2 = new Compra();
        compra2.adicionarItem1("Caderno", 15.50, 10);
        compra2.adicionarItem(new Produto("impressora", 780.90), 3);

        cliente.adicionarCompra(compra1);
        cliente.compraList.add(compra2);

        System.out.println(cliente.obterValorTotal());

    }

}


