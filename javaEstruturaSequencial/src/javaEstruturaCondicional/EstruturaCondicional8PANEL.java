package javaEstruturaCondicional;
import javax.swing.JOptionPane;
public class EstruturaCondicional8PANEL {
	public static void main(String[] args) {
		String mensagem="Escreva o codigo do produto que deseja comprar: \n"+
			     "1. Sapato.\n"+"2. Bolsa.\n"+
		    	 "3. Camisa.\n"+"4. Calça.\n"+"5. Blusa.\n"+
			     "Codigo do produto: ", codigo;
		codigo=JOptionPane.showInputDialog(mensagem);
		int Codigo=Integer.parseInt(codigo);
		switch(Codigo){
	       case 1: JOptionPane.showMessageDialog(null,"Você selecionou o sapato, seu preço é R$99,99."); break;
	       case 2: JOptionPane.showMessageDialog(null,"Você selecionou a bolsa, seu preço é R$103,89."); break;
	       case 3: JOptionPane.showMessageDialog(null,"Você selecionou a camisa, seu preço é R$49,98."); break;
	       case 4: JOptionPane.showMessageDialog(null,"Você selecionou a calça, seu preço é R$89,72."); break;
	       case 5: JOptionPane.showMessageDialog(null,"Você selecionou a blusa, seu preço é R$97,35."); break;
	       default: JOptionPane.showMessageDialog(null,"Codigo invalido.");
	       }
	} 
}
