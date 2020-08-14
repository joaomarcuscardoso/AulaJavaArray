package Array;

import java.util.Scanner;

public class Questao08 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] list = new int[40];
		int length = list.length; 
		
		for (int i = 0; i < list.length; i++) {
			System.out.println("Digite um valor, e ao final dos valores será mostrado a soma dos mesmo");
			int A = s.nextInt();
			
			
			if(i != 0) {
				list[i] = A + list[i-1];
			} else {	
				list[i] = A;
			}
		}
		
		System.out.println(list[length-1]);
		
	}
}
