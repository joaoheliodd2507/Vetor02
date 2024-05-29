package Vetor2;

import java.util.Scanner;

public class Vetor2 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int a[] = new int [5];
		int soma=0;

		for (int i =0; i<=4; i++) {	
			System.out.println("Digite o valor:" );
			a[i]= ler.nextInt();

			soma = soma + a[i];
		}
		if(soma>30) {
			System.out.println("O valor é maio que 30, a soma é = " + soma);
		}
		else {
			System.out.println("O valor é menor que 30, a soma é = " + soma);
		}
	}
}
