package model;

public class Cliente {
	
	private int id;
	private String nome;
	private String cpf;
	private String nascimento;
	private String situacao;
	
	
	
	public Cliente(String nome, String cpf, String nascimento, String situacao) {
		this.nome = nome;
		this.cpf = cpf;
		this.nascimento = nascimento;
		this.situacao = situacao;
	}
	
	
	public Cliente() {
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getNascimento() {
		return nascimento;
	}
	public void setNascimento(String nascimento) {
		this.nascimento = nascimento;
	}
	public String getSituacao() {
		return situacao;
	}
	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}
	
	

}
