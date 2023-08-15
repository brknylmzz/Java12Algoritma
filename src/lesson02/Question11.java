package lesson02;

import java.util.Scanner;

public class Question11 {

	public static void main(String[] args) {
		// Dairenin çevresi ve alanını hesaplayalım
		Scanner scanner=new Scanner(System.in);
		System.out.println("Yaricap giriniz= ");
		double yarıcap=scanner.nextInt();
		if(yarıcap<=0) {
			System.out.println("Lutfen poazitif bir sayı giriniz: ");
		}else {
			double alan=(yarıcap*yarıcap)*3.14;
			double cevre=2*3.14*yarıcap;
			System.out.println("Dairenin alani ve cevresi="+alan+" "+cevre);
		}
	
	}

}
