package br.com.unicid.exemplo.exemplo.interfaces;

import java.util.List;
import br.com.unicid.exemplo.exemplo.model.Cliente;


public interface ICliente {

	public Cliente buscaPorId(Integer id);
	
	public Cliente salvar(Cliente cliente);
	
	public List<Cliente> buscaTodos();
	
	public void update(Cliente cliente);
	
	public void delete(Integer id);
	

	
	
}
