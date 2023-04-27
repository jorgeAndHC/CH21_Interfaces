package classes;

import Cálculo.Calculo;

public class Rombo implements Calculo {
	private String name;
	private double lado;
	private double diagonalMenor;
	private double diagonalMayor;
	
	public double calcularArea() {
		return (getDiagonalMenor() * getDiagonalMayor())/2;	
	}//calcularArea
	public double calcularPerimetro() {
		return (getLado() * 4);
	}// calcularPerimetro
	public Rombo(String name, double lado, double diagonalMenor, double diagonalMayor) {
		super();
		this.name = name;
		this.lado = lado;
		this.diagonalMenor = diagonalMenor;
		this.diagonalMayor = diagonalMayor;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getLado() {
		return lado;
	}
	public void setLado(double lado) {
		this.lado = lado;
	}
	public double getDiagonalMenor() {
		return diagonalMenor;
	}
	public void setDiagonalMenor(double diagonalMenor) {
		this.diagonalMenor = diagonalMenor;
	}
	public double getDiagonalMayor() {
		return diagonalMayor;
	}
	public void setDiagonalMayor(double diagonalMayor) {
		this.diagonalMayor = diagonalMayor;
	}
	@Override
	public String toString() {
		return "Rombo [name=" + name + ", lado=" + lado + ", diagonalMenor=" + diagonalMenor + ", diagonalMayor="
				+ diagonalMayor + "]";
	}
		
	

}
