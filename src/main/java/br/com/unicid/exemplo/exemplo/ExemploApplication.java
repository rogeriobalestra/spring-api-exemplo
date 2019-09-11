package br.com.unicid.exemplo.exemplo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.unicid.exemplo.exemplo.model.Cliente;
import br.com.unicid.exemplo.exemplo.model.Produto;
import br.com.unicid.exemplo.exemplo.service.ClienteService;

@SpringBootApplication
public class ExemploApplication implements CommandLineRunner {

	@Autowired
	private ClienteService clienteService;
	
	public static void main(String[] args) {
		SpringApplication.run(ExemploApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Cliente c1 = new Cliente(1, "Alagoas", "alagoas@gmail.com", 30, "2222-3333");
		
		Produto p1 = new Produto(null, "celular", 1, 500.00, c1);
		
		clienteService.salvar(c1);
	}

}
