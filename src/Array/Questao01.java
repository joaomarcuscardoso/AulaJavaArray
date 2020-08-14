package Array;

import java.util.Scanner;

public class Questao01 {
	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		int[] listNumber = new int[12];
		for(int i =0; i < listNumber.length;i++) {
			System.out.println("Informe um valor para a posição de indice "+i);
			listNumber[i] = t.nextInt();
		}
		
		
		System.out.println("informe valor de indice 0 e 11");
		int x = t.nextInt();
		
		while(x < 0 || x > 11) {
			System.out.println("informe valor de indice 0 e 11");
			x = t.nextInt();		
		}
		
		System.out.println("informe mais um valor de indice ");
		int y = t.nextInt();
		
		while(y < 0 || y > 11) {
			System.out.println("informe valor de indice 0 e 11");
			y = t.nextInt();		
		}
		
		
		int sum = listNumber[x] + listNumber[y];
		
		System.out.println(" A soma dos valores é "+sum+"!");
		
		
		System.out.println("----------------FIM----------------");
	}
}
