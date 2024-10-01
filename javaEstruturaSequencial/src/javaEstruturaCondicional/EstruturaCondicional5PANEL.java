package javaEstruturaCondicional;
import javax.swing.JOptionPane;

public class EstruturaCondicional5PANEL {
	public static void main(String[] args) {
		String Valor;
		Valor=JOptionPane.showInputDialog("Informe o valor para incrementar à função: ");
		double valor=Double.parseDouble(Valor);
		if(valor<-2) {
	        valor=(2*valor)+2;
	        JOptionPane.showMessageDialog(null,"A saída é: "+ valor);
	        }
	        if(valor>=3) {
	        valor=-valor;
	        JOptionPane.showMessageDialog(null,"A saída é: "+ valor);
	        }
	        if(valor>=-2 && valor<3) {
	        valor=3;
	        JOptionPane.showMessageDialog(null,"A saída é: "+ valor);
	        }
	}

}
