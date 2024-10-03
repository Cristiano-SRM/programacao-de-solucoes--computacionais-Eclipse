package javaEstruturaCondicional;
import java.text.Normalizer;
import javax.swing.JOptionPane;
public class EstruturaCondicional9PANEL {
	public static void main(String[] args) {
		String Vel_Inicial, Instante, entrada;
		entrada=JOptionPane.showInputDialog("Informe em que planeta o objeto foi arremessado: ");
		Vel_Inicial=JOptionPane.showInputDialog("Informe uma velocidade inicial: ");
		Instante=JOptionPane.showInputDialog("Informe um instante(tempo): ");
		String planeta = normalizarString(entrada);
		
		double Vel_inicial=Double.parseDouble(Vel_Inicial);
		double instante=Double.parseDouble(Instante);
		
		switch(planeta) {
	       case "mercurio": double velMerc=Vel_inicial-(3.7*instante); double alturMerc=Vel_inicial-(3.7*Math.pow(instante, 2)/2);
	       String mensagemMerc=String.format("A velocidade da bola no instante, e sua altura são, respectivamente: %.2f %.2f", velMerc, alturMerc);
	        JOptionPane.showMessageDialog(null,mensagemMerc); break;
	       case "venus": double velVen=Vel_inicial-(8.8*instante); double alturVen=Vel_inicial-(8.8*Math.pow(instante, 2)/2);
	       String mensagemVen=String.format("A velocidade da bola no instante, e sua altura são, respectivamente: %.2f %.2f", velVen, alturVen);
		    JOptionPane.showMessageDialog(null,mensagemVen); break;
	       case "terra": double velTer=Vel_inicial-(9.8*instante); double alturTer=Vel_inicial-(9.8*Math.pow(instante, 2)/2);
	       String mensagemTer=String.format("A velocidade da bola no instante, e sua altura são, respectivamente: %.2f %.2f", velTer, alturTer);
		    JOptionPane.showMessageDialog(null,mensagemTer); break;
	       case "marte": double velMar=Vel_inicial-(3.8*instante); double alturMar=Vel_inicial-(3.8*Math.pow(instante, 2)/2);
	       String mensagemMar=String.format("A velocidade da bola no instante, e sua altura são, respectivamente: %.2f %.2f", velMar, alturMar);
			JOptionPane.showMessageDialog(null,mensagemMar); break;
	       case "jupiter": double velJup=Vel_inicial-(26.4*instante); double alturJup=Vel_inicial-(26.4*Math.pow(instante, 2)/2);
	       String mensagemJup=String.format("A velocidade da bola no instante, e sua altura são, respectivamente: %.2f %.2f", velJup, alturJup);
			JOptionPane.showMessageDialog(null,mensagemJup); break;
	       case "saturno": double velSat=Vel_inicial-(11.5*instante); double alturSat=Vel_inicial-(11.5*Math.pow(instante, 2)/2);
	       String mensagemSat=String.format("A velocidade da bola no instante, e sua altura são, respectivamente: %.2f %.2f", velSat, alturSat);
			JOptionPane.showMessageDialog(null,mensagemSat); break;
	       case "urano": double velUra=Vel_inicial-(9.3*instante); double alturUra=Vel_inicial-(9.3*Math.pow(instante, 2)/2);
	       String mensagemUra=String.format("A velocidade da bola no instante, e sua altura são, respectivamente: %.2f %.2f", velUra, alturUra);
			JOptionPane.showMessageDialog(null,mensagemUra); break;
	       case "netuno": double velNet=Vel_inicial-(12.2*instante); double alturNet=Vel_inicial-(12.2*Math.pow(instante, 2)/2);
	       String mensagemNet=String.format("A velocidade da bola no instante, e sua altura são, respectivamente: %.2f %.2f", velNet, alturNet);
			JOptionPane.showMessageDialog(null,mensagemNet); break;
	       case "plutao": double velPlut=Vel_inicial-(0.6*instante); double alturPlut=Vel_inicial-(0.6*Math.pow(instante, 2)/2);
	       String mensagemPlut=String.format("A velocidade da bola no instante, e sua altura são, respectivamente: %.2f %.2f", velPlut, alturPlut);
			JOptionPane.showMessageDialog(null,mensagemPlut); break;
	       default: JOptionPane.showMessageDialog(null,"Planeta invalido, verifique grafia.");
	       } 
	}
	private static String normalizarString(String input) {
        // Normaliza a string para remover acentos
        String normalized = Normalizer.normalize(input, Normalizer.Form.NFD);
        // Remove os caracteres acentuados
        String withoutAccents = normalized.replaceAll("[^\\p{ASCII}]", "");
        // Converte para minúsculas
        return withoutAccents.toLowerCase();
    }
}
