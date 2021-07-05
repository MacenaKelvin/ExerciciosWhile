package br.com.generation.exercicios02;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int num, contPar = 0, contImpar = 0;

		for (int i = 1; i <= 10; i++) {
			System.out.println("Digite o " + i + "º número");
			num = ler.nextInt();

			if (num % 2 == 0) {
				contPar++;
			}

			if (num % 2 == 1) {
				contImpar++;
			}

		}

		System.out.println("Foram digitados " + contPar + " números pares \n");
		System.out.println("E " + contImpar + " números ímpares");

	}
}
