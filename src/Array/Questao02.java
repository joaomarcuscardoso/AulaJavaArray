package Array;
import java.util.Scanner;

public class Questao02 {
	public static void main(String[] args) {
		Scanner t =new Scanner(System.in);
		int[] listNumber = new int[10];
		int w =0;
		
		for(int i =0;i<listNumber.length;i++) {
			System.out.println("Digite um número");
			int n = t.nextInt();
			
			if(n % 2 !=  0) {
					listNumber[i] = n;
					i++;
			}
			i--;
			
		}
		
		
		for(int x=0;x<listNumber.length;x++ ) {
			System.out.println(listNumber[x]);
			
		}
	}
}
