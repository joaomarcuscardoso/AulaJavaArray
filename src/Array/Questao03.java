package Array;

import java.util.Scanner;

public class Questao03 {
	public static void main(String[] args) {
		Scanner t =new Scanner(System.in);
		int[] list = new int[16];
		
		for(int i = 0;i<list.length;i++) {
			System.out.print(i);
			System.out.println("Digite um número");
			list[15-i] = t.nextInt();	

		}
		for(int w = 0;w<list.length;w++) {
			System.out.println(list[w]);
		}
		
		
	}
}
