package com.example.Ex3.Repositories;

import com.example.Ex3.Entity.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositorioPedido extends JpaRepository<Pedido, Long> {
}
