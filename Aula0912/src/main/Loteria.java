package main;


import java.util.ArrayList;
import java.util.Scanner;

public class Loteria {

	public static void main(String[] args) {
		ArrayList<Integer> bilhete = new ArrayList<Integer>();
		Scanner leitor = new Scanner(System.in);
		
		
			for (int i = 1; i <6; i++ ) {
		System.out.println("Digite 6 numeros entre 0 a 100 ");
           int numero = leitor.nextInt();
           
           while (numero < 0 || numero > 100) {
        	   System.out.println("Número inválido! O número deve estar entre 0 e 100.");
               System.out.print("Digite o " + (i + 1) + "º número novamente: ");
               numero = leitor.nextInt();
           }
         
            
          }		}     
            
            

	}
			


