package com.gelsdorf.ApiTeste.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Testando {
@GetMapping("/")
public String mostrar() {
	return "<h1> livros</h1><br> mostrando a pagina home</br>";
}
}
