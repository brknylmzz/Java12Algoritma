package lesson03;

import java.util.Scanner;

public class Question16 {

	public static void main(String[] args) {
		// Kullanıcıdan 1-7 arası sayı alıp haftasonu mu hafta içi mi?
		int gun;
		Scanner sc=new Scanner(System.in);
		gun=sc.nextInt();
		switch(gun) {
		case 1,2,3,4,5-> System.out.println(gun+"Hafta ici");
		case 6,7 -> System.out.println(gun+"Hafta sonu");
		default-> System.out.println("Hatalı deger girdiniz");
		}
		

	}

}
