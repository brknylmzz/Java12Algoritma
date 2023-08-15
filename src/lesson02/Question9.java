package lesson02;

import java.util.Scanner;

public class Question9 {

	public static void main(String[] args) {
		// Girilen ortalamanın harf notuna göre gecip gecmediğini bulan program
		Scanner scanner=new Scanner(System.in);
		System.out.println("Ortalamayı giriniz= ");
		double ortalama=scanner.nextInt();
		if(ortalama>=90) {
			System.out.println("Harf notu AA= "+ortalama);
		}else if (80<=ortalama && 90>=ortalama) {
			System.out.println("Harf notu BB= "+ortalama);
		}else if (70<=ortalama && 80>=ortalama) {
			System.out.println("Harf notu CC= "+ortalama);
	}else if (60<=ortalama && 70>=ortalama) {
		System.out.println("Harf notu DD= "+ortalama);
	}else if (60>ortalama ) {
			System.out.println("Harf notu FF kaldı= "+ortalama);
		}
	
	}
}
