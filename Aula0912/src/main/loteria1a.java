package main;
import java.util.ArrayList;
import java.util.Scanner;

public class loteria1a {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        ArrayList<Integer> bilhete = new ArrayList<Integer>();

        System.out.println("Digite 6 números entre 0 e 100:");

        while (bilhete.size() < 6) { 
            System.out.println("Digite um número:");
            int numero = leitor.nextInt();

            if (numero >= 0 && numero <= 100) {
                bilhete.add(numero); 
                
                
                
            } else {
                System.out.println("Número inválido! Escolha um número entre 0 e 100.");
            }
        }

        System.out.println("Seus números da loteria são: " + bilhete);
        for (int i = 0; i < bilhete.size() i++;) {
        	if(i==0) {  
        		 System.out.println(;	
        	}
		} 
        
    }
}
