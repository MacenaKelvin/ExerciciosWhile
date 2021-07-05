package br.com.generation.exercicios02;

import java.util.Scanner;

public class Exercicio03 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int idade = 0;
		int TotMenor21 = 0;
		int TotMaior50 = 0;

		while (idade != -99) {
			System.out.println("Digite sua idade quando quiser parar digite -99 : ");
			idade = entrada.nextInt();
			if (idade > 0 && idade < 21  ) {
				TotMenor21++;
			}
			if (idade > 21 && idade > 50) {
				TotMaior50++;
			}
		}

		System.out.println("o Total de menores de 21 é : " + TotMenor21 + "O Total de maiores de 50 é:" + TotMaior50);
	}

}
