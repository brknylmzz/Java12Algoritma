package lesson01;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String isim;
		String soyisim;
		System.out.println("Isim Giriniz");
		isim=scanner.next();
		System.out.println("Soyisim Giriniz");
		soyisim=scanner.next();
		System.out.println("Hosgeldiniz "+ isim + " "+ soyisim);
		
	}

}
