package com.etec.paulohenrique.projeto.agenda10;

import java.util.Scanner;

public class Main {

	/*
	 * Atividade:
	 * 
	 * Paulo, o estudante do Ensino Médio que você conheceu no Mergulhando no Tema,
	 * agora deseja criar um programa que realize a soma de todos os elementos de
	 * uma matriz 3x3, contendo números inteiros. Elabore a codificação em linguagem
	 * Java de um software que resolva o problema de Paulo.
	 * 
	 * IMPORTANTE: O programa deverá solicitar a digitação dos valores e armazenar
	 * numa matriz 3x3.
	 */

	public static void main(String[] args) {

		// declaração das variaveis
		Scanner scan = new Scanner(System.in);
		int[][] matrizA = new int[3][3];
		int[][] matrizB = new int[3][3];
		int[][] matrizC = new int[3][3];

		System.out.println("Primeiro vamos preencher a matriz A");

		// loop for para atribuição da matriz A
		atribuidorDeMatriz(scan, matrizA);
		
		// loop for para atribuição da matriz B
		System.out.println("Agora vamos preencher a matriz B");
		atribuidorDeMatriz(scan, matrizB);
		
		// calculo para atribuição da matriz C
		for (int linha = 0; linha < 3; linha++) {
			for (int coluna = 0; coluna < 3; coluna++) {
				matrizC[linha][coluna] = matrizA[linha][coluna] + matrizB[linha][coluna];
			}
		}

		System.out.println(); // espaço para separação

		// mensagem final com um System.out com os elementos da matriz C
		System.out.println("Matriz C:");
		System.out.println("-------------------"); // linha divisória

		for (int linha = 0; linha < 3; linha++) {
			for (int coluna = 0; coluna < 3; coluna++) {
				System.out.printf("%5d ", matrizC[linha][coluna]); // formatação da célula
			}
			System.out.println(); // quebra de linha após cada linha da matriz
		}

		System.out.println("-------------------"); // linha divisória
	}

	static void atribuidorDeMatriz(Scanner scan, int[][] matriz) {
		for (int linha = 0; linha < 3; linha++) {
			for (int coluna = 0; coluna < 3; coluna++) {
				System.out.println("Entre com o elemento da linha " + linha + " coluna " + coluna);
				matriz[linha][coluna] = scan.nextInt();
			}
		}
	}
}
