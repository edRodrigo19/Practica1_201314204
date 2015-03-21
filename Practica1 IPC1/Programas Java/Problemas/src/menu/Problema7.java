package menu;

import java.util.Scanner;

public class Problema7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero=0;
		Scanner n= new Scanner(System.in);
		System.out.println("Ingrese 1 número entre 0 y 10");
		numero=n.nextInt();
	if(numero==1)
			for(int i=1; i<11; i++)
				System.out.println(numero+"x"+i+"="+(numero*i));
		else if(numero==2)
			for(int i=1; i<11; i++)
				System.out.println(numero+"x"+i+"="+(numero*i));
		else if(numero==3)
			for(int i=1; i<11; i++)
				System.out.println(numero+"x"+i+"="+(numero*i));
		else if(numero==4)
			for(int i=1; i<11; i++)
				System.out.println(numero+"x"+i+"="+(numero*i));
		else if(numero==5)
			for(int i=1; i<11; i++)
				System.out.println(numero+"x"+i+"="+(numero*i));
		else if(numero==6)
			for(int i=1; i<11; i++)
				System.out.println(numero+"x"+i+"="+(numero*i));
		else if(numero==7)
			for(int i=1; i<11; i++)
				System.out.println(numero+"x"+i+"="+(numero*i));
		else if(numero==8)
			for(int i=1; i<11; i++)
				System.out.println(numero+"x"+i+"="+(numero*i));
		else if(numero==9)
			for(int i=1; i<11; i++)
				System.out.println(numero+"x"+i+"="+(numero*i));
		else if(numero==10)
			for(int i=1; i<11; i++)
				System.out.println(numero+"x"+i+"="+(numero*i));
	else
		System.out.println("El número no esta entre 0 y 10");
		n.close();
	}

}
