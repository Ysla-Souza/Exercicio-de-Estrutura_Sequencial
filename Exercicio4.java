package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		//Fazer um programa que leia o n�mero de um funcion�rio, seu n�mero de horas trabalhadas, o valor que recebe por
		//hora e calcula o sal�rio desse funcion�rio. A seguir, mostre o n�mero e o sal�rio do funcion�rio, com duas casas
		//decimais.
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int numeroFuncionario;
		int horasTrabalhadas;
		double salario;
		
		numeroFuncionario = sc.nextInt();
		horasTrabalhadas = sc.nextInt();
		salario = sc.nextDouble();
		
		double calculo = horasTrabalhadas * salario;
		
		System.out.println("Numero = " + numeroFuncionario);
		System.out.printf("Salario = U$ %.2f%n" , calculo);
	}

}
