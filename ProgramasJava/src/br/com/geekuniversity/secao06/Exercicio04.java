package br.com.geekuniversity.secao06;

import java.util.Scanner;

/* Tendo como entrada a altura e o sexo de uma pessoa, construa um algoritmo que calcule seu peso ideal, 
 * utilizando as seguintes f�rmulas:
 * Para homens: (72.7 *altura) -58;
 * Para mulheres (62.1 * altura) - 44.7
 */

public class Exercicio04 {
	public static void main (String[] args) {
		//Variaveis
		float altura, peso_ideal;
		char sexo;
		Scanner teclado = new Scanner (System.in);
		//Entrada
		System.out.println ("Informe sua altura:");
		altura = teclado.nextFloat();
		
		System.out.println ("Informe o sexo m/f");
		sexo = teclado.next().charAt(0);
		//Processamento
		if (sexo == 'm') { // aspas simples - um caracter; aspas duplas - uma string 
			peso_ideal = (float) (72.7 * altura) - 58;
			System.out.printf ("Seu peso ideal � %.2f", peso_ideal);
			
		} else if(sexo == 'f') {
			peso_ideal = (float) (62.1 * altura) - (float) 44.7;
			System.out.printf ("Seu peso ideal � %.2f", peso_ideal);
			
		} else if (sexo!= 'm' && sexo != 'f'){
			System.out.println ("Sexo n�o reconhecido");
		peso_ideal = 0;
		}
		teclado.close();
	}	

}


