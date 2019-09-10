package br.com.unicid.exemplo.exemplo.controller;

import java.net.URI;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import br.com.unicid.exemplo.exemplo.model.Cliente;
import br.com.unicid.exemplo.exemplo.service.ClienteService;


@RestController
public class ClienteController {

	@Autowired
	private ClienteService clienteService;
	
	
	@GetMapping("/cliente")
	public ResponseEntity<List<Cliente>> buscarTodos() {
		return ResponseEntity.status(HttpStatus.OK).body(clienteService.buscaTodos());
	}

	@GetMapping("/cliente/{id}")
	public ResponseEntity<Cliente> buscaClientePorId(@PathVariable Integer id) {
		Cliente cliente = clienteService.buscaPorId(id);
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(cliente);
	}
	
	@PostMapping("/cliente")
	public ResponseEntity<Void> salvar(@RequestBody Cliente cliente) {
		Cliente obj = clienteService.salvar(cliente);

		URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
				.path("/id")
				.buildAndExpand(obj.getId())
				.toUri();
		return ResponseEntity.created(uri).build();
	}
	
	@PutMapping("/cliente")
	public ResponseEntity<Void> update(@RequestBody Cliente cliente){
		clienteService.update(cliente);
		return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
	}

	
	@DeleteMapping("/cliente/{id}")
	public ResponseEntity<Void> delete(@PathVariable Integer id){
		clienteService.delete(id);
		return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
	}
	
	@GetMapping("/cliente/nome/{nome}")
	public ResponseEntity<List<Cliente>> findByNome(@PathVariable String nome) {
		List<Cliente> clientes = clienteService.findByNomeIgnoreCase(nome);
		return ResponseEntity.status(HttpStatus.OK).body(clientes);
	}
	
}
