package main;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Numeroprimo{

	 public static void ehPrimo(int numero) {
	        int divisores = 0;
	        
	        for (int i = 2; i < numero; i++) {
	            if (numero % i == 0) {
	                divisores++;
	                break;
	            }
	        }
	        
	        if (divisores > 0) {
	            System.out.println("Esse número não é primo!");
	        }
	        else {
	            System.out.println("Esse número é primo!");
	        }
	        
	    }

	}
