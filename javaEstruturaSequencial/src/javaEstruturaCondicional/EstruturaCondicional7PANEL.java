package javaEstruturaCondicional;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class EstruturaCondicional7PANEL {

	public static void main(String[] args) {
        String A, B, C;
        A=JOptionPane.showInputDialog("Informe o primeiro valor (a) da equação de segundo grau: ");
        B=JOptionPane.showInputDialog("Informe o segundo valor (b) da equação de segundo grau: ");
        C=JOptionPane.showInputDialog("Informe o terceiro e ultimo valor (c) da equação de segundo grau: ");
        
        double a=Double.parseDouble(A);
        double b=Double.parseDouble(B);
        double c=Double.parseDouble(C);
        
        if(a==0 && b==0 && c==0) {
         JOptionPane.showMessageDialog(null,"Igualdade confirmada 0=0");
        }
        if(a==0 && b==0 && c!=0) {
         JOptionPane.showMessageDialog(null,"Coeficientes informados incorretamente.");
        }
        if(a==0 && b!=0) {
       	 double result=-c/b;
       	 JOptionPane.showMessageDialog(null,"Esta é uma equação de primeiro grau, e seu resultado é: "+result);
        }
        if(a!=0) {
         double delta=(Math.pow(b, 2))-4*a*c;
         String mensagem= "Está é uma equação de segundo grau.\n"+" "
        +"Esta equação não possui raízes reais. Valor de delta: "+delta; 
       	 if(delta<0) {
       		JOptionPane.showMessageDialog(null,mensagem);
       	 }
       	 if(delta==0) {
       		 double Result=-b/(2*a);
       		 JOptionPane.showMessageDialog(null,"Esta equação possui duas raizes reais: "+Result);
       	 }
       	 if(delta>0) {
       		 double resultado1=(Math.sqrt(delta)-b)/(2*a);
       		 double resultado2=(-(Math.sqrt(delta)+b)/(2*a));
       		 DecimalFormat df= new DecimalFormat("#.##");
       		 String Mensagem="Esta equação possui duas raizes diferentes.\n"+
       				"O primeiro resultado é: "+df.format(resultado1)+"\n"+
       				"O segundo resultado é: "+df.format(resultado2);
             JOptionPane.showMessageDialog(null, Mensagem);
       	 }
	}
	}
}
