package br.com.geekuniversity.secao06;

import java.util.Scanner;

/* Ler uma variável numérica e impimi-la somente se a mesma for maior que 100,
caso contrário, imprimi-la com o valor zero. */

public class Exercicio01 {
	public static void main(String[] args) {
		//Variáveis
		int n;
		Scanner teclado = new Scanner (System.in);
		
		//Entradas
		System.out.println ("Informe um número");
		n = teclado.nextInt ();
		
		//Processamento
		if (n > 100){
			System.out.println (n);
		}
		else {
			n = 0 ;
				System.out.println (n);
		}
		teclado.close ();
	}

}
