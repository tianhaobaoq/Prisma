package AreaPrismaJava;

import java.util.Random;

/**
 * Clase en la cual se crean 3 prismas con la base y la altura dada por el usuario
 * @author Abimael
 *
 */
public class mainPrisma {

	public static void main(String[] args) {
		Random rng = new Random();
		int b,h;
		
		for(int i=1;i<=3;i++) {
			System.out.println("\nPRISMA "+ i +"-->");
			b=rng.nextInt(10)+1;
			System.out.println("BASE DEL TRIANGULO:" + b);
			h=rng.nextInt(10)+1;
			System.out.println("ALTURA DEL PRISMA:" + h);
			Prisma prisma = new Prisma(b,h,i);
			System.out.println("AREA TOTAL:" + prisma.areaTotal());
		}
		
		System.out.println("\n");
		ordenarLista();
	
		for (Prisma prisma:Prisma.prismalista) {		
			System.out.println(prisma.toString());
		}
		
	}
	
	/**
	 * Método que ordena la lista
	 */
	public static void ordenarLista() {
		
		int n = Prisma.prismalista.size();
	    for (int a = 0; a < n - 1; a++) {
	        for (int j = 0; j < n - a - 1; j++) {
	            if (Prisma.prismalista.get(j).areaTotal() > Prisma.prismalista.get(j + 1).areaTotal()) {
	                Prisma temp = Prisma.prismalista.get(j);
	                Prisma.prismalista.set(j, Prisma.prismalista.get(j + 1));
	                Prisma.prismalista.set(j + 1, temp);
	            }
	        }  
	    }	
	}
	
}
