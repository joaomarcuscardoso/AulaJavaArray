package Array;

import java.util.Scanner;

public class Questao11 {
	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		int[] listA = {1,2,3,4,5,6,7,8,9,10};	
		int[] listB = {12,2,13,2,15,2,17,2,19,2};	
		int mark = 0;int mesmo = 0; int indece = 9;
		
		for(int i =0;i<listA.length;i++) {

			for(int w=0;w<listB.length;w++ ) {
				if(listA[w] == listB[9 - i]) {
					mark +=1;
					mesmo = listA[w];
				}
				
			}
				
			
			
			
		}
		if(mark > 0) {

			System.out.println("As duas lista tem o mesmo conteúdo que é "+mesmo+" e ele se repete "+mark);
		} else {
			System.out.println("Não tem o mesmo conteudo em nenhum indice");
		}
		
	
	}
}
