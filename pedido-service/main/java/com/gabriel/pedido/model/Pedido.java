package com.gabriel.pedido.model;

import java.util.List;

public class Pedido {
    private Long id;
    private List<Long> produtosIds;
    private double total;

    public Pedido() {}

    public Pedido(Long id, List<Long> produtosIds, double total) {
        this.id = id;
        this.produtosIds = produtosIds;
        this.total = total;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public List<Long> getProdutosIds() { return produtosIds; }
    public void setProdutosIds(List<Long> produtosIds) { this.produtosIds = produtosIds; }

    public double getTotal() { return total; }
    public void setTotal(double total) { this.total = total; }
}
