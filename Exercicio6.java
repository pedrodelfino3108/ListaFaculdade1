package exercicio;

import java.util.Scanner;

public class Exercicio6 {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um valor:");	
		float valor = scanner.nextInt();
		
		System.out.println("Digite outro valor:");	
		float valor2 = scanner.nextInt();
		
		float resultado=valor/valor2;
		System.out.println("A divisão dos valores é:"+resultado);
	} 
}
