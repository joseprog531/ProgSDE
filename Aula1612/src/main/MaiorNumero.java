package main;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class MaiorNumero{

    public static void main(String[]args) {


         ArrayList<Integer> lista = new ArrayList<Integer>();

         lista.add(50);
         lista.add(20);
         lista.add(30);

        System.out.println(maiorNumero(lista));

    }

        public static int  maiorNumero(ArrayList<Integer>numeros) {

        int maior = numeros.get(0), numero;

        for (int i = 0; i < numeros.size(); i++){
               numero = numeros.get(i);

               if (numero > maior) {
                   maior = numero;

               }
        }
           return maior;
      }
}