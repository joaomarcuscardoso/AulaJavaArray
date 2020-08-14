package Array;

import java.util.Scanner;

public class Questao06 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int[] listaNumeros = new int[10];
		
		for(int i = 0;i< listaNumeros.length;i++) {
			System.out.println("Infome umn valor:");
			listaNumeros[i] = s.nextInt();
			
			if(listaNumeros[i] < 0) {
				listaNumeros[i] = 0;
			}
			
			System.out.println("---------"+listaNumeros[i]+"----------------");
		}
		
		
		
	}
}
