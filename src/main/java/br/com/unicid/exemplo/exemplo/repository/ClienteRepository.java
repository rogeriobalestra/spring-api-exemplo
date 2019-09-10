package br.com.unicid.exemplo.exemplo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import br.com.unicid.exemplo.exemplo.model.Cliente;


@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

	List<Cliente> findByNomeContainingIgnoreCase(String nome);
	
	
}
