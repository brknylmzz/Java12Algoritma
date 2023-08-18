package lesson05;

public class Question32 {

	public static void main(String[] args) {
		String text="Java,Spring,Postgre,React";
		//Java
		//Spring
		//Postgre
		//React islenilen çıktı çeşidi
		
		for (int i=0; i< text.split(",").length;i++) {
			System.out.println(text.split(",")[i]);
		}
	}

}
