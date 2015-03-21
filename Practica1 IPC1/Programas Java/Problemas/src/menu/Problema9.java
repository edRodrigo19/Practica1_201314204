package menu;

import java.util.Scanner;

public class Problema9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=0;
		System.out.println("Ingrese un número entre 0 y 3999");
		 do {
			 @SuppressWarnings("resource")
			Scanner n=new Scanner(System.in);
				num=n.nextInt();
				
      } while (num < 1 || num > 3999);
      System.out.print("->" + " "+ convertirANumerosRomanos(num));
      
}
		public static String convertirANumerosRomanos(int numero) {
		int uni=0, dec=0, cen=0, mil=0;
		String rom = "";
		mil = numero / 1000;
	    cen = numero / 100 % 10;
	    dec = numero / 10 % 10;
	    uni = numero % 10;
	      for (int i = 1; i <= mil; i++) {//para millare
	             rom = rom + "M";
	      }		    
	      if (cen == 9) { //para centenas
	          rom = rom + "CM";
	      } else if (cen >= 5) {
	                     rom = rom + "D";
	                     for (int i = 6; i <= cen; i++) {
	                            rom = rom + "C";
	                     }
	      } else if (cen == 4) {
	                      rom = rom + "CD";
	      } else {
	                  for (int i = 1; i <= cen; i++) {
	                         rom = rom + "C";
	                  }
	      }		   
	      if (dec == 9) { //para decenas
	           rom = rom + "XC";
	      } else if (dec >= 5) {
	                      rom = rom + "L";
	                      for (int i = 6; i <= dec; i++) {
	                            rom = rom + "X";
	                      }
	      } else if (dec == 4) {
	                      rom = rom + "XL";
	      } else {
	                    for (int i = 1; i <= dec; i++) {
	                           rom = rom + "X";
	                    }
	      }
	      if (uni == 9) { //para unidades
	           rom = rom + "IX";
	      } else if (uni >= 5) {
	                      rom = rom + "V";
	                      for (int i = 6; i <= uni; i++) {
	                             rom = rom + "I";
	                      }
	      } else if (uni == 4) {
	                      rom = rom + "IV";
	      } else {
	                  for (int i = 1; i <= uni; i++) {
	                         rom = rom + "I";
	                  }
	      }
	      return rom;
	}

}
