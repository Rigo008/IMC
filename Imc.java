import java.util.Scanner;

public class Imc {
	
	public void imc () {
		System.out.println("****************");
		System.out.println("CALCULA TU IMC");
		System.out.println("****************");
		
		Scanner scanner = new Scanner(System.in) ; 
		
		System.out.println("por favor ingrese su peso en libras...");
		
		
		double peso = scanner.nextDouble();
		
	Scanner altura = new Scanner(System.in) ; 
	
	
	System.out.println("por favor ingrese su altura en metros...");
	
		double masa = altura.nextDouble();
		double lb = peso / 2.205;
	
		double m = masa * masa;
		
		double resultado = lb /m;
		
		
		System.out.println("Su IMC es: " + resultado);
		
		if (resultado < 18.5) {
			System.out.println("Estas en bajo peso");	
		}
		if (resultado >= 18.5 && resultado <25 ) {
			System.out.println("peso normal");	
		}
		
		if (resultado >= 25 && resultado <30 ) {
			System.out.println("estas en sobre peso");	
		}
		
		if (resultado >= 30 ) {
			System.out.println("obeso");	
		}
		
		scanner.close();
}
}
