package br.com.geekuniversity.secao03;

import java.util.Scanner;

/* Fa�a um algoritmo para "calcular o estoque m�dio de uma pe�a", sendo que:
estoque_medio = (quantidade_minima +quantidade_maxima)/2 */

public class Exercicio02 {
	public static void main(String[] args) {
		//variaveis
		int quantidade_minima, quantidade_maxima; 
		float estoque_medio;
		Scanner teclado = new Scanner(System.in);
		
		//Entradas
		System.out.println("Informe a quantidade m�nima:");
		quantidade_minima = teclado.nextInt();
		
		System.out.println("Informe a quantidade m�xima:");
		quantidade_maxima = teclado.nextInt();
		
		//Processamento
		estoque_medio = (quantidade_minima + quantidade_maxima)/2;
		
		//Sa�da
		System.out.println("O estoque m�dio � igual:" + estoque_medio);
		
		teclado.close();
		
	}

}
