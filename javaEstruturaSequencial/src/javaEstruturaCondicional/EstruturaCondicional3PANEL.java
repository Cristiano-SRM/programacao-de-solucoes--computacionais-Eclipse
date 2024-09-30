package javaEstruturaCondicional;
import javax.swing.JOptionPane;

public class EstruturaCondicional3PANEL {
	public static void main(String[] args) {
      String Nota1, Nota2, Nota3;
      Nota1=JOptionPane.showInputDialog("Informe a primeira nota no intervalo de [0,10]: ");
      Nota2=JOptionPane.showInputDialog("Informe sua segunda nota no intervalo de [0,10]: ");
      Nota3=JOptionPane.showInputDialog("Informe a terceira nota no intervalo de [0,10]: ");
      
      int nota1=Integer.parseInt(Nota1);
      int nota2=Integer.parseInt(Nota2);
      int nota3=Integer.parseInt(Nota3);
      int media=(nota1+nota2+nota3)/3;
      
      if (media>=0 && media<3) {
      	JOptionPane.showMessageDialog(null,"Reprovado");
      }
      if (media>=3 && media<7) {
        JOptionPane.showMessageDialog(null,"Exame");
      }
      if (media>=7 && media<=10) {
        JOptionPane.showMessageDialog(null,"Aprovado");
      }
	}
}


