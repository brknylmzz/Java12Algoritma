package lesson02;

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		// Girilen Tl miktarı dolara çevirilicek
		Scanner scanner=new Scanner(System.in);
		 double dolar;
		System.out.println("Deger giriniz= ");
		double deger=scanner.nextInt();
		dolar=deger/(27.06);
		System.out.println("Dolar miktarı= "+dolar);
	}

}
