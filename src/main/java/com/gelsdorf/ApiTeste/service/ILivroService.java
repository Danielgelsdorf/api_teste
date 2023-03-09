package com.gelsdorf.ApiTeste.service;

import java.util.ArrayList;

import com.gelsdorf.ApiTeste.model.Livro;

public interface ILivroService {
	public ArrayList<Livro> buscarTodos();

	public Livro buscarId(int id);

	public ArrayList<Livro> buscarNome(String nome);

	public Livro adc(Livro l);
}
