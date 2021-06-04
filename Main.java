package curso_programacao;

import java.time.LocalDateTime;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//Formatar a virgula
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//Para texto
		String x;
		x = sc.next();		
		System.out.println("Voce digitou: " + x);
		
		//Para numeros inteiros
		int y;
		y = sc.nextInt();
		System.out.println("Voce digitou o numero: " + y);
		
		//Para Double/ponto flutuante
		double z;
		z = sc.nextDouble();
		//printf para formatar a vigula
		System.out.printf("Voce digitou o double: %.2f%n" , z);
		
		//para char
		char a;
		a = sc.next().charAt(0);
		System.out.println("Voce digitou: " + a);
		
		
		String b;
		int c;
		double d;
		b = sc.next();
		c = sc.nextInt();
		d = sc.nextDouble();
		System.out.println("Dados digitados: ");
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
		LocalDateTime myobj = LocalDateTime.now();
		System.out.println(myobj);
		sc.close();
		
		
	} 

}
