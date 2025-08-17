package com.gabriel.pedido.service;

import com.gabriel.pedido.model.Pedido;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class PedidoService {
    private final Map<Long, Pedido> pedidos = new HashMap<>();
    private Long contador = 1L;

    public List<Pedido> listarTodos() {
        return new ArrayList<>(pedidos.values());
    }

    public Pedido criarPedido(List<Long> produtosIds, double total) {
        Pedido pedido = new Pedido(contador, produtosIds, total);
        pedidos.put(contador, pedido);
        contador++;
        return pedido;
    }

    public Pedido buscarPorId(Long id) {
        return pedidos.get(id);
    }
}
