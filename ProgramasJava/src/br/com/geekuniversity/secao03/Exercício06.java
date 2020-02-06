package br.com.geekuniversity.secao03;

import java.util.Scanner;

/* Faça um algoritmo que pergunte quanto você ganha por hora e o número de horas 
trabalhadas no mês.
 * Calcule e mostre o total do seu salário no referido mês. */

public class Exercício06 {

	public static void main(String[] args) {
		// Variáveis
		float valor_por_hora, salario;
		int horas_trabalhadas;
		Scanner teclado = new Scanner(System.in);

		// Entradas
		System.out.println("Qual o valor que você ganha por hora");
		valor_por_hora = teclado.nextFloat();

		System.out.println("Quantas horas você trabalhou nesse mês");
		horas_trabalhadas = teclado.nextInt();

		// Processamento
		salario = (horas_trabalhadas * valor_por_hora);

		// Saída
		System.out.println(" Neste mês você vai receber: R$ " + salario);

		teclado.close();

	}

}
