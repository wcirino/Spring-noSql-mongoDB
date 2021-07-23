package com.Livrariawc.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Livrariawc.domian.Livro;
import com.Livrariawc.exception.objectNotFoundException;
import com.Livrariawc.repository.LivroRepository;

@Service
public class LivroService {
	
	@Autowired
	private LivroRepository proxybook; 
	
	public List<Livro> findAllLivroService(){
		return proxybook.findAll();
	}
	
	public Livro findById(String id) {
		Optional<Livro> l = proxybook.findById(id);
		return l.orElseThrow(() -> new objectNotFoundException("Objeto não encontrado"));  
	}

	public Livro insertService(Livro lv) {
		return proxybook.insert(lv);
	}
}
