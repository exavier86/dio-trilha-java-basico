package application;

import java.util.Locale;
import java.util.Scanner;

public class ContaTreminal {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Por favor, digite o número da Agência !");
		String agencia = sc.nextLine();
		System.out.println("Por favor, digite o número da conta !");
		int numeroDaConta =sc.nextInt();
		System.out.println("Por favor, digite seu nome completo !");
		sc.nextLine();
		String nome = sc.nextLine();
		System.out.println("Por favor, digite o valor do deposito !");
		double saldo = sc.nextDouble();
		
		System.out.printf("Olá " + nome  + " , obrigado por criar uma conta em nosso banco,"
				+ " sua agência é " + agencia
				+ " conta " + numeroDaConta 
				+ " e seu saldo R$ " + saldo 
				+ " já está disponível para saque.");
		
	}

}
