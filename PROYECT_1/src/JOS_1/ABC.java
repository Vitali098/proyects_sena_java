package JOS_1;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class ABC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		String sexo = "", hombre = "H", mujer = "M";
		int edad = 0, can_m = 0, can_h = 0, suma_m = 0, suma_h = 0;
		int pro_m = 0, pro_h = 0;
		int personas = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántas personas asistieron a la fiesta?"));
		
		for(int i=0; i<personas; i++) {
			
			sexo = JOptionPane.showInputDialog("Indique el sexo (H/M)");
			edad = Integer.parseInt(JOptionPane.showInputDialog("Indique la edad"));
			
			while (edad<18 | edad == 0) {
				if(sexo.equalsIgnoreCase(hombre) == true) {
					can_h++;
					suma_h += edad;
					pro_h = suma_h / can_h;
			}
		
			}
			
			 if(sexo.equalsIgnoreCase(mujer) == true) {
				can_m++;
				suma_m += edad;
				pro_m = suma_m / can_m;
			}
		}
			
		
		JOptionPane.showMessageDialog(null, "Hubo " + can_m + " mujeres" + " y el promedio de edad es de " + pro_m);
		JOptionPane.showMessageDialog(null, "Hubo " + can_h + " hombres" + " y el promedio de edad es de " + pro_h);
		
		
	
		
		}
	}
	
