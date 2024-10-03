package javaEstruturaCondicional;
import java.util.Scanner;
import java.text.Normalizer;
public class EstruturaCondicional9 {
	public static void main(String[] args) {
	     Scanner input=new Scanner(System.in);
       double Vel_inicial, instante;
       System.out.println("Informe em que planeta o objeto foi arremessado: ");
       String entrada=input.nextLine();
       System.out.println("Informe uma velocidade inicial: ");
       Vel_inicial=input.nextDouble();
       System.out.println("Informe um instante(tempo): ");
       instante=input.nextDouble();
       String planeta = normalizarString(entrada);
       switch(planeta) {
       case "mercurio": double velMerc=Vel_inicial-(3.7*instante); double alturMerc=Vel_inicial-(3.7*Math.pow(instante, 2)/2);
    	   System.out.printf("A velocidade da bola no instante, e sua altura são, respectivamente: %.2f %.2f",velMerc,alturMerc); break;
       case "venus": double velVen=Vel_inicial-(8.8*instante); double alturVen=Vel_inicial-(8.8*Math.pow(instante, 2)/2);
           System.out.printf("A velocidade da bola no instante, e sua altura são, respectivamente: %.2f %.2f",velVen,alturVen); break;
       case "terra": double velTer=Vel_inicial-(9.8*instante); double alturTer=Vel_inicial-(9.8*Math.pow(instante, 2)/2);
           System.out.printf("A velocidade da bola no instante, e sua altura são, respectivamente: %.2f %.2f",velTer,alturTer); break;
       case "marte": double velMar=Vel_inicial-(3.8*instante); double alturMar=Vel_inicial-(3.8*Math.pow(instante, 2)/2);
           System.out.printf("A velocidade da bola no instante, e sua altura são, respectivamente: %.2f %.2f",velMar,alturMar); break;
       case "jupiter": double velJup=Vel_inicial-(26.4*instante); double alturJup=Vel_inicial-(26.4*Math.pow(instante, 2)/2);
           System.out.printf("A velocidade da bola no instante, e sua altura são, respectivamente: %.2f %.2f",velJup,alturJup); break;
       case "saturno": double velSat=Vel_inicial-(11.5*instante); double alturSat=Vel_inicial-(11.5*Math.pow(instante, 2)/2);
           System.out.printf("A velocidade da bola no instante, e sua altura são, respectivamente: %.2f %.2f",velSat,alturSat); break;
       case "urano": double velUra=Vel_inicial-(9.3*instante); double alturUra=Vel_inicial-(9.3*Math.pow(instante, 2)/2);
           System.out.printf("A velocidade da bola no instante, e sua altura são, respectivamente: %.2f %.2f",velUra,alturUra); break;
       case "netuno": double velNet=Vel_inicial-(12.2*instante); double alturNet=Vel_inicial-(12.2*Math.pow(instante, 2)/2);
           System.out.printf("A velocidade da bola no instante, e sua altura são, respectivamente: %.2f %.2f",velNet,alturNet); break;
       case "plutao": double velPlut=Vel_inicial-(0.6*instante); double alturPlut=Vel_inicial-(0.6*Math.pow(instante, 2)/2);
           System.out.printf("A velocidade da bola no instante, e sua altura são, respectivamente: %.2f %.2f",velPlut,alturPlut); break;
       default: System.out.println("Planeta invalido, verifique grafia");
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