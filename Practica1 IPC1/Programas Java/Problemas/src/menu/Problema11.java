package menu;

import java.util.Scanner;

public class Problema11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String rom1, rom2, rom3, rom4, rom5;
		int limite=0;
		Scanner sc = new Scanner(System.in);  
		 System.out.println("Ingrese 5 numeros romano");  

			 rom1=sc.next();
		     rom2=sc.next();
		     rom3=sc.next();
		     rom4=sc.next();
		     rom5=sc.next();
		    
		     String romanos[] = {"0", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII",
			    		"XIX", "XX", "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX", "XXXI", "XXXII", "XXXIII", "XXXIV",
			    		"XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX", "XL", "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L",
			    		"LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX", "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII",
			    		"LXIX", "LXX", "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX", "LXXXI","LXXXII", "LXXXIII",
			    		"LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "XC", "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX", "C"};
						 System.out.println ("El número de elementos en el array romanos es de " + romanos.length );
						 
					for (int i = 0; i < romanos.length; i++) {   System.out.println ("Número " + i + ": " + romanos[i]); }

		  }
}
