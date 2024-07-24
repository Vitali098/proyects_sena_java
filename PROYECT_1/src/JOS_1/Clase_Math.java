package JOS_1;

import java.util.Scanner;

public class Clase_Math {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		
		long h, s, t;
		
		System.out.println("Digite las horas trabajadas en la semana");
		h = entrada.nextLong();
		System.out.println("Digite el salario por hora");
		s = entrada.nextLong();
		
		t = h * s;
		
		System.out.println("El salario semana es de " + t);
		
	}

}
