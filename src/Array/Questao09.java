package Array;

import java.util.Scanner;

public class Questao09 {
	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		int[] list = new int[9];
		String[] extenso = {"um", "dois", "tres", "quatro", "cinco", "seis", "sete", "oito", "nove"};
		System.out.println("Digite um n�mero menor que 10 e maior que 0.");
		int n = t.nextInt();

		
		System.out.println("o n�mero que voc� digitou em extenso � "+extenso[n-1]);
		
		
	}
}
