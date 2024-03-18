package exercicio;

import java.util.Scanner;

public class Exercicio12 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual o valor do raio");	
		double raio = sc.nextInt();
		
		double pi = Math.PI;
		
		double resultado= pi * Math.pow(raio, 2);
		System.out.println("A área do circulo é: "+ resultado);
		
		}
}
