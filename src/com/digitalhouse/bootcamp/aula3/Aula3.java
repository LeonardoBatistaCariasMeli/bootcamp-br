package com.digitalhouse.bootcamp.aula3;

import com.digitalhouse.bootcamp.aula3.domain.Celular;
import com.digitalhouse.bootcamp.aula3.domain.Pessoa;
import com.digitalhouse.bootcamp.aula3.domain.interfaces.Precedente;
import com.digitalhouse.bootcamp.aula3.utils.SortUtil;

public class Aula3 {

	public static void main(String[] args) {
		runFirstListExercise1();
	}

	public static void runFirstListExercise1() {
		// Exercicio 1 - 4
		var pessoa1 = new Pessoa("Leonardo", "12345678900");
		var pessoa2 = new Pessoa("Onias", "12345678901");

		if (pessoa1.precedeA(pessoa2)) {
			System.out.println("O " + pessoa1.getNome() + " precede o " + pessoa2.getNome());
		} else {
			System.out.println("O " + pessoa2.getNome() + " precede o " + pessoa1.getNome());
		}

		System.out.println();
		
		// Exercicio 5 - 8
		var pessoa3 = new Pessoa("Gustavo", "12345678902");
		var pessoa4 = new Pessoa("Carolina", "12345678903");
		var pessoa5 = new Pessoa("Nycolas", "12345678904");

		Precedente<Pessoa>[] precedentes = new Precedente[5];
		precedentes[0] = pessoa1;
		precedentes[1] = pessoa2;
		precedentes[2] = pessoa3;
		precedentes[3] = pessoa4;
		precedentes[4] = pessoa5;

		var precedentesResultado = (Precedente<Pessoa>[]) SortUtil.sort(precedentes);

		for (Precedente<Pessoa> precedente : precedentesResultado) {
			Pessoa p = (Pessoa) precedente;
			System.out.println(p.getNome());
		}
		
		System.out.println();

		// Exercicio 9
		var celular1 = new Celular("+55 11 4002-8922", "Leonardo");
		var celular2 = new Celular("+55 11 92222-3333", "Onias");
		var celular3 = new Celular("+55 11 93333-4444", "Gustavo");
		var celular4 = new Celular("+55 11 94444-5555", "Carolina");
		var celular5 = new Celular("+55 11 95555-6666", "Nycolas");

		Precedente<Celular>[] celulares = new Celular[5];
		celulares[0] = celular1;
		celulares[1] = celular2;
		celulares[2] = celular3;
		celulares[3] = celular4;
		celulares[4] = celular5;
		
		var celularesResultado = (Precedente<Celular>[]) SortUtil.sort(celulares);

		for (Precedente<Celular> celular : celularesResultado) {
			Celular c = (Celular) celular;
			System.out.println(c.getHolder());
		}

	}

}
