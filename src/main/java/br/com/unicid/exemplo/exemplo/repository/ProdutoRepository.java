package br.com.unicid.exemplo.exemplo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.unicid.exemplo.exemplo.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Integer> {

}
