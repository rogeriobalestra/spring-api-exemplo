package br.com.unicid.exemplo.exemplo.interfaces;

import br.com.unicid.exemplo.exemplo.dto.LocalDTO;

public interface ILocal {

	LocalDTO buscaPorCep(String cep);
	
	
}
