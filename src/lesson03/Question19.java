package lesson03;

import java.util.Scanner;

public class Question19 {

	public static void main(String[] args) {
	
		//Girilen sayının 5in kuuveti mi
		Scanner sc =new Scanner(System.in);
		System.out.println("Sayi giriniz=");
		int sayi=sc.nextInt();
		String besinKati="5 in katı değildir";
		
		while(sayi != 1) {
			if(sayi%5!=0) {
				besinKati="5in kuvveti değildir";
				sayi=1;
			}else {
				besinKati="Beşin katıdır";
						sayi/=5;
			}
		}
		System.out.println(besinKati);
	}
	
}

