package models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Pedido {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column
	private String qtdPizza;
	@Column
	private int numero;
	@Column
	private String Data;
	@OneToMany(mappedBy = "pedido")
	private List<Pizza> pizzas;

	@ManyToOne
	private Cliente cliente;

	public Pedido(String qtdPizza, String data) {
		this.qtdPizza = qtdPizza;
		this.numero++;
		this.Data = data;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
}
