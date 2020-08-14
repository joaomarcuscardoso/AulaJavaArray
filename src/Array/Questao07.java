package Array;

import java.util.Scanner;

public class Questao07 {
	public static void main(String[] args) {
		Scanner t =new Scanner(System.in);
		int[] listA= new int[20];
		int[] listB = new int[20];
		int lengthMax = listA.length + listB.length;
		int[] listC = new int[lengthMax];

		
		for(int i =0;i<listA.length;i++) {
			System.out.println("Digite valores para lista A");
			listA[i] = t.nextInt();
			
			
			System.out.println("Digite valores para lista B");
			listB[i] = t.nextInt();
			
			
			if(listA[i] % 2 == 0 ) {
				listC[i] = listA[i];
			}
			
			if(listB[i] % 2 != 0 ) {
				listC[i] = listB[i];
			}
			
		}
		
		for(int w =0;w<listC.length;w++) {
			System.out.println(listC[w]);
		}
		
	}
}
