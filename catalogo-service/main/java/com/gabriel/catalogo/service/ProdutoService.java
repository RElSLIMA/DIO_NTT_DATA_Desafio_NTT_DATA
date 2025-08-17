package com.gabriel.catalogo.service;

import com.gabriel.catalogo.model.Produto;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class ProdutoService {
    private final Map<Long, Produto> produtos = new HashMap<>();

    public ProdutoService() {
        produtos.put(1L, new Produto(1L, "Notebook", 3500.00));
        produtos.put(2L, new Produto(2L, "Smartphone", 2500.00));
        produtos.put(3L, new Produto(3L, "Mouse", 150.00));
    }

    public List<Produto> listarTodos() {
        return new ArrayList<>(produtos.values());
    }

    public Produto buscarPorId(Long id) {
        return produtos.get(id);
    }
}
