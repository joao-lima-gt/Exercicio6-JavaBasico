package ant.suc;

import java.util.Scanner;

public class AntecessorSucessor {
	public static void main(String[] args) {
		Scanner texto = new Scanner (System.in);
		
		int a,b,c;
		
		System.out.println("Digite seu valor inteiro:");
		a = texto.nextInt();
		b = (-1) + a;
		c = a + 1;
		
		System.out.println("O antecessor é:"+ b + "O sucessor é:"+c);
		texto.close();
		
	}

}
