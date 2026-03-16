package com.example.Ex3.Services;

import com.example.Ex3.Entity.Pedido;
import com.example.Ex3.Repositories.RepositorioPedido;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicoPedido {

    @Autowired
    private RepositorioPedido repositorio;

    public Pedido criar(Pedido pedido) {
        return repositorio.save(pedido);
    }

    public List<Pedido> listar(){
        return repositorio.findAll();
    }

    public Pedido buscarPorID(Long id){
        return repositorio.findById(id).orElse(null);
    }

    public void excluir(Long id){
        repositorio.deleteById(id);
    }
}
