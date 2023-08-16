package lesson03;

import java.util.Scanner;

public class Question14 {
	//Buna bakılacak kayıttan

	public static void main(String[] args) {
		// Girilen 3 sayı büyükten küçüğe sıralayalım
		int maks=0;
		Scanner scanner=new Scanner(System.in);
		System.out.println("1.sayı giriniz");
		int sayi1=scanner.nextInt();
		sayi1=maks;
		System.out.println("2. sayı giriniz");
		int sayi2=scanner.nextInt();
		System.out.println("3 sayı girinizi");
		int sayi3=scanner.nextInt();
		
		if(maks<sayi2) {
			sayi2=maks;
			System.out.println("2 sayı en büyüktür"+sayi2);
		}else if(maks<sayi3) {
			sayi3=maks;
			System.out.println("3 sayı en büyüktür"+sayi3);
		}else {
			System.out.println("1 sayı en büyüktür"+sayi1);
		}
			
	}

}
