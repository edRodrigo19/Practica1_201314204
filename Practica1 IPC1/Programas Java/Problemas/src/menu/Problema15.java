package menu;

import static java.lang.Math.sqrt;

import java.util.Scanner;

public class Problema15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int primo=0, i=0, j=0, div=0,raiz=0, contador=0;
		Scanner n=new Scanner(System.in);
		System.out.println("Ingrese un número");
		primo=n.nextInt();
		
		for (i=2;i<=primo;i++) { 
			div=0; 
			raiz=(int)sqrt(i);
			for (j=1;j<=raiz;j++) { 
				if (i%j==0)
					div++;
				}
			if (div<=1) 
				contador++;	
		}
		System.out.println ("Hay " + (contador)+ " números primos entre 1 y " + primo );
				n.close();
	}

}
