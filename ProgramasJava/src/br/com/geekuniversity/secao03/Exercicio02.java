package br.com.geekuniversity.secao03;

import java.util.Scanner;

/* Faça um algoritmo para "calcular o estoque médio de uma peça", sendo que:
estoque_medio = (quantidade_minima +quantidade_maxima)/2 */

public class Exercicio02 {
	public static void main(String[] args) {
		//variaveis
		int quantidade_minima, quantidade_maxima; 
		float estoque_medio;
		Scanner teclado = new Scanner(System.in);
		
		//Entradas
		System.out.println("Informe a quantidade mínima:");
		quantidade_minima = teclado.nextInt();
		
		System.out.println("Informe a quantidade máxima:");
		quantidade_maxima = teclado.nextInt();
		
		//Processamento
		estoque_medio = (quantidade_minima + quantidade_maxima)/2;
		
		//Saída
		System.out.println("O estoque médio é igual:" + estoque_medio);
		
		teclado.close();
		
	}

}
