package br.com.geekuniversity.secao06;

import java.util.Scanner;

/* Ler um n�mero e verificar se ele � par ou impar. Quando for par, armazenar esse valor 
em 'p' e, quando for impar,armazen�-lo em 'i'. 
Exibir 'p' e 'i' no final do processamento.*/

public class Exercicio03 {
	public static void main(String[] args) {
		//Vari�veis
		int numero, p = 0, i = 0;
		Scanner teclado = new Scanner (System.in);
		
		//Entrada
		System.out.println ("Informe um n�mero: ");
		numero = teclado.nextInt ();
		
		//Processamento
		if (numero % 2 == 0) {
			p = numero;
		}else {
			i = numero;
		}
		System.out.println(p);
		System.out.println(i);
		teclado.close();
	}

}
