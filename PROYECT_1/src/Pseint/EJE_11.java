package Pseint;

import javax.swing.JOptionPane;

public class EJE_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		float tiempo, tot1, tot2;
		String actividad;
		
		 actividad = JOptionPane.showInputDialog("¿Qué actividad realizó?");
		 tiempo = Integer.parseInt(JOptionPane.showInputDialog("Cuánto tiempo demoró realizandola (en minutos)?"));
		 
		 if(actividad.equals( "dormido")) {
			 tot1 =	 tiempo * 1.08f;
			 JOptionPane.showMessageDialog(null, "La persona consumió " + tot1);
		 }
		 if ( actividad.equals("sentado")){
			 tot2 = tiempo * 1.66f;
			 JOptionPane.showMessageDialog(null, "La persona consumió " + tot2);
		 }
		 
		 
		 
		 
		 
		


		
		
		
	}

}
