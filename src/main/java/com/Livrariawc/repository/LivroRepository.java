package com.Livrariawc.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.Livrariawc.domian.Livro;

@Repository
public interface LivroRepository extends MongoRepository<Livro, String> {

}
