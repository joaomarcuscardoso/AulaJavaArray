package Array;

import java.util.Scanner;

public class Questao12 {
	public static void main(String[] args) {
		// Ta errado
		Scanner t = new Scanner(System.in);
		int[] listA = new int[4];
		int indice = 3;
		
		for(int i =0;i<listA.length;i++) {
			System.out.println("Digite um número para preenhcer a lista");
			listA[i] = t.nextInt();				
			
		}
		
		
		
		
		
		for(int w=0;w<listA.length;w++ ) {
			if(listA[w] == 0) {
				if(listA[w+1] > 0) {
					
					listA[w] = listA[w+1];
					listA[w+1] = 0;
				}
				
			
			}

			System.out.println(listA[w]);
		} 
		

		
	
	}
}
