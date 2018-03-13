package repository;

import org.springframework.data.repository.CrudRepository;

import models.Pedido;

public interface PedidoRepository extends CrudRepository<Pedido, String> {

}
