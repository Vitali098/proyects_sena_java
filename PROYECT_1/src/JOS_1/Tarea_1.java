package JOS_1;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Tarea_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		
		String cadena;
		int entero;
		char letra;
		double decimal;
		
		cadena = JOptionPane.showInputDialog("Diga el String");
		entero = Integer.parseInt(JOptionPane.showInputDialog("Diga el Int"));
		letra = JOptionPane.showInputDialog("Diga el Char").charAt(0);
		decimal = Double.parseDouble(JOptionPane.showInputDialog("Diga el double"));
		
		
		JOptionPane.showMessageDialog(null, cadena);
		JOptionPane.showMessageDialog(null, entero);
		JOptionPane.showConfirmDialog(null, letra);
		JOptionPane.showConfirmDialog(null, decimal);
		
		
		

	}

}
