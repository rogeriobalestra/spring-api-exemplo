package br.com.unicid.exemplo.exemplo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.unicid.exemplo.exemplo.dto.LocalDTO;
import br.com.unicid.exemplo.exemplo.interfaces.IProduto;
import br.com.unicid.exemplo.exemplo.model.Cliente;
import br.com.unicid.exemplo.exemplo.model.Produto;
import br.com.unicid.exemplo.exemplo.service.ClienteService;
import br.com.unicid.exemplo.exemplo.service.LocalService;

@SpringBootApplication
public class ExemploApplication implements CommandLineRunner {

	private static final Logger LOGGER = LoggerFactory.getLogger(ExemploApplication.class);
	
	@Autowired
	private ClienteService clienteService;
	
	@Autowired
	private LocalService localService;
	
	public static void main(String[] args) {
		SpringApplication.run(ExemploApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		Cliente c1 = new Cliente(1, "Alagoas", "alagoas@gmail.com", 30, "2222-3333");
//		
//		Produto p1 = new Produto(null, "celular", 1, 500.00, c1);
//		
//		clienteService.salvar(c1);
		

		
		
		
	}

}
