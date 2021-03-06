package com.abutua.springboot.HelloSpringBootRest;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@Autowired
	ProdutoRepositorio rep;
	
	@RequestMapping("/")
	public Iterable<Produto> index() {
		return rep.findAll();
	}
	
	@RequestMapping("/buscaPorDescricao")
	public List<Produto> buscaPorDescricao(@RequestParam("descricao") String descricao){
		return rep.findByDescricaoLikeIgnoreCase("%" + descricao + "%");
	}

}
