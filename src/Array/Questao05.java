package Array;

import java.util.Scanner;

public class Questao05 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int[] listaNumeros = new int[40];
		int contaPares = 0; int somaPares = 0; int menorPar = 999999999; int maiorPar = -999999999;
		
		for(int i =0;i<listaNumeros.length;i++) {
			System.out.println("Informe um valor");
			listaNumeros[i] = s.nextInt();
			
			if(listaNumeros[i] % 2 ==0 ) {
				somaPares += listaNumeros[i];
				contaPares++;
				if(listaNumeros[i] < menorPar) {
					menorPar = listaNumeros[i];
				}
				if(listaNumeros[i] > maiorPar) {
					maiorPar = listaNumeros[i];
				}
				
			}
		}
		
		System.out.println("A quantidade de números pares é "+contaPares);
		//
		System.out.println("A media dos números pares é "+somaPares/contaPares);
		System.out.println("O menor valor Par "+menorPar);
		System.out.println("O maior valor Par "+maiorPar);
	
	}
}
