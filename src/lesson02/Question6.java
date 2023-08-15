package lesson02;

import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {
		// Vize ve final notlarını hesaplayarak gecip gecmeme durumu Vize 40 final 60 50 üstü geçer
		Scanner scanner=new Scanner(System.in);
		double sonuc;
		System.out.println("Vize notunu giriniz= ");
		double vize=scanner.nextInt();
		System.out.println("Final notunu giriniz= ");
		double fin=scanner.nextInt();
		sonuc=(vize*0.4)+(fin*0.6);
		if (sonuc>=50){
			System.out.println("Gecer = "+ sonuc);
			
		}else
				System.out.println("Kaldi = "+ sonuc);
				
	}

}
