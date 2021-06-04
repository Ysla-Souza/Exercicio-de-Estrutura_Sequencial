package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		//Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
		//hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
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
