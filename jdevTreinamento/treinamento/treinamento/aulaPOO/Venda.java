package treinamento.aulaPOO;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Venda {

    private Long id;
    private String descricao;
    private String nomeCliente;
    private String enderecoEntrega;
    private BigDecimal valorTotal;

    private List<Produto> listaProdutos = new ArrayList<Produto>();

    public List<Produto> getListaProdutos() {
        return listaProdutos;
    }

    public Venda setListaProdutos(List<Produto> listaProdutos) {
        this.listaProdutos = listaProdutos;
        return this;
    }
    public void addProduto (Produto produto) {
        this.listaProdutos.add(produto);
    }

    private double totalVenda() {
        double total = 0.0;
        for (Produto produto : listaProdutos) {
            total += produto.getValor().doubleValue();
        }
        return total;
    }

    public Long getId() {
        return id;
    }

    public Venda setId(Long id) {
        this.id = id;
        return this;
    }

    public String getDescricao() {
        return descricao;
    }

    public Venda setDescricao(String descricao) {
        this.descricao = descricao;
        return this;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public Venda setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
        return this;
    }

    public String getEnderecoEntrega() {
        return enderecoEntrega;
    }

    public Venda setEnderecoEntrega(String enderecoEntrega) {
        this.enderecoEntrega = enderecoEntrega;
        return this;
    }

    public BigDecimal getValorTotal() {

        this.valorTotal = BigDecimal.valueOf(totalVenda());
        return valorTotal;
    }

    public Venda setValorTotal(BigDecimal valorTotal) {
        this.valorTotal = valorTotal;
        return this;
    }

    @Override
    public String toString() {
        return "Venda{" +
                "id=" + id +
                ", descricao='" + descricao + '\'' +
                ", nomeCliente='" + nomeCliente + '\'' +
                ", enderecoEntrega='" + enderecoEntrega + '\'' +
                ", valorTotal=" + valorTotal +
                ", listaProdutos=" + listaProdutos +
                '}';
    }

}


