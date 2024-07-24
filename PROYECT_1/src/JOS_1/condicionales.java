package JOS_1;

import javax.swing.JOptionPane;

public class condicionales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		long a;
		
		a = Long.parseLong(JOptionPane.showInputDialog("Diga un número"));
		
		
		if(a > 0) {
			JOptionPane.showMessageDialog(null, "Es positivo");
		}
		if(a < 0) {
			JOptionPane.showMessageDialog(null, "Es negativo");
		}
		if (a == 0) {
			JOptionPane.showMessageDialog(null, "Es cero");
		}

	
	
	}

}
