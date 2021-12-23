package calculador;

import java.util.Scanner;

public class calculadora {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a, b;
		
		System.out.println ("digite o primeiro valor: ");
		a = scan.nextInt();
		System.out.println("digite o segundo valor :");
		b = scan.nextInt();
		
		int soma = soma(a,b);
		int subtracao = subtracao(a,b);
		int multiplicacao = multiplicacao (a,b);
		int divisao = divisao (a,b);
		
		System.out.println("a soma é: " + soma);
		System.out.println("a sub é: " + subtracao);
		System.out.println("a multiplicacao é: " + multiplicacao);
		System.out.println("a div é: " + divisao); 
		
		
	}

	public static int soma (int a, int b) {
		return a +b;
		
	}
	
	public static int subtracao (int a, int b) {
		return a - b;
	}
	
	public static int divisao( int a, int b) {
		return a / b;
	}
	public static int multiplicacao( int a, int b) {
		return a * b;
		
	}
}
