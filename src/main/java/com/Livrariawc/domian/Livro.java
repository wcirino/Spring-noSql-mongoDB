package com.Livrariawc.domian;

import java.io.Serializable;
import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "livro")
public class Livro implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	private String id;
	private String titulo;
	private String datalanc;
	private String datacadas;
	private String codgenero;
	private String codautor;
	private String numpag;
	private String ativo;


}
