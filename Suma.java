package git.grupal;

public class Suma {


	private double acumulado;
	
	/// contructor por defecto	

	public Suma() {
		super();
	}

	
	
	
	public double getAcumulado() {
		return acumulado;
	}




	public double suma2NumerosReales(double num1, double num2) {
		double suma;

		suma = num1 + num2;

		return suma;

	}

	public int suma2NumerosEnteros(int num1, int num2) {
		int suma;

		suma = num1 + num2;

		return suma;

	}

	public double suma3NumerosReales(double num1, double num2, double num3) {
		double suma;

		suma = num1 + num2 + num3;

		return suma;

	}

	public void sumaValorAcumulado(int num) {

		for (int i = 1; i <= num; i++) {
			acumulado = acumulado + i;

		}

	}

}




