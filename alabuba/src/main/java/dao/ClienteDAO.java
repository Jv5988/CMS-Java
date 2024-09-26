package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import db.MySqlConnection;
import model.Cliente;

public class ClienteDAO implements CRUD{
	
	private Connection con = MySqlConnection.createConnection();
	private String sql;

	public ClienteDAO() {
	}

	@Override
	public void create(Cliente cliente) {
		sql = "insert into clientes values (null,?,?,?,?)";
		
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			
			pst.setString(1, cliente.getNome());
			pst.setString(2, cliente.getCpf());
			pst.setString(3, cliente.getNascimento());
			pst.setString(4, cliente.getSituacao());
			
			pst.executeUpdate();
			System.out.println("Insert adicionado no banco!");
		}catch(SQLException e) {
			System.out.println("Erro ao inserir no Banco: "+e);
		}
		
	}

	@Override
	public void delete(int id) {
		sql = "delete from clientes where id = ?";
		
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			
			pst.setInt(1, id);
			pst.executeUpdate();
			System.out.println("Conteudo deletado!");
		}catch(SQLException e) {
			System.out.println("Deu rum painho: "+e.getMessage());
		}
		
	}

	@Override
public List<Cliente> find(String pesquisa){
		
		sql = String.format("SELECT * FROM clientes WHERE nome like '%s%%' OR cpf LIKE '%s%%' ", pesquisa, pesquisa);
		List<Cliente> clientes = new ArrayList<Cliente>();
		
		try {
			Statement statement = con.createStatement();
			ResultSet resultSet = statement.executeQuery(sql);
			
			while (resultSet.next()) {
				
				Cliente cliente = new Cliente();
				
				cliente.setId(resultSet.getInt("id"));
				cliente.setNome(resultSet.getString("nome"));
				cliente.setCpf(resultSet.getString("cpf"));
				cliente.setNascimento(resultSet.getString("nascimento"));
				cliente.setSituacao(resultSet.getString("situacao"));
				
				clientes.add(cliente);
				
			}
			
			System.out.println("--correct find clientes");
			return clientes;
			
		} catch(SQLException e) {
			System.out.println("--incorrect find clientes. " + e.getMessage());
			return null;
		}
	}
	
	@Override
	public Cliente findByPk(int clienteId) {
		sql = String.format("SELECT * FROM clientes WHERE id = %d ", clienteId);
		
		try {
			Statement statement = con.createStatement();
			ResultSet resultSet = statement.executeQuery(sql);
			Cliente cliente = new Cliente();
			
			while (resultSet.next()) {
				cliente.setId(resultSet.getInt("id"));
				cliente.setNome(resultSet.getString("nome"));
				cliente.setCpf(resultSet.getString("cpf"));
				cliente.setNascimento(resultSet.getString("nascimento"));
				cliente.setSituacao(resultSet.getString("situacao"));
			}
			
			System.out.println("--correct find by pk clientes");
			return cliente;
			
	} catch(SQLException e) {
		
			System.out.println("--incorrect find by pk clientes. " + e.getMessage());
			return null;
		}
	}

	@Override
	public void update(Cliente cliente) {
		sql = "update clientes set nome=?, cpf=?, nascimento=?, situacao=? where id = ?";
		
		try {
			PreparedStatement  pst = con.prepareStatement(sql);
			
			pst.setString(1, cliente.getNome());
			pst.setString(2, cliente.getCpf());
			pst.setString(3, cliente.getNascimento());
			pst.setString(4, cliente.getSituacao());
			pst.setInt(5, cliente.getId());
			
			pst.executeUpdate();
			System.out.println("Conteudo atualizeido! ");
		}catch(SQLException e) {
			System.out.println("Deu ruim ao atializar: "+e.getMessage());
		}
		
	}

}
