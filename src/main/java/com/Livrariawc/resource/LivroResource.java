package com.Livrariawc.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Livrariawc.domian.Livro;
import com.Livrariawc.service.LivroService;

@RestController
@RequestMapping(value = "/api-livro")
public class LivroResource {

	@Autowired
	private LivroService proxyLivro;
	
	@GetMapping(value = "/find-book")
	public List<Livro> findAllLivro() {
		return proxyLivro.findAllLivroService();
	}
	
	@GetMapping(value = "/{id}")
	public Livro findID(@PathVariable String id) {
		return proxyLivro.findById(id);
	}
	
	@PostMapping(value = "/")
	public Livro insert(@RequestBody Livro l) {
		return proxyLivro.insertService(l);
	}
}
