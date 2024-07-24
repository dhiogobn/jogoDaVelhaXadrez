package atividade2;

import java.util.Scanner;

public class JogoDaVelha {
		
	public static void main(String[] args) {
		String[][] tabuleiro = { 
						{" "," "," "},
						{" "," "," "},
						{" "," "," "}};

		Scanner input = new Scanner(System.in);
		boolean isJogador1 = true;
		int linha;
		int coluna;

		for (int linhaEscolhida = 0; linhaEscolhida < 3; linhaEscolhida++) {
			for (int colunaEscolhida = 0; colunaEscolhida < 3; colunaEscolhida++) {
				if (isJogador1) {
					System.out.println("Escolha a linha jogador 1: ");
					linha = input.nextInt();

					System.out.println("Escolha a coluna jogador 1: ");
					coluna = input.nextInt();

					if (tabuleiro[linha][coluna].equals(" ")){
						tabuleiro[linha][coluna] = "X";
						imprimirTabuleiro(tabuleiro);
						isJogador1 = false;
					}else {
						System.out.println("Este campo ja foi ocupado por outro jogador escolha outra casa.");
					}

				} else {
					System.out.println("Escolha a linha jogador 2: ");
					linha = input.nextInt();

					System.out.println("Escolha a coluna jogador 2: ");
					coluna = input.nextInt();
					if (tabuleiro[linha][coluna].equals(" ")) {
						tabuleiro[linha][coluna] = "O";
						imprimirTabuleiro(tabuleiro);
						isJogador1 = true;
					}else {
						System.out.println("Este campo ja foi ocupado por outro jogador escolha outra casa.");
					}
				}
			}

		}

	}

	public static void imprimirTabuleiro(String[][] tabuleiro) {
		do {
			// impress�o do tabuleiro
			System.out.print("\n\n 0   1    2\n\n");
			for (int posicao1 = 0; posicao1 < 3; posicao1++) {
				for (int posicao2 = 0; posicao2 < 3; posicao2++) {
					System.out.print(" " + tabuleiro[posicao1][posicao2]);
					if (posicao2 < 2) {
						System.out.print(" | ");
					}
					if (posicao2 == 2) {
						System.out.print("  " + posicao1);
					}
				}
				if (posicao1 < 2) {
					System.out.print("\n------------");
				}
				System.out.println("\n");
			}
		} while (false);
	}

}
