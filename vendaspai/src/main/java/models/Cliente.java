package models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column
	private String nome;
	@Column
	private String cidade;
	@Column
	private String região;
	@Column
	private String cnpj;

	@OneToMany(mappedBy = "cliente")
	private List<Pedido> pedidos;

	public Cliente(String nome, String cidade, String região, String cnpj) {
		this.nome = nome;
		this.cidade = cidade;
		this.região = região;
		this.cnpj = cnpj;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<Pedido> getPedidos() {
		return pedidos;
	}

	public void setPedidos(List<Pedido> pedidos) {
		this.pedidos = pedidos;
	}
	
	

}
	