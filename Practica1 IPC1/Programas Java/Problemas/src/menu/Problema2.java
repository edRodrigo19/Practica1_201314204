package menu;

import java.util.Scanner;
public class Problema2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=0,num2=0,num3=0,num4=0,num5=0,num6=0,prom=0;
		System.out.println("Ingrese 6 Notas");
			Scanner s=new Scanner(System.in);
			
		System.out.println("Ingrese la primera nota");
			num1=s.nextInt();  
		System.out.println("Ingrese la segunda nota");
			num2=s.nextInt();
		System.out.println("Ingrese la tercera nota");
			num3=s.nextInt();
		System.out.println("Ingrese la cuarta nota");
			num4=s.nextInt(); 
		System.out.println("Ingrese la quinta nota");
			num5=s.nextInt();
		System.out.println("Ingrese la sexta nota");
			num6=s.nextInt();
			prom=(num1+num2+num3+num4+num5+num6)/6;// calculo del promedio
			System.out.println("La Nota Promedio es "+prom);
				if(prom>=0 && prom<=59)
					System.out.println("Puntuación E");
				else if(prom>=60 && prom<=69)
					System.out.println("Puntuación D");
				else if(prom>=70 && prom<=79)
					System.out.println("Puntuación C");
				else if(prom>=80 && prom<=89)
					System.out.println("Puntuación B");
				else if(prom>=90 && prom<=100)
					System.out.println("Puntuación A");
				s.close();
	}
}
