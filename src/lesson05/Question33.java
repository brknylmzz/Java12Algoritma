package lesson05;

import java.util.Scanner;

public class Question33 {

	public static void main(String[] args) {
		//Girilen kelimenin içinde kaçtane "e" olduğunu bulan program
		Scanner sc=new Scanner(System.in);
		System.out.println("kelime giriniz");
		String kelime=sc.next().toLowerCase();
		int harfSayici=0;
		for(int i=0; i<kelime.length(); i++) {
			if(kelime.charAt(i)=='e') {
				harfSayici+=1;
			}
		}
		System.out.println(harfSayici+ "Tane e vardır");
	}

}
