package com.dio;

import com.dio.model.Gato;

public class PrimeiroPrograma {

	public static void main(String[] args) {
		
		Gato gato = new Gato();
		Livros livro = new Livros();
		
		System.out.println(gato);
		
		int a = 2;
		int b = 3;
		System.out.println("Hello Wordl!" + (a + b));
<<<<<<< HEAD

=======
		int soma = (a + b) / 2;
>>>>>>> bd3c780b35a80806252128a37efde6dc694b47e5
	}

}

class Livros {
	private String nome;
	private String npag;
}