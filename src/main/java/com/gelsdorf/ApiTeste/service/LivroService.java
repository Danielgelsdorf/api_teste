package com.gelsdorf.ApiTeste.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.gelsdorf.ApiTeste.model.Livro;
import com.gelsdorf.ApiTeste.repo.LivroRepo;

@Component
public class LivroService implements ILivroService {
	@Autowired
	private LivroRepo repo;

	@Override
	public ArrayList<Livro> buscarTodos() {
		// TODO Auto-generated method stub
		return (ArrayList<Livro>) repo.findAll();
	}

	@Override
	public Livro buscarId(int id) {
		// TODO Auto-generated method stub
		return repo.findById(id).orElse(null);
	}

	@Override
	public ArrayList<Livro> buscarNome(String titulo) {
		// TODO Auto-generated method stub
		return repo.findByTituloContaining(titulo);
	}

	@Override
	public Livro adc(Livro l) {
		// TODO Auto-generated method stub
		return repo.save(l);
	}

}
