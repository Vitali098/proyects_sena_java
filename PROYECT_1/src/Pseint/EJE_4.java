package Pseint;

import javax.swing.JOptionPane;

public class EJE_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n;
		float aumento;
		n = (int)(Math.random() * 200);
		
		JOptionPane.showMessageDialog(null, "El número escogido es " + n);
		
		aumento = n + (n * 0.3f);
		
		JOptionPane.showMessageDialog(null, "Aumentado al 30 % da: " + aumento);
		
		
	}

}
