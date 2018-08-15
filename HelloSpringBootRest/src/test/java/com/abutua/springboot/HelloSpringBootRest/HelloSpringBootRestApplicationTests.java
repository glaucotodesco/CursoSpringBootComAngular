package com.abutua.springboot.HelloSpringBootRest;

import static org.junit.Assert.assertTrue;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class HelloSpringBootRestApplicationTests {

	@Autowired
	private TestRestTemplate restTemplate;
	
	@Test
	public void contextLoads() {
	}

	@Test
	public void testBuscaDescricaoProduto() {
		Produto[] prods = restTemplate.getForObject("/buscaPorDescricao?descricao=P", Produto[].class);
		for(Produto p: prods) {
			assertTrue(p.getDescricao().length() > 2);
		}
	}
	
}




