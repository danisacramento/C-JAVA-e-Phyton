package br.com.geekuniversity.secao06;

import java.util.Scanner;

/* Ler uma vari�vel num�rica e impimi-la somente se a mesma for maior que 100,
caso contr�rio, imprimi-la com o valor zero. */

public class Exercicio01 {
	public static void main(String[] args) {
		//Vari�veis
		int n;
		Scanner teclado = new Scanner (System.in);
		
		//Entradas
		System.out.println ("Informe um n�mero");
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
