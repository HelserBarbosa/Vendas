package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import models.Cliente;
import repository.ClienteRepository;

@Service
public class ClienteService {

	@Autowired
	private ClienteRepository cr;

	public void addCliente(Cliente cliente) {
		cr.save(cliente);
	}

	public void deleteCliente(String nome) {
		cr.deleteById(nome);
	}
	
	public void findCliente(String nome) 
	{
		cr.findById(nome);
	}
}
