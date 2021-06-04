package curso_programacao;

import java.time.LocalDateTime;

public class ExemplosDeCalculos1 {

	public static void main(String[] args) {
		
		//Exemplo 1
		int x, y;
		x = 5;
		y = 2 * x;
		System.out.println(x);
		System.out.println(y);
		
		//Exemplo 2
		int x2 = 0;
		double y2 = 0;
		x = 5;
		y = 2 * x;
		System.out.println(x2);
		System.out.println(y2);
		
		//Exemplo3
		// .0 para double
		//f para float
		double b, B, h, area;
		b = 6.0;
		B = 8.0;
		h = 5.0;
		area = (b + B) / 2.0 * h;
		System.out.println(area);
		
		//Exemplo 4
		//(double) usando casting para atribuir o double
		int a2, b2;
		double resultado;
		a2 = 5;
		b2= 2;
		resultado = (double) a2 / b2;
		System.out.println(resultado);
		
		//Exemplo 5
		double a3;
		int b1;
		a3 = 5.0;
		b1 = (int) a3;
		System.out.println(b1);
		LocalDateTime myobj = LocalDateTime.now();
		System.out.println(myobj);
	}

}
