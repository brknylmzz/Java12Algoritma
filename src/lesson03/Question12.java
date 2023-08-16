package lesson03;

import java.util.Scanner;

public class Question12 {

	public static void main(String[] args) {
		// Girilen iki sayının toplamı çift ise true tek ise false
		Scanner scanner=new Scanner(System.in);
		System.out.println("X sayisini giriniz= ");
		int x=scanner.nextInt();
		System.out.println("Y sayisini giriniz= ");
		int y=scanner.nextInt();
		boolean ciftMi;
		int toplam =x+y;
		if(toplam%2==0) {
			ciftMi=true;
		}else {
			ciftMi=false;
		}
		System.out.println(ciftMi);
	}

}
