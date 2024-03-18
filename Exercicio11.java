package exercicio;

import java.util.Scanner;

public class Exercicio11 {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Qual o valor da base maior");	
		int baseMaior = scanner.nextInt();
		
		System.out.println("Qual o valor base menor");	
		int baseMenor = scanner.nextInt();
		
		System.out.println("Qual a altura do trapézio");	
		int altura = scanner.nextInt();
		
		int resultado = (baseMaior+baseMenor)*altura/2;
		System.out.println("A área do trapézio é: "+ resultado);
		
		}
}
