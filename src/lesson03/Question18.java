package lesson03;

import java.util.Scanner;

public class Question18 {

	public static void main(String[] args) {
		// Girilen sayının basamaklarının toplamı 127 --> 1+2+7 output 10
		Scanner sc=new Scanner(System.in);
		System.out.println("sayi giriniz");
		int sayi=sc.nextInt();

		int toplam=0;
		
		while(sayi !=0) {
			toplam=(sayi%10)+toplam;
			sayi/=10;
		}
		System.out.println(toplam);
	}

}
