package exercicio;

import java.util.Scanner;

public class Exercicio10 {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Qual o valor da diagonal maior");	
		int diagonalMaior = scanner.nextInt();
		
		System.out.println("Qual o valor da diagonal menor");	
		int diagonalMenor = scanner.nextInt();
		
		int resultado = diagonalMaior*diagonalMenor/2;
		System.out.println("A área do losango é: "+ resultado);
		
	}
}
