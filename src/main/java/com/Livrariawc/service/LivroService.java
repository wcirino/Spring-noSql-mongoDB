package com.Livrariawc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Livrariawc.domian.Livro;
import com.Livrariawc.repository.LivroRepository;

@Service
public class LivroService {
	
	@Autowired
	private LivroRepository proxybook; 
	
	public List<Livro> findAllLivroService(){
		return proxybook.findAll();
	}
	
}
