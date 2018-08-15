package com.abutua.springboot.HelloSpringBootRest;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface ProdutoRepositorio extends CrudRepository <Produto, Long> { 

}



