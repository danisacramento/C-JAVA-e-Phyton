package br.com.geekuniversity.secao03;

import java.util.Scanner;

/* Fa�a um algoritmo que pe�a dois n�meros e imprima a soma.*/

public class Exercicio04 {
	public static void main(String[] args) {
		// Variaveis
		int num1, num2, soma;
		Scanner teclado = new Scanner(System.in);

		// Entradas
		System.out.println("Informe o primeiro n�mero");
		num1 = teclado.nextInt();

		System.out.println("Informe o segundo n�mero");
		num2 = teclado.nextInt();

		// Processamento
		soma = (num1 + num2);

		// Sa�da
		System.out.println("A soma �:" + soma);

		teclado.close();

	}

}
