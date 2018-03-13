package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import models.Pizza;
import repository.PizzaRepository;

@Service
public class PizzaService {
		@Autowired
		PizzaRepository pr;
		
		public void addPizza(Pizza pizza) 
		{
			pr.save(pizza);
		}
		public void getPizza(String nome) 
		{
			pr.findById(nome);
		}
		public void deletePizza(String nome) 
		{
			pr.deleteById(nome);
		}
}
