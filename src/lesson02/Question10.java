package lesson02;

import java.util.Scanner;

public class Question10 {

	public static void main(String[] args) {
		// Girilen 3 sayıdan en büyüğünü yazdıralım
		Scanner scanner=new Scanner(System.in);
		System.out.println("1.sayi giriniz= ");
		double sayi1=scanner.nextInt();
		System.out.println("2.sayi giriniz= ");
		double sayi2=scanner.nextInt();
		System.out.println("3.sayi giriniz= ");
		double sayi3=scanner.nextInt();
		double enBuyuk=sayi1;
		if(enBuyuk<sayi2) {
			enBuyuk=sayi2;
			System.out.println("2.sayi büyüktür= "+sayi1);
		}else if(enBuyuk<sayi3) {
			enBuyuk=sayi3;
			System.out.println("3.sayi büyüktür= "+sayi3);
		}else {
			System.out.println("1.sayi büyüktür= "+sayi1);
		}
	}

}
