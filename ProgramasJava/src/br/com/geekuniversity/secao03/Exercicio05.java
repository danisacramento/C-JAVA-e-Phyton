package br.com.geekuniversity.secao03;

import java.util.Scanner;

/* Fa�a um algoritmo que converta metros para centimetros */

public class Exercicio05 {
	
	public static void main(String[] args) {
		//Variaveis
		int metros, centimetros;
		Scanner teclado = new Scanner (System.in);
		
		//Entradas
		System.out.println ("Informe o valor em metros:");
		metros = teclado.nextInt();
		
		//Processamento
		centimetros = (metros * 100);
		
		//Sa�da
		System.out.println (metros + " metros em cent�metros � " + centimetros);
		
		teclado.close();
		
	}
	

}
