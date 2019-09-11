package br.com.unicid.exemplo.exemplo.interfaces;

import java.util.List;

import br.com.unicid.exemplo.exemplo.model.Produto;

public interface IProduto {

	Produto save(Produto produto);
	
	List<Produto> findAll();
	
	
}
