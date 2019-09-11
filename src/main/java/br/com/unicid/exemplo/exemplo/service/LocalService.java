package br.com.unicid.exemplo.exemplo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import br.com.unicid.exemplo.exemplo.dto.LocalDTO;
import br.com.unicid.exemplo.exemplo.interfaces.ILocal;

@Service
public class LocalService implements ILocal {

	@Autowired
	private RestTemplate restTemplate;
	
	@Override
	public LocalDTO buscaPorCep(String cep) {
		return restTemplate.getForObject("https://viacep.com.br/ws/"+cep+"/json/", LocalDTO.class);
	}

	

	
}
