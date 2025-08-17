package com.gabriel.pedido.controller;

import com.gabriel.pedido.model.Pedido;
import com.gabriel.pedido.service.PedidoService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/pedidos")
public class PedidoController {

    private final PedidoService service;

    public PedidoController(PedidoService service) {
        this.service = service;
    }

    @GetMapping
    public List<Pedido> listarTodos() {
        return service.listarTodos();
    }

    @GetMapping("/{id}")
    public Pedido buscarPorId(@PathVariable Long id) {
        return service.buscarPorId(id);
    }

    @PostMapping
    public Pedido criarPedido(@RequestBody Pedido pedido) {
        return service.criarPedido(pedido.getProdutosIds(), pedido.getTotal());
    }
}
