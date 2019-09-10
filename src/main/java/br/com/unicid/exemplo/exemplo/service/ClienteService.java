package br.com.unicid.exemplo.exemplo.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.unicid.exemplo.exemplo.interfaces.ICliente;
import br.com.unicid.exemplo.exemplo.model.Cliente;
import br.com.unicid.exemplo.exemplo.repository.ClienteRepository;


@Service
public class ClienteService implements ICliente {

	@Autowired
	private ClienteRepository clienteRepository;
	

	@Override
	public Cliente salvar(Cliente cliente) {
		return clienteRepository.save(cliente);
	}


	@Override
	public Cliente buscaPorId(Integer id) {
		Optional<Cliente> cliente = clienteRepository.findById(id);
		return cliente.orElse(null);
	}


	@Override
	public List<Cliente> buscaTodos() {
		return clienteRepository.findAll();
	}


	@Override
	public void update(Cliente cliente) {
		clienteRepository.save(cliente);
	}


	@Override
	public void delete(Integer id) {
		clienteRepository.deleteById(id);
	}



	public List<Cliente> findByNomeIgnoreCase(String nome) {
		return clienteRepository.findByNomeContainingIgnoreCase(nome);
		
	}


	
	



}
