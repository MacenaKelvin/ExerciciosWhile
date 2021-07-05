package br.com.generation.exercicios02;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		 Scanner ler = new Scanner(System.in);

	        int numero, soma = 0;

	        do {
	            System.out.print("Informe um nº para a soma (quando desejar finalizar a soma digite 0): ");
	            numero = ler.nextInt();
	            soma += numero;
	        }
	        while(numero != 0);

	        System.out.println("A soma dos números digitados é: " + soma);

	        

	}

}
