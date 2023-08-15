package lesson02;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		//Verilen iki sayının hangisinin büyük olduğunu yazan program
		Scanner scanner=new Scanner(System.in);
		int sayi1; int sayi2;
		System.out.println("Say1 giriniz= ");
		sayi1=scanner.nextInt();
		System.out.println("Say2 giriniz= ");
		sayi2=scanner.nextInt();
		if(sayi1>=sayi2) {
			System.out.println("Buyuk sayi="+ sayi1);
			
		}else
			
			System.out.println("Buyuk sayi="+ sayi2);

	}

}
