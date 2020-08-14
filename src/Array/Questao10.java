package Array;

import java.util.Scanner;

public class Questao10 {
	public static void main(String[] args) {
		Scanner t =new Scanner(System.in);
		String[] listA = {"a", "b", "c", "d", "f"};	
		String[] listB = {"h", "l", "j", "y", "a"};	
		int mark = 0;
		String mesmo = "";
		
		for(int i =0;i<listA.length;i++) {
			for(int w =4;w>i;w--) {
				
				if(listA[i] == listB[w]) {
					mark +=1;
					 mesmo = listA[i];
				}
			}
			
		}
		if(mark > 0) {

			System.out.println("As duas lista tem o mesmo conteúdo que é "+mesmo);
		} else {
			System.out.println("Não tem o mesmo conteudo em nenhum indice");
		}
		
	}
}
