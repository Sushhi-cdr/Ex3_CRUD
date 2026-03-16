package com.example.Ex3.Controllers;

import com.example.Ex3.Entity.Pedido;
import com.example.Ex3.Services.ServicoPedido;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("Pedidos")
public class ControlePedido {

    @Autowired
    private ServicoPedido servico;

    @PostMapping
    public Pedido criar(@RequestBody Pedido pedido) {
        return servico.criar(pedido);
    }

    @GetMapping
    public List<Pedido> listar(){
        return servico.listar();
    }

    @GetMapping
    public Pedido buscar(@PathVariable Long id){
        return servico.buscarPorID(id);
    }

    @DeleteMapping
    public void excluir(@PathVariable Long id){
        servico.excluir(id);
    }
}
