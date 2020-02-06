package br.com.geekuniversity.secao03;

import java.util.Scanner;

/* Faça um algoritmo que peça dois números e imprima a soma.*/

public class Exercicio04 {
	public static void main(String[] args) {
		// Variaveis
		int num1, num2, soma;
		Scanner teclado = new Scanner(System.in);

		// Entradas
		System.out.println("Informe o primeiro número");
		num1 = teclado.nextInt();

		System.out.println("Informe o segundo número");
		num2 = teclado.nextInt();

		// Processamento
		soma = (num1 + num2);

		// Saída
		System.out.println("A soma é:" + soma);

		teclado.close();

	}

}
