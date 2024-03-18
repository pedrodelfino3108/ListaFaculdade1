package exercicio;

import java.util.Scanner;

public class Exercicio7 {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Qual o valor da base do retângulo");	
		int valor = scanner.nextInt();
		
		System.out.println("Qual o valor da altura do retângulo");	
		int valor2 = scanner.nextInt();
		
		int resultado=valor*valor2;
		System.out.println("A area do retângulo é: "+resultado);
		}
}