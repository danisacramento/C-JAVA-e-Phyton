package br.com.geekuniversity.secao06;

import java.util.Scanner;

/* João precisa que você faça um algoritmo que leia a variável 'p' (peso de peixes) e 
 * verifique se há excesso. Se houver, gravar na variável 'e' (excesso) e na variável 'm', o valor
 * da multa que João deverá pagar. Caso contrário, mostrar tais variáveis com o conteúdo 'zero'.
 */

public class Exercicio05 {

	public static void main(String[] args) {
		//Variáveis 
		float p, m;
		String e = "excesso";
		Scanner teclado = new Scanner (System.in);
		//Entradas
		System.out.println("Informe o peso dos peixes:");
		p = teclado.nextFloat ();
		//Processamento
		if (p>50) {
			m = (float) (p - 50) * (float) 4.00;
		//Saídas
			System.out.printf("Você deverá pagar R$ %.2f em multas", m);
		} else {
			m = 0;
			e = "0";
			System.out.println ("Multas:" + m);
			System.out.println ("Excesso:" + e);
		}
		teclado.close ();
	}

}

