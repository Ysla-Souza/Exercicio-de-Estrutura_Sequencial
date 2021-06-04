package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		
		//Fazer um programa para ler o c�digo de uma pe�a 1, o n�mero de pe�as 1, o valor unit�rio de cada pe�a 1, o
		//c�digo de uma pe�a 2, o n�mero de pe�as 2 e o valor unit�rio de cada pe�a 2. Calcule e mostre o valor a ser pago.
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int codpeca1, codpeca2;
		int numpeca1, numpeca2;
		double valorunit_peca1, valorunit_peca2;
		
		codpeca1 = sc.nextInt();
		numpeca1 = sc.nextInt();
		valorunit_peca1 = sc.nextDouble();
		
		codpeca2 = sc.nextInt();
		numpeca2 = sc.nextInt();
		valorunit_peca2 = sc.nextDouble();
		
		double valorPagar = valorunit_peca1 * numpeca1 + valorunit_peca2 * numpeca2;
		
		System.out.printf("VALOR A PAGAR: R$%.2f%n " , valorPagar);
		
		
		sc.close();
		
	}

}
