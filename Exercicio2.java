package exercicio;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um valor:");	
		int valor = scanner.nextInt();
		
		int resultado=valor - 1;
		System.out.println("O antecessor do valor é:"+resultado);
	}
}
