package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import models.Pedido;
import service.PedidoService;

@Controller
@RestController("/Pedido")
public class PedidoController {
	@Autowired
	PedidoService ps;
	
	@GetMapping
	public String getPedido(@RequestParam String numero) {
		ps.getPedido(numero);
		return "pedido encontrado";
	}
	@PostMapping
	public String addPedido(@RequestParam String qtdPizza,@RequestParam String data) {
		Pedido pedido = new Pedido(qtdPizza,data);
		ps.addPedido(pedido);
		return null;
	}

	@DeleteMapping
	public String deletePedido(@RequestParam String numero) {
		ps.deletePedido(numero);
		return null;
	}
}
