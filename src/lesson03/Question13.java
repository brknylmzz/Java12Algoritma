package lesson03;

import java.util.Scanner;

public class Question13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int telefonKod=123;
		int mailKod=456;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Telefona gelen kod: ");
		int kod1=scanner.nextInt();
		System.out.println("Mail gelen kod: ");
		int kod2=scanner.nextInt();
		if(telefonKod==kod1 && mailKod==kod2) {
			System.out.println("sisteme kayıt oldunuz");
			
		}else if(telefonKod==kod1 && mailKod != kod2){
			System.err.println("Mailinize gelen kodu tekrar girin");
			}else if (telefonKod!=kod1 && mailKod==kod2) {
				System.err.println("Telefona gelen kodu tekrar girin:");
			}else
			System.err.println("Telefon veya mail hatalı");
		}
	
}
