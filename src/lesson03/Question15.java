package lesson03;

import java.util.Scanner;

public class Question15 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Kaçıncı ay:");
		int ay=scanner.nextInt();
		System.out.println("gun: ");
		int gun=scanner.nextInt();
		switch (ay) {
		case 1:
			if(gun<=21) {
				System.out.println("Oğlak");
			}else {
				System.out.println("Kova");
			}
			break;
		case 2:
			if(gun<=19) {
			System.out.println("Kova");
			}else {
				System.out.println("Balık");
			}
			break;
			default:
				System.out.println("Default");
				break;
		}
	}

}
