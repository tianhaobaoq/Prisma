package AreaPrismaJava;

import java.util.ArrayList;


/**
 * Clase Prisma que crea un objeto de prisma con la altura del prisma, la base de triángulo, y un contador para crear una especie de "id" a cada prisma.
 * @author Abimael
 *
 */

public class Prisma {
	
	/**
	 * La base del triángulo
	 */
	int baseTriangulo;
	
	/**
	 * La altura del prisma
	 */
	int alturaPrisma;
	
	/**
	 * El identificador del prisma
	 */
	int n;
	
	/**
	 * La lista que almacena los objetos de prisma
	 */
	static ArrayList<Prisma> prismalista = new ArrayList<>();
	
	/**
	 * Constructor de prisma
	 * @param baseTriangulo Base del triángulo
	 * @param alturaPrisma Altura del triángulo
	 * @param n Identificador
	 */
	public Prisma(int baseTriangulo, int alturaPrisma,int n) {
		super();
		this.baseTriangulo = baseTriangulo;
		this.alturaPrisma = alturaPrisma;
		this.n =n;
		prismalista.add(this);
	}
	
	/**
	 * Método que calcula la altura del triángulo a través de esta fórmula
	 * @return La altura del triángulo
	 */
	public float alturaTriangulo() {
		return (float) ((Math.sqrt(3)/2)*getBaseTriangulo());
	}
	
	/**
	 * Método que calcula el área de la base a través de esta fórmula
	 * @return El área de la base
	 */
	public float areaBase() {
		return ((getBaseTriangulo() * alturaTriangulo())/2);
	}
	
	/**
	 * Método que calcula la suma de todos los lados (perímetro), a través de esta fórmula
	 * @return El perímetro
	 */
	public float perimetro() {
		return 3*getBaseTriangulo();
	}
	
	/**
	 * Método que calcula el área lateral del prisma
	 * @return El Area lateral del prisma
	 */
	public float areaLateral() {
		return perimetro()*getAlturaPrisma();
	}
	
	/**
	 * Método que calcula el área total del prisma
	 * @return El Area total
	 */
	public float areaTotal() {
		return (2*areaBase()) + areaLateral();
	}
	
	/**
	 * Método para obtener la base del triángulo
	 * @return La Base Triangulo
	 */
	public int getBaseTriangulo() {
		return baseTriangulo;
	}

	/**
	 * Método que establece la base del tríangulo
	 * @param baseTriangulo introducir la base del triángulo
	 */
	public void setBaseTriangulo(int baseTriangulo) {
		this.baseTriangulo = baseTriangulo;
	}

	/**
	 * Método que obtiene la altura del prisma
	 * @return La Altura Prisma
	 */
	public int getAlturaPrisma() {
		return alturaPrisma;
	}

	/**
	 * Método que establece la altura del prisma
	 * @param alturaPrisma introducir la altura del prisma.
	 */
	public void setAlturaPrisma(int alturaPrisma) {
		this.alturaPrisma = alturaPrisma;
	}

	/**
	 * Representacion de objeto en string con sus variables
	 * @return El String objeto prisma + variables
	 */
	@Override
	public String toString() {
		return "Prisma " + n + "[Area total:" + this.areaTotal() + "]";
	}
	

	
	
}
