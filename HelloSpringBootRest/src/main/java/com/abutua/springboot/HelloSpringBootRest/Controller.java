package com.abutua.springboot.HelloSpringBootRest;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@Autowired
	ProdutoRepositorio rep;
	
	@RequestMapping("/")
	public Iterable<Produto> index() {
		return rep.findAll();
	}
	
	
	
	
	
}
