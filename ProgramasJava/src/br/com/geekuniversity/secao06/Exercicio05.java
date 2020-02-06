package br.com.geekuniversity.secao06;

import java.util.Scanner;

/* Jo�o precisa que voc� fa�a um algoritmo que leia a vari�vel 'p' (peso de peixes) e 
 * verifique se h� excesso. Se houver, gravar na vari�vel 'e' (excesso) e na vari�vel 'm', o valor
 * da multa que Jo�o dever� pagar. Caso contr�rio, mostrar tais vari�veis com o conte�do 'zero'.
 */

public class Exercicio05 {

	public static void main(String[] args) {
		//Vari�veis 
		float p, m;
		String e = "excesso";
		Scanner teclado = new Scanner (System.in);
		//Entradas
		System.out.println("Informe o peso dos peixes:");
		p = teclado.nextFloat ();
		//Processamento
		if (p>50) {
			m = (float) (p - 50) * (float) 4.00;
		//Sa�das
			System.out.printf("Voc� dever� pagar R$ %.2f em multas", m);
		} else {
			m = 0;
			e = "0";
			System.out.println ("Multas:" + m);
			System.out.println ("Excesso:" + e);
		}
		teclado.close ();
	}

}

