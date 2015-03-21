package menu;

import java.util.Scanner;

public class Problema12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String texto;
		
		Scanner s = new Scanner(System.in);
		System.out.println("Ingrese un texto");
		texto = s.nextLine();
		
				for(int i=0; i<texto.length();i++)
					System.out.print("*");
		s.close();
	}

}
