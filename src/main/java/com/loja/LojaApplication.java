package com.loja;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.loja.domain.Categoria;
import com.loja.repositories.CategoriaRepository;

@SpringBootApplication
public class LojaApplication implements CommandLineRunner {

	@Autowired
	private CategoriaRepository categoriaRepository;

	public static void main(String[] args) {
		SpringApplication.run(LojaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Categoria cat1 = new Categoria(null, "Escritorio");
		Categoria cat2 = new Categoria(null, "Informatica");

		categoriaRepository.saveAll(Arrays.asList(cat1, cat2));

	}

}
