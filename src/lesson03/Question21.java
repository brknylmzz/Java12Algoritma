package lesson03;

import java.util.Scanner;

public class Question21 {

	public static void main(String[] args) {
		// Girilen sayı basamak ve hangi sayı
		Scanner sc =new Scanner(System.in);
		System.out.println("Sayi giriniz=");
		int sayi=sc.nextInt();
		int basamakSayisi=1;
		int basamak;
		
		while(sayi !=0) {
			basamak=sayi%10;
			sayi=sayi/10;
			System.out.println(basamakSayisi+ "ler basamagi "+basamak);
			basamakSayisi=basamakSayisi*10;
		}
	}

}
