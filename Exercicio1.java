package exercicio;

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um valor:");	
		int numero = scanner.nextInt();
		
		int resultado=numero + 1;
		System.out.println("O sucessor do valor é: "+resultado);
		
	}
}
