package exercicio;

import java.util.Scanner;

public class Exercicio5 {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um valor:");	
		int valor = scanner.nextInt();
		
		System.out.println("Digite outro valor:");	
		int valor2 = scanner.nextInt();
		
		int resultado=valor*valor2;
		System.out.println("A multiplicação dos valores é:"+resultado);
		}
}
