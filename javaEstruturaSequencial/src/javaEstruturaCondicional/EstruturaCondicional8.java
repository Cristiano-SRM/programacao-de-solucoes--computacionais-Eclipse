package javaEstruturaCondicional;
import java.util.Scanner;

public class EstruturaCondicional8 {

	public static void main(String[] args) {
	     Scanner input=new Scanner(System.in);
	   int numero;
       String mensagem="Escreva o codigo do produto que deseja comprar: \n"+
	     "1. Sapato.\n"+"2. Bolsa.\n"+
    	 "3. Camisa.\n"+"4. Calça.\n"+"5. Blusa.\n"+
	     "Codigo do produto: ";
       System.out.println(mensagem);
       numero=input.nextInt();
       switch(numero){
       case 1: System.out.println("Você selecionou o sapato, seu preço é R$99,99."); break;
       case 2: System.out.println("Você selecionou a bolsa, seu preço é R$103,89."); break;
       case 3: System.out.println("Você selecionou a camisa, seu preço é R$49,98."); break;
       case 4: System.out.println("Você selecionou a calça, seu preço é R$89,72."); break;
       case 5: System.out.println("Você selecionou a blusa, seu preço é R$97,35."); break;
       default: System.out.println("Codigo invalido");
       }
       
	}

}
