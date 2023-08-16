package lesson03;

import java.util.Scanner;

public class Question20 {

	public static void main(String[] args) {
		// Girilen sayıya kadar tek olan sayıların toplamını yazdıralım
		Scanner sc =new Scanner(System.in);
		System.out.println("Sayi giriniz=");
		int sayi=sc.nextInt();
		int i=1;
		int toplam=0;
		
		while(i<=sayi) {
			if(i%2!=0) {
				toplam=toplam+i;
			}
			i++;
		}
		System.out.println(toplam);
	}

}
