package lesson02;

import java.util.Scanner;

public class Question8 {

	public static void main(String[] args) {
		// Kenarları girilen üçgenin nasıl bir üçgen olduğunu söyleyen program
		Scanner scanner=new Scanner(System.in);
		System.out.println("Birinci kenarı giriniz= ");
		int kenar1=scanner.nextInt();
		System.out.println("İkinci kenarı giriniz= ");
		int kenar2=scanner.nextInt();
		System.out.println("Ucuncu kenarı giriniz= ");
		int kenar3=scanner.nextInt();
		
		if (kenar1==kenar2 && kenar2==kenar3) {
			System.out.println("Ucgen eskenardır= ");
		}else if(kenar1==kenar2 && kenar2!=kenar3) {
			System.out.println("Ucgen ikizkenar= ");
		}else {
			System.out.println("Ucgen cok kenardır= ");
		}
			
	}

}
