package br.com.geekuniversity.secao06;

import java.util.Scanner;

/* Elabore um algoritmo que leia um n�mero. Se positivo armazene-o em 'a', se for negativo, em 'b'.
 * No final mostrar o resultado. */
 

public class Exercicio02 {

	public static void main(String[] args) {
		//Variaveis
		int numero, a, b;
		Scanner teclado = new Scanner (System.in);
		
		//Entrada
		System.out.println (" Informe um n�mero: ");
		numero = teclado.nextInt ();
		
		//Processamento
		if (numero > 0) {
			a = numero;
			//Sa�da
			System.out.println(a);
		}else {
			b = numero;
			//Sa�da
			System.out.println(b);
		}
		teclado.close ();

	}

}