package Pseint;

import javax.swing.JOptionPane;

public class EJE_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		float inversion, interes, intereses, r, tot;
		
		inversion = Float.parseFloat(JOptionPane.showInputDialog("Diga la cantidad de la inversión"));
		interes = Float.parseFloat(JOptionPane.showInputDialog("Diga la tasa de interés anual"));
		
		
		intereses = inversion * (interes/100);
		
		if(interes > 7000) {
			r = interes;
		}
		else {
			r = 0;
		}

		tot = inversion + intereses + r;
		
		JOptionPane.showMessageDialog(null, "Los ingresos son de " + intereses);
		JOptionPane.showMessageDialog(null,"El saldo final es de " + tot);
		
	
	
	}

}
