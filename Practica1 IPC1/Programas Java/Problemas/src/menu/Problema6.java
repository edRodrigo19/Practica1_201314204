package menu;

import java.util.Scanner;

public class Problema6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double num1=0, num2=0;
		String operador;
		Scanner s = new Scanner(System.in);
		operador = s.next();
		
		if(operador.contains("s")){
			num1=Double.parseDouble(operador.substring(0, operador.indexOf("s")));
			num2=Double.parseDouble(operador.substring(operador.indexOf("s")+1 ));
			System.out.println(num1+num2);
		}
			else if(operador.contains("r")){
				num1=Double.parseDouble(operador.substring(0, operador.indexOf("r")));
				num2=Double.parseDouble(operador.substring(operador.indexOf("r")+1 ));
			System.out.println(num1-num2);
			}
			else if(operador.contains("m")){
				num1=Double.parseDouble(operador.substring(0, operador.indexOf("m")));
				num2=Double.parseDouble(operador.substring(operador.indexOf("m")+1 ));
			System.out.println(num1*num2);
			}
			else if(operador.contains("d")){
				num1=Double.parseDouble(operador.substring(0, operador.indexOf("d")));
				num2=Double.parseDouble(operador.substring(operador.indexOf("d")+1 ));
			System.out.println(num1/num2);
			}
			else
			System.out.println("Sintax error");
		s.close();
	}

}
