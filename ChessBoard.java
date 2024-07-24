package atividade2;

import java.util.Scanner;

public class ChessBoard {
	public static void main(String[] args) {
		
		String[][] board = { 
				{"R","N","B","Q","K","B","N","R"},
				{"P","P","P","P","P","P","P","P"},
				{" "," "," "," "," "," "," "," "},
				{" "," "," "," "," "," "," "," "},
				{" "," "," "," "," "," "," "," "},
				{" "," "," "," "," "," "," "," "},
				{"p","p","p","p","p","p","p","p"},
				{"r","n","b","q","k","b","n","r"}};

		 for (int i = 0; i < board.length; i++) {
		        for (int j = 0; j < board[i].length; j++) {
		        	System.out.print(board[i][j]+"  ");
		        }
		        System.out.println("");
		    }
		 
		 //Mover Cavalo
		 System.out.println("");
		 board[5][5] = board[7][6];
		 board[7][6] = "";

		 for (int i = 0; i < board.length; i++) {
		        for (int j = 0; j < board[i].length; j++) {
		        	System.out.print(board[i][j]+"  ");
		        }
		        System.out.println("");
		    }

		// Mover Peão
		Scanner input = new Scanner(System.in);

		System.out.println("Escolha o peão que irá se movimentar nos informando a linha e a coluna dele: ");
		System.out.print("Linha: ");
		int linha = input.nextInt();
		System.out.print("Coluna: ");
		int coluna = input.nextInt();

		// Movimentação inicial pode ser de 1 ou 2 casas
		int numeroDeCasas = 1;
		if ((linha == 1 && board[linha][coluna].equals("P")) || (linha == 6 && board[linha][coluna].equals("p"))) {
			System.out.println("Deseja avançar 1 ou 2 casas?");
			numeroDeCasas = input.nextInt();
		}

		// Verificação de posição ocupada
		boolean isOcupada = false;
		if (board[linha][coluna].equals("P")) {
			if (board[linha + numeroDeCasas][coluna].equals(" ")) {
				board[linha + numeroDeCasas][coluna] = "P";
				board[linha][coluna] = " ";
			} else {
				System.out.println("Esta casa já está ocupada por alguma peça.");
				isOcupada = true;
			}
		} else if (board[linha][coluna].equals("p")) {
			if (board[linha - numeroDeCasas][coluna].equals(" ")) {
				board[linha - numeroDeCasas][coluna] = "p";
				board[linha][coluna] = " ";
			} else {
				System.out.println("Esta casa já está ocupada por alguma peça.");
				isOcupada = true;
			}
		} else {
			System.out.println("Posição inválida ou não é um peão.");
		}

		if (!isOcupada) {
			imprimirBoard(board);
		}
		 //imprimirBoard(board);
	}
	
	// --------------Impress�o do Tabuleiro---------------------------------------
	public static void imprimirBoard(String[][] board) {
		 for (int i = 0; i < board.length; i++) {
		        for (int j = 0; j < board[i].length; j++) {
		        	System.out.print(board[i][j]+"  ");
		        }
		        System.out.println("");
		    }
	}

	public void moverPeao(String[][] tabuleiro) {

	}
}
