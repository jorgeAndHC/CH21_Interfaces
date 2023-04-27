package Cálculo;



public class areasYPerimetros {
	public static void areaPerimetro(Calculo x) {
		System.out.println(x);
		System.out.println("+========================================");
		System.out.println("|El área de ["+x.getName()+"] es: " + x.calcularArea() + 
				"\n" + "|El perímetro de ["+x.getName()+"] es: " + x.calcularPerimetro());
		System.out.println("+========================================");

}
}
