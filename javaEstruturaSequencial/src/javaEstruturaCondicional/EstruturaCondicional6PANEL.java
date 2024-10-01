package javaEstruturaCondicional;
import javax.swing.JOptionPane;

public class EstruturaCondicional6PANEL {

	public static void main(String[] args) {
		String Lado1, Lado2, Lado3;
		Lado1=JOptionPane.showInputDialog("Informe o primeiro lado do triangulo: ");
		Lado2=JOptionPane.showInputDialog("Informe o segundo lado do triangulo: ");
		Lado3=JOptionPane.showInputDialog("Informe o terceiro e ultimo lado do triangulo: ");
		
		double lado1=Double.parseDouble(Lado1);
		double lado2=Double.parseDouble(Lado2);
		double lado3=Double.parseDouble(Lado3);
		
		if(Math.abs(lado2-lado3)<lado1 && lado1<(lado2+lado3)) {
	    	 if(Math.abs(lado1-lado3)<lado2 && lado2<(lado1+lado3)) 
	    		 if(Math.abs(lado1-lado2)<lado3 && lado3<(lado1+lado2)) 
	    	    	 JOptionPane.showMessageDialog(null,"Triangulo Verdadeiro."); 
	    		 } else {
	    			 JOptionPane.showMessageDialog(null,"Triangulo Falso.");
	    	       }
	}

}
