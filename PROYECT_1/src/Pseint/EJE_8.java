package Pseint;

import javax.swing.JOptionPane;

public class EJE_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		float a, b, c;
		
		a = Float.parseFloat(JOptionPane.showInputDialog("Digite el valor del lado A"));
		b = Float.parseFloat(JOptionPane.showInputDialog("Digite el valor del lado B"));
		c = Float.parseFloat(JOptionPane.showInputDialog("Digite el valor del lado C"));
		
		if(a == b && b != c) {
			JOptionPane.showMessageDialog(null, "Es un triángulo isósceles");
		}
		if(a == b && b == c) {
			JOptionPane.showMessageDialog(null, "Es un triángulo equilátero");
		}
		if(a != b && b != c) {
			JOptionPane.showMessageDialog(null, "Es un triángulo escaleno");
		}
	}

}
