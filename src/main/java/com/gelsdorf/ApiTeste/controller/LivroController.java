	package com.gelsdorf.ApiTeste.controller;
	
	import java.util.ArrayList;
	
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.http.ResponseEntity;
	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.PathVariable;
	import org.springframework.web.bind.annotation.PostMapping;
	import org.springframework.web.bind.annotation.RequestBody;
	import org.springframework.web.bind.annotation.RequestParam;
	import org.springframework.web.bind.annotation.RestController;
	
	import com.gelsdorf.ApiTeste.model.Livro;
	import com.gelsdorf.ApiTeste.service.ILivroService;
	
	@RestController
	public class LivroController {
		@Autowired
		private ILivroService service;
	
		@GetMapping("/livro")
		public ArrayList<Livro> buscarTodos() {
			return service.buscarTodos();
		}
	
		@GetMapping("/Livro/{id}")
		public ResponseEntity<?> BuscarId(@PathVariable int id) {
			Livro l = service.buscarId(id);
			if (l != null) {
				return ResponseEntity.ok(l);
			}
			return ResponseEntity.notFound().build();
		}
	
		@PostMapping("/livro")
		public ResponseEntity<?> adc(@RequestBody Livro l) {
			Livro res = service.adc(l);
			if (res != null) {
				return ResponseEntity.ok(l);
			}
			return ResponseEntity.badRequest().build();
		}
	
		@GetMapping("/livro/busca")
		public ResponseEntity<?> buscarNome(@RequestParam(name = "titulo") String titulo) {
			ArrayList<Livro> li = service.buscarNome(titulo);
			if (li.size() > 0) {
				return ResponseEntity.ok(li);
			}
			return ResponseEntity.notFound().build();
		}
	}
