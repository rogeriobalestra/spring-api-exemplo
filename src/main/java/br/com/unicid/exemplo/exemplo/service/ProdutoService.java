package br.com.unicid.exemplo.exemplo.service;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.unicid.exemplo.exemplo.interfaces.IProduto;
import br.com.unicid.exemplo.exemplo.model.Produto;
import br.com.unicid.exemplo.exemplo.repository.ProdutoRepository;


@Service
public class ProdutoService implements IProduto{

	private static final Logger LOGGER = LoggerFactory.getLogger(IProduto.class);

			
	
	@Autowired
	private ProdutoRepository produtoRepository;

	@Autowired
	private ClienteService clienteService;
	
	@Override
	public Produto save(Produto produto) {
		//Cliente cliente = clienteService.buscaPorId(produto.getCliente().getId());
		
		//LOGGER.info("INFO: " + cliente.getId());
		
		return produtoRepository.save(produto);
	}

	@Override
	public List<Produto> findAll() {
		return produtoRepository.findAll();
	}


	
	

	
	
}
