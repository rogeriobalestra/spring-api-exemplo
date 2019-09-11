package br.com.unicid.exemplo.exemplo.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "TB_CLIENTE")
public class Cliente implements Serializable{
	private static final long serialVersionUID = 1L;

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	
	private String nome;
	private String email;
	private int idade;
	private String telefone;


	@OneToMany(mappedBy = "cliente")
	private List<Produto> produtos = new ArrayList<Produto>();
	
	
	
	public Cliente() {
		//vazio
	}
	
	
	
	public Cliente(Integer id, String nome, String email, int idade, String telefone) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.idade = idade;
		this.telefone = telefone;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}
	
	
	

}
