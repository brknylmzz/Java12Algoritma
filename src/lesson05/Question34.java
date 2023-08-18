package lesson05;

import java.util.Scanner;

public class Question34 {

	public static void main(String[] args) {
		//kullanıcanda mail password,repassword email veya outlook mail
		//doğru format yazana kadar tekrar istenecek
		Scanner sc=new Scanner(System.in);
		boolean check=true;
		boolean check2=true;
		
		String emailFormat="@outlook.com";
		String emailFormat2="@hotmail.com";
		while (check) {
			System.out.println("Mailinizi giriniz");
			String mail=sc.nextLine();
			if(mail.contains(emailFormat)|| mail.contains("emailFormat2")){
			System.out.println("email formatına uygun değildir");	
			}else {
				while(check2) {
					System.out.println("Şifrenizi girin");
					String password=sc.nextLine();
					
					System.out.println("Şifrenizi tekrar girin");
					String rePassword=sc.nextLine();
					if(password.equals(rePassword)&& password.length()>=8) {
						System.out.println();
					}
			}
		}

	}

}
