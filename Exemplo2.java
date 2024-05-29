package Vetor2;

import java.util.ArrayList;
import java.util.Arrays;

public class Exemplo2 {

	public static void main(String[] args) {
		String[] disciplinas = {"matematica", "filosofia", "historia", "fisica"};
		ArrayList<String> novaLista = new ArrayList<String>(Arrays.asList(disciplinas));
		novaLista.add("geografia");
		novaLista.add("Lingua inglesa");

		for (String i: novaLista)
		{
			System.out.println("Disciplina: " + i);

		}

	}
}
