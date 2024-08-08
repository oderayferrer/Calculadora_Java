package lab_procedimientos;

import java.util.*;

public class Programa {

//	Ejercicio 1
//	Crear un programa que reciba 3 parámetros y
//	calcule la suma, resta, multiplicación, división y
//	el resto de dos números con decimales.
//	Las consignas para lograrlo son:
//	● Debe crear un método que no retorne nada,
//	que reciba los 3 parámetros, 2 números con
//	decimales y el carácter de operación.
//	● Debe crear los métodos de las operaciones
//	que retorne un número con decimales.
//	● Debe mostrar por consola un mensaje que
//	indique el resultado y la operación realizada.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		char opcion;
		
        do {
            RealizarOperacion(teclado);
            System.out.println("¿Desea realizar otra operación? (s/n)");
            opcion = teclado.next().charAt(0);
        } while (opcion == 's' || opcion == 'S');
        
        teclado.close();
		
	}
	
	public static void RealizarOperacion(Scanner teclado)
	{
		double num1;
		double num2;
		String operacion;
		
		
		System.out.println("Ingrese el numero 1: ");
		num1 = teclado.nextDouble();
		System.out.println("Ingrese el numero 2: ");
		num2 = teclado.nextDouble();
	    teclado.nextLine(); // Limpiamos el buffer de entrada antes de leer la operación
	    System.out.println("Elija una operación: +,-,/,*,%");
	    operacion = teclado.nextLine(); // Leemos toda la línea de entrada

	    Calcular(num1, num2, operacion.charAt(0)); // Tomamos el primer carácter de la cadena como operador
		
		
	}
	
	public static void Calcular(double num1, double num2, char operacion) 
	{
		double resultado=0;
		switch (operacion) {
		case '+':
			resultado= sumar(num1,num2);
			System.out.println("El resultado de la suma entre "+num1+" y "+num2+" es "+ resultado);
			break;
		case '-':
			resultado= restar(num1,num2);
			System.out.println("El resultado de la resta entre "+num1+" y "+num2+" es "+ resultado);
			break;
		case '*':
			resultado= multiplicar(num1,num2);
			System.out.println("El resultado de la multiplicación entre "+num1+" y "+num2+" es "+ resultado);
			break;
		case '/':
			resultado= dividir(num1,num2);
			System.out.println("El resultado de la división entre "+num1+" y "+num2+" es "+ resultado);
			break;
		case '%':
			resultado= resto(num1,num2);
			System.out.println("El resto de "+num1+" y "+num2+" es "+ resultado);
			break;
		default:
			System.out.println("Operacion no valida.");
		}
		
	}
	
	public static double sumar (double num1, double num2)
	{
		return num1 + num2;
	}
	
	public static double restar (double num1, double num2)
	{
		return num1 - num2;
	}
	
	public static double multiplicar (double num1, double num2)
	{
		return num1 * num2;
	}
	
	public static double dividir (double num1, double num2)
	{
		if(num2 == 0)
		{
			System.out.println("No se puede dividir por 0");
			return 0;
		}
		return num1 / num2;
	}
	
	public static double resto (double num1, double num2)
	{
		if(num2 == 0)
		{
			System.out.println("No se puede dividir por 0");
			return 0;
		}
		return num1 % num2;
	}
	
	

}
