package lesson05;

import java.util.Scanner;

public class Question31 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Kelime giriniz");
		String kelime=sc.next();
		for(int i=0; i<=kelime.length()-1; i++) {
			System.out.println(kelime.charAt(i));
		}

	}

}
