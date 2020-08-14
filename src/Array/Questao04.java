package Array;

import java.util.Scanner;

public class Questao04 {
	public static void main(String[] args) {
		Scanner t =new Scanner(System.in);
		int[] list = new int[20];
		System.out.println("Digite um número e procuraremos ele no array");
		int x = t.nextInt();
		int mark = 0;
		for(int i =0;i<list.length;i++) {
			list[i] = i;

			if(x == list[i]) {
				System.out.println("Tem o valor "+x+" no indice "+i+" do array");
			} else {
				mark += 1;
				
			}
			
			if(mark == 20) {
				System.out.println("Valor não existe dentro do array");
			}
		}
		
		
		
	}
}
