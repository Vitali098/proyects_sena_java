package Pseint;

import javax.swing.JOptionPane;

public class EJE_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		float n;
		
		n = Float.parseFloat(JOptionPane.showInputDialog("Digite un número"));
		
		if(n>0) {
			JOptionPane.showMessageDialog(null, "Es positivo");
		}
		if(n<0){
			JOptionPane.showMessageDialog(null, "Es negativo");
		}
		if(n == 0) {
			JOptionPane.showMessageDialog(null, "Es nulo");
		}
	}

}
