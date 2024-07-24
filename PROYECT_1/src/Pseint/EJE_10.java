package Pseint;

import javax.swing.JOptionPane;

public class EJE_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float n1,n2,n3, pro;
		
		n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite la nota uno"));
		n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite la nota dos"));
		n3 = Integer.parseInt(JOptionPane.showInputDialog("Digite la nota tres"));

		pro = (n1+n2+n3)/3;
		
		if(pro >= 70) {
			JOptionPane.showMessageDialog(null, "El estudiate aprobó");
		}
		else {
			JOptionPane.showMessageDialog(null, "El estudiate desaprobó");
		}
	}

}
