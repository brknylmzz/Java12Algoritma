package lesson02;

import java.util.Scanner;

public class Question7 {

	public static void main(String[] args) {
		// girilen sayının tek mi çift mi olduğunu kontrol eden program
		Scanner scanner=new Scanner(System.in);
		System.out.println("Bir sayi giriniz= ");
		int sayi=scanner.nextInt();
		if(sayi%2==0) {
			System.out.println("Sayi ciftdir= "+sayi);
		}else {
			System.out.println("Sayi tekdir= "+sayi);
		}

	}

}
