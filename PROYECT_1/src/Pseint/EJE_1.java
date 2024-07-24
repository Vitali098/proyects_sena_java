package Pseint;

import javax.swing.JOptionPane;

public class EJE_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String pais, capital;
	
	pais = JOptionPane.showInputDialog("Diga el país");
	capital = JOptionPane.showInputDialog("Diga la capital");
	
	JOptionPane.showMessageDialog(null, capital + " es la capital de " + pais);
	}

}
