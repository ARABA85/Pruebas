package resta;

import java.util.Scanner;

public class MainActividad {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Actividad resta = new Actividad();

		restareales(sc,resta);
		restaenteros(sc,resta);
		resta3enteros(sc,resta);
		valoracumulado(sc,resta);
		
		
		
		
	}

	private static void valoracumulado(Scanner sc,Actividad resta) {
		System.out.println("Introduce un valor");
		double valor = sc.nextDouble();
		resta.resta(valor);
		System.out.println(resta.valoracumulado);
	}

	private static void resta3enteros(Scanner sc,Actividad resta) {
		System.out.println("Introduce el numero real");
		double numero1 = sc.nextDouble();
		System.out.println("Introduce el  2 numero real");
		double numero2 = sc.nextDouble();
		System.out.println("Introduce el  3 numero real");
		double numero3 = sc.nextDouble();
		
		resta.restareal(numero1, numero2, numero3);
		System.out.println(resta.resultadoreal);
		
	}

	private static void restaenteros(Scanner sc,Actividad resta) {
		System.out.println("Introduce el numero entero");
		int numero1entero = sc.nextInt();
		System.out.println("Introduce el  2 numero entero");
		int numero2entero = sc.nextInt();
		resta.restaenteros(numero1entero, numero2entero);
		System.out.println(resta.resultadoenteros);		
	}

	private static void restareales(Scanner sc,Actividad resta) {
		System.out.println("Introduce el numero real");
		double numero1 = sc.nextDouble();
		System.out.println("Introduce el  2 numero real");
		double numero2 = sc.nextDouble();
		double resultado = 0;
		resta.restareal(numero1,numero2);
		System.out.println(resta.resultadoreal);		
	}

}
