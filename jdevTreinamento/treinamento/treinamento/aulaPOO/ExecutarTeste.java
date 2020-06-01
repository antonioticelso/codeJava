package treinamento.aulaPOO;

import java.math.BigDecimal;

public class ExecutarTeste {
    public static void main(String[] args) {

        Produto produto1 = new Produto();
        produto1.setId(1L);
        produto1.setNome("Orientacao Objeto");
        produto1.setValor(BigDecimal.valueOf(100));

        Produto produto2 = new Produto();
        produto2.setId(2L);
        produto2.setNome("Spring Boot API REST.");
        produto2.setValor(BigDecimal.valueOf(300));

        Produto produto3 = new Produto();
        produto3.setId(3L);
        produto3.setNome("Quarkus API REST.");
        produto3.setValor(BigDecimal.valueOf(550));

        Produto produto4 = new Produto();
        produto4.setId(4L);
        produto4.setNome("Reacte Nature.");
        produto4.setValor(BigDecimal.valueOf(500));

        Venda venda = new Venda();
        venda.setDescricao("Venda de Curso Formacao Java.");
        venda.setEnderecoEntrega("E-mail.");
        venda.setId(10L);
        venda.setNomeCliente("Alex Bourn.");
//        venda.setValorTotal(BigDecimal.valueOf(197));

        venda.getListaProdutos().add(produto1);
        venda.getListaProdutos().add(produto2);
        venda.addProduto(produto3);
        venda.addProduto(produto4);

        System.out.println("Descricao da venda: " + venda.getDescricao()
                + " e o total: " + venda.getValorTotal());

    }

}


