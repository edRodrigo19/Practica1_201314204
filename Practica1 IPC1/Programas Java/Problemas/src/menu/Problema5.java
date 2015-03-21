package menu;

import java.util.Scanner;

public class Problema5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		String fecha1, fecha2;
		int dia1=0, mes1=0, año1=0;
		int dia2=0, mes2=0, año2=0;
		
		System.out.println("Ingrese 2 fechas");
		fecha1=s.next();
		fecha2=s.next();
		
		dia1=Integer.parseInt(fecha1.substring(0,2));
		mes1=Integer.parseInt(fecha1.substring(3,5));
		año1=Integer.parseInt(fecha1.substring(6,10));
		
		dia2=Integer.parseInt(fecha2.substring(0,2));
		mes2=Integer.parseInt(fecha2.substring(3,5));
		año2=Integer.parseInt(fecha2.substring(6,10));
		
		if(fecha1.length()>10){
			System.out.println("Formato Invalido");
		}
			else if(dia1>30 || dia2>30){
			
		}
			else if (mes1>12 || mes2>12){		
			}
		if(fecha1.length()==10 && dia1>30 || dia2>30){
			System.out.println("Dia invalo");
		}
			else if(fecha1.length()==10 && mes1>12 || mes2>12){
				System.out.println("Mes Invalido");
			}
			else if(fecha1.length()==10){
			System.out.println("Los dias entre estas fechas son");
			System.out.println(Math.abs((360*año1-30*mes1-dia1)-(360*año2-30*mes2-dia2)));
			}
		s.close();
		}

}
