package br.com.geekuniversity.secao07;

/* Elabore um programa que gera e escreve os n�meros �mpares dos n�meros entre 100 e 200 */

public class Exercicio03 {
	public static void main(String[] args) {
		for (int i = 100; i <= 200; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}

	}

}
