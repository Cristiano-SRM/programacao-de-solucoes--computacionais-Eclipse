package javaEstruturaCondicional;
import javax.swing.JOptionPane;
public class EstruturaCondicional1PANEL {

	public static void main(String[] args) {
      String nota1, nota2;
      nota1=JOptionPane.showInputDialog("Informe sua primeira nota: ");
      nota2=JOptionPane.showInputDialog("Informe sua segunda nota: ");
      
      int Nota1=Integer.parseInt(nota1);
      int Nota2=Integer.parseInt(nota2);  
      int media=(Nota1+Nota2)/2;
      
      if (media>=7) {
    	  JOptionPane.showMessageDialog(null, "Aprovado");
      } else {
    	  JOptionPane.showMessageDialog(null, "Reprovado");
      }
    
	}

}
