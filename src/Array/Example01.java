package Array;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Example01 {
	public static void main(String[] args) {
		DecimalFormat d = new DecimalFormat("R$ #0.00");
		int valor = 15;
		Scanner t = new Scanner(System.in);
		valor = valor + 10;
		
		int[] listaNumeros = new int[5];
		
		/*
		 *    0     1      2    3        4
		 *  | 25  | 45  | 10  | 13  | 200   | 
		 */
		
	/*	listaNumeros[2] = 10;
		listaNumeros[0] = 25;
		listaNumeros[4] = 200;
		listaNumeros[3] = 13;
		listaNumeros[1] = 45;
		
		
		System.out.println(listaNumeros[0]);
		System.out.println(listaNumeros[1]);
		System.out.println(listaNumeros[2]);
		System.out.println(listaNumeros[3]);
		System.out.println(listaNumeros[4]);
		
		
		if(listaNumeros[4] >= 10 ) {
			System.out.println("Maior ou igual a 10");
		} else {
			System.out.println("Menor a 10");
			
		}
		*/ 
		
		for(int i =0; i < listaNumeros.length;i++) {
			System.out.println("Informe um valor para posição de índice "+i);
			listaNumeros[i] = t.nextInt();
			System.out.println("O valor é "+listaNumeros[i]);
		}
		
		int maiorValor = listaNumeros[0];
		int menorValor = listaNumeros[0];
		
		for(int i =1;i<listaNumeros.length;i++) {
			if(listaNumeros[i] > maiorValor) {
				maiorValor = listaNumeros[i];
			}
			
			if(listaNumeros[i] < menorValor) {
				menorValor = listaNumeros[i];
			}
		}
		
		
		System.out.println("O maior valor é "+maiorValor);
		System.out.println("O menor valor é "+menorValor);
		
		/*
		String [] listaNomes = new String[3];
		listaNomes[0] = "Carlos ";
		listaNomes[1] = "Alberto ";
		listaNomes[2] = "Barth "; 
		
		System.out.println("Seu nome comleto é "+listaNomes[0]+listaNomes[1]+listaNomes[2]);
		*/
		
		System.out.println("FIM");
		
	}
}
