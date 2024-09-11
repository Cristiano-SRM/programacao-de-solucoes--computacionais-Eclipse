package javaEstruturaSequencial;
import javax.swing.JOptionPane;
public class estruturaSequencial3PANEL {

	public static void main(String[] args) {
		String dolarValor, dolarUser;
		dolarValor=JOptionPane.showInputDialog("Qual a cotação atual do dolar? ");
		dolarUser=JOptionPane.showInputDialog("Quantos dolares você tem? ");
		Double valordolar=(double) Integer.parseInt(dolarValor);
		Double valoruser=(double) Integer.parseInt(dolarUser);
		Double resultado = (valordolar+valoruser);
		JOptionPane.showInternalMessageDialog(null,"Você tem, em reais: " + resultado);
		
		// problema em ler string com virgulas

	}
}
