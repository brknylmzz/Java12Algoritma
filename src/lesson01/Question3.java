package lesson01;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		double fiyat; double kdv; double hamfiyat;
		System.out.println("Urun fiyatini yaziniz");
		fiyat=scanner.nextInt();
		kdv=fiyat/1.18;
		hamfiyat=kdv/1.15;
		System.out.println("Urunun ham fiyatı= "+ hamfiyat);
		
		
		
	}
}
