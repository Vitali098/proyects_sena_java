package Pseint;

import javax.swing.JOptionPane;

public class EJE_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		float pi, r, h, v;
		pi = (float) Math.PI;
		
		r = Float.parseFloat(JOptionPane.showInputDialog("Digite el radio del cilindro"));
		h = Float.parseFloat(JOptionPane.showInputDialog("Digite la altura"));
		
		v = (float) (pi * Math.pow(r, 2) * h);
		
		JOptionPane.showMessageDialog(null, "El volumen del cilindro es " + v);
		
	}

}
