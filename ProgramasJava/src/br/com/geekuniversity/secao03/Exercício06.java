package br.com.geekuniversity.secao03;

import java.util.Scanner;

/* Fa�a um algoritmo que pergunte quanto voc� ganha por hora e o n�mero de horas 
trabalhadas no m�s.
 * Calcule e mostre o total do seu sal�rio no referido m�s. */

public class Exerc�cio06 {

	public static void main(String[] args) {
		// Vari�veis
		float valor_por_hora, salario;
		int horas_trabalhadas;
		Scanner teclado = new Scanner(System.in);

		// Entradas
		System.out.println("Qual o valor que voc� ganha por hora");
		valor_por_hora = teclado.nextFloat();

		System.out.println("Quantas horas voc� trabalhou nesse m�s");
		horas_trabalhadas = teclado.nextInt();

		// Processamento
		salario = (horas_trabalhadas * valor_por_hora);

		// Sa�da
		System.out.println(" Neste m�s voc� vai receber: R$ " + salario);

		teclado.close();

	}

}
