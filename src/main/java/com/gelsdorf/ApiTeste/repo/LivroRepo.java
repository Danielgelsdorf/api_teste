package com.gelsdorf.ApiTeste.repo;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;

import com.gelsdorf.ApiTeste.model.Livro;



public interface LivroRepo extends CrudRepository<Livro, Integer>{
	public ArrayList<Livro> findByTituloContaining(String titulo);
}
