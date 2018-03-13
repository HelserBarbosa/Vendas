package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import models.Cliente;
import service.ClienteService;

@Controller
@RestController("/Cliente")
public class ClienteController {

	@Autowired
	private ClienteService cs;

	@GetMapping
	public String getCliente(@RequestParam String nome) {
		cs.findCliente(nome);
		return "Cliente encontrado";
	}

	@PostMapping
	public String addCliente(@RequestParam String nome, @RequestParam String cidade, @RequestParam String regiao,
			@RequestParam String cnpj) {
		Cliente cliente = new Cliente(nome, cidade, regiao, cnpj);
		cs.addCliente(cliente);
		return "Cliente Salvo";
	}

	@DeleteMapping
	public String deleteCliente(@RequestParam String nome) {
		cs.deleteCliente(nome);
		return "Cliente Deletado";
	}
}
