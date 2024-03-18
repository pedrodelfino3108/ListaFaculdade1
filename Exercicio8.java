package exercicio;

import java.util.Scanner;

public class Exercicio8 {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Qual o valor da base do triângulo");	
		float valor = scanner.nextInt();
		
		System.out.println("Qual o valor da altura do triângulo");	
		float valor2 = scanner.nextInt();
		
		float resultado=valor*valor2/2;
		System.out.println("A area do triângulo é: "+resultado);
		}
}		