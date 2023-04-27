
import Cálculo.areasYPerimetros;
import classes.Cuadrado;
import classes.Rectangulo;
import classes.Triangulo;
import classes.Rombo;
import classes.Romboide;
import classes.Trapecio;

public class testFiguras {
	public static void main(String[] args) {
		Triangulo t1 = new  Triangulo("Triángulo t1", 20.0, 10.0, 15.0);
		Triangulo t2 = new  Triangulo("Bermudas", 87.0, 121.0, 101.0);
		Cuadrado  c1 = new Cuadrado("Bob esponja",5);
		Rectangulo r1 = new Rectangulo("Tablón",5,8);
		Rombo r2 = new Rombo("Rombosman",5,8,6);
		Romboide r3 = new Romboide("Rambo",5,8);
		Trapecio t3 = new Trapecio("Trapecio",5,8,7,8,10,9,7);
		// TODO: Aquí se deben instanciar las otras figuras geométricas

		
		
		// TODO: Aquí se debe probar cada figura con el método imprimirCalculo
		areasYPerimetros.areaPerimetro(t1);
		areasYPerimetros.areaPerimetro(t2);
		areasYPerimetros.areaPerimetro(c1);
		areasYPerimetros.areaPerimetro(r1);
		areasYPerimetros.areaPerimetro(r2);
		areasYPerimetros.areaPerimetro(r3);
		areasYPerimetros.areaPerimetro(t3);
	}//main

		
		
}//class testFiguras