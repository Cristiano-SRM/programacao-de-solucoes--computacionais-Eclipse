package javaEstruturaCondicional;
import javax.swing.JOptionPane;

public class EstruturaCondicional2PANEL {
	public static void main(String[] args) {
      String lado1, lado2, lado3;
     lado1= JOptionPane.showInputDialog("Informe o primeiro lado do triangulo: ");
     lado2=JOptionPane.showInputDialog("Inofrme o segundo lado do triangulo: ");
     lado3=JOptionPane.showInputDialog("Informe o terceiro e ultimo lado do triangulo: ");
     
     int Lado1=Integer.parseInt(lado1);
     int Lado2=Integer.parseInt(lado2);
     int Lado3=Integer.parseInt(lado3);
     
     if (Lado1==Lado3 || Lado2==Lado3 || Lado2==Lado1) {
    	 if (Lado1==Lado3 && Lado2==Lado3 && Lado1==Lado2) {
    		 JOptionPane.showMessageDialog(null, "O triangulo é equilatero");
    	 } else {
    		 JOptionPane.showMessageDialog(null, "O triangulo é isosceles");
    	 }
     }
     if (Lado1!=Lado2 && Lado1!=Lado3 && Lado2!=Lado3) {
    	 JOptionPane.showMessageDialog(null, "O triangulo é escaleno");
     }
	}

}
