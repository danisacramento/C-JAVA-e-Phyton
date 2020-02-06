package br.com.geekuniversity.secao03;

import java.util.Scanner;

/* Tendo como dados de entrada a altura de uma pessoa, construa um algoritmo
que calcule seu peso ideal, com a seguinte fórmula: (72.7 * altura) - 58 */
 

public class Exercicio07 {

	public static void main(String[] args) {
		//Variáveis
		float altura, peso_ideal;
		Scanner teclado = new Scanner (System.in);
		
		//Entradas
		System.out.println (" Qual a sua altura? ");
		altura = teclado.nextFloat ();
		
		//Processamento
		peso_ideal = (float) (72.7 * altura) - 58;
		
		//Saída
		System.out.println (" Seu peso ideal seria " + peso_ideal);
		
		teclado.close ();
		

	}

}
