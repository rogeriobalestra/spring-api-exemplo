package br.com.unicid.exemplo.exemplo.controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import org.springframework.web.util.UriBuilder;

import br.com.unicid.exemplo.exemplo.model.Produto;
import br.com.unicid.exemplo.exemplo.service.ProdutoService;

@RestController
public class ProdutoController {

	@Autowired
	private ProdutoService produtoService;
			
	@GetMapping("/produto")
	public ResponseEntity<List<Produto>> findAll(){
		List<Produto> produtos = produtoService.findAll();
		return ResponseEntity.status(HttpStatus.OK).body(produtos);
	}
	
	@PostMapping("/produto")
	public ResponseEntity<Void> save(@RequestBody Produto produto) {
		Produto obj = produtoService.save(produto);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
				.path("/id")
				.buildAndExpand(obj.getId()).toUri();
		return ResponseEntity.created(uri).build();
		
	}
	
	
	
	
}
