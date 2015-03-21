package menu;

import java.util.Scanner;

public class Problema4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				Scanner s = new Scanner(System.in);
				String figura;
				double x=0;	
				System.out.println("Ingrese parametros a valuar");
					figura=s.next();
			
					x=Integer.parseInt(figura.substring(figura.indexOf(",")+1 ));
					
				if (figura.contains("u,")){
					System.out.println("Cuadrado");
					System.out.println("El área es "+(x*x));
					System.out.println("El perimetro es "+ (4*x));
				}	
				else if (figura.contains("t,")){
					System.out.println("Triangulo");
					System.out.println("El área es "+((Math.sqrt(3))/4*Math.pow(x, 2)));
					System.out.println("El perimetro es "+ (3*x));
					System.out.println("La altura es "+ ((Math.sqrt(3))/2)*x);
				}	
				else if(figura.contains("c,")){
					System.out.println("Circulo");
					System.out.println("El área es "+((Math.PI)*Math.pow(x, 2)));
					System.out.println("El perimetro es "+ (2*(Math.PI)*x));
					System.out.println("El Radio es "+ (x/2));
				}
				else
					System.out.println("parametros invalidos");
				s.close();
				
	}

}
