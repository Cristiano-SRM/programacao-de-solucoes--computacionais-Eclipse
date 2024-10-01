package javaEstruturaCondicional;
import javax.swing.JOptionPane;

public class EstruturaCondicional4PANEL {

	public static void main(String[] args) {
     String peso, altura;
     peso=JOptionPane.showInputDialog("Informe seu peso: ");
     altura=JOptionPane.showInputDialog("Informe sua altura: ");
     double Peso=Double.parseDouble(peso);
     double Altura=Double.parseDouble(altura);
     
     double imc=Peso/(Math.pow(Altura, 2));
     if (imc<20) {
   	 JOptionPane.showMessageDialog(null,"Abaixo do peso" );
     }
     if (imc>=20 && imc<=25) {
     JOptionPane.showMessageDialog(null,"Normal");
     }
     if (imc>=25 && imc<=30) {
     JOptionPane.showMessageDialog(null,"Sobrepeso");
     }
     if (imc>=30 && imc<=40) {
     JOptionPane.showMessageDialog(null,"Obesidade");
	}
  }
}