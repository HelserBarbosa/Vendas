package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import models.Pedido;
import repository.PedidoRepository;

@Service
public class PedidoService {
	@Autowired
	PedidoRepository pr;

	public void addPedido(Pedido pedido) {
		pr.save(pedido);
	}

	public void getPedido(String numero) {
		pr.findById(numero);
	}

	public void deletePedido(String numero) {
		pr.deleteById(numero);
	}
}
