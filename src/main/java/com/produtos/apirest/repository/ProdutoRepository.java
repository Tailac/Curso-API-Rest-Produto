package com.produtos.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.produtos.apirest.models.Produto;


//JpaRepository possui métodos prontos para fazer persistencia no banco
// Como Sava, findAll etc.

public interface ProdutoRepository extends JpaRepository<Produto, Long>{

		
}
