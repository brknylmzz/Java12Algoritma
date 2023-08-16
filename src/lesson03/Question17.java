package lesson03;

import java.util.Scanner;

public class Question17 {

	public static void main(String[] args) {
		// 1-den 100 e kadar sayıları yazdırın
		//girilen sayıya kadar
		
		Scanner scanner=new Scanner(System.in);
		int sart=scanner.nextInt();
		int sayac=1;
		while(sayac<=sart) {
		System.out.println(sayac);
		sayac ++;
	}
}
}