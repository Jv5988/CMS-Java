package dao;

import java.util.List;

import model.Cliente;

public interface CRUD {
	
	void create(Cliente cliente);
	
	void delete(int id);
	
	List<Cliente> find(String pesquisa);
	
	Cliente findByPk(int clienteId);
	
	void update(Cliente cliente);

}
