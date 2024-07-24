package Pseint;

import javax.swing.JOptionPane;

public class EJE_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n, doble, triple;
		
		n = Integer.parseInt(JOptionPane.showInputDialog("Digite un número"));
		
		doble = (int)Math.pow(n, 2);
		triple = (int)Math.pow(n, 3);
		
		JOptionPane.showMessageDialog(null, "El doble de " + n + " es " + doble + " y el triple es " + triple);
		

	}

}
