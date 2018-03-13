package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import models.Pizza;
import service.PizzaService;

@Controller
@RestController("/Pizza")
public class PizzaController {
	@Autowired
	PizzaService ps;

	@GetMapping
	public String getPizza(@RequestParam String nome) {

		ps.getPizza(nome);
		return "pizza encontrada";
	}

	@PostMapping
	public String addPizza(@RequestParam String nome,@RequestParam String tamanho) {
		Pizza newPizza = new Pizza(tamanho,nome);
		ps.addPizza(newPizza);
		return "Pizza Adicionada";
	}

	@DeleteMapping
	public String deletePizza(@RequestParam String nome) {
		ps.deletePizza(nome);
		return "pizza deletada";
	}
}
