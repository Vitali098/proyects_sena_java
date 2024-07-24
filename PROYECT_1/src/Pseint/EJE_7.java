package Pseint;

import javax.swing.JOptionPane;

public class EJE_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n1,n2,n3,max;
		n1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer número"));
		n2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo número"));
		n3 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tercer número"));
		
		max = (int)(Math.max(n1, n2));
		
		JOptionPane.showMessageDialog(null, "El número mayo es " + max);


	
	
	}

}
