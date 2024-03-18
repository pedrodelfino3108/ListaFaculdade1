package exercicio;

import java.util.Scanner;

public class Exercicio9 {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Qual o valor da base do quadrado");	
		int valor = scanner.nextInt();
		
		int resultado=valor*valor;
		System.out.println("A área do quadrado é: "+ resultado);
		
	}
}
