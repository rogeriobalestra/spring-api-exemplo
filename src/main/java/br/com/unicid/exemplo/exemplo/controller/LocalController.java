package br.com.unicid.exemplo.exemplo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import br.com.unicid.exemplo.exemplo.dto.LocalDTO;
import br.com.unicid.exemplo.exemplo.service.LocalService;

@RestController
public class LocalController {

	@Autowired
	private LocalService localService;
	
	@GetMapping("/local/cep/{cep}")
	public ResponseEntity<LocalDTO> findEnderecoPorCep(@PathVariable String cep) {
		LocalDTO localDTO = localService.buscaPorCep(cep);
		return ResponseEntity.status(HttpStatus.OK).body(localDTO);
	}
	
	
}
