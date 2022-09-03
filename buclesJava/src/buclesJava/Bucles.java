package buclesJava;
import java.util.Scanner;

public class Bucles {

	public static void main(String[] args) {
		

		// WHILE finito
		
		/*
        int suma = 0;
        while (suma <= 10) {
            suma++;
            System.out.println(suma);
        }
        */
		
        // Do While
//        int suma2 = 0;
//        boolean disparador = true;
//        do {
//        	System.out.println(++suma2);
//        	disparador = true;
//        } while(disparador == true);
//	}
//	
//		Algoritmo de un do while para hacer la suma de los primeros 10 numeros naturales
//		Sumar 1 + 1 = 2, 2 + 2 = 4, 4 + 3 = 7, 7 + 4 = 11 ... n + 10; 

//		Variables globales
//		int numero = 0;
//		int suma = 0;
//		
//		do {
//			suma = suma + numero;
//			numero++;
//			System.out.println(suma);
//		} while(numero  <= 10);

		
// 	   BUCLE FOR
		
//	   FOR infinito
//		for (int i = 1; i >= 1; i++) {
//			System.out.println(i);
//		}
		
// 		FOR infinito al 100
//		for(int i = 0; i <= 100; i++) {
//			System.out.println(i);
//		}
		
		
//		Suma primeros 10 numeros naturales con un FOR loop		
//		int suma = 0;
//		for(int i = 0; i <= 10; i++) {
//			System.out.println(suma += i);
//		}
		
//		Ejercicio 01 	
//		Escribir un programa que regrese el valor del factorial de un numero;
//		Factorial es: (n * n-1* n-2 * n-3) ... n >= 0;

		Scanner factorial = new Scanner(System.in);
		
		
		System.out.println("Ingrese un numero");
		int numero = factorial.nextInt();
		
		int resultado = 1;
		
		for(int i = 2; i <= numero; i++) {
				resultado *=1;
			
			System.out.println("El factorial de: " + numero + " es: " + resultado );
		}
	
		
////		Ejercicio 02
////		Si un numero es multiplo de 3 mostrar 'Fizz'
////		Si un numero es multiplo de 2 mostrar 'Buzz'
////	Si un numero es multiplo de 3 y 5 mostrar 'Fizz Buzz'
//		
		for(int i = 1; i <=50; i++) {
			if(i % 15 == 0) {
				System.out.println("Fizz Buzz " + i);
			}
			if(i % 3 == 0) {
				System.out.println("Fizz " + i);
			}
			if(i % 2 == 0) {
				System.out.println("Buzz " + i);
			}
		}

		
//		Variables globales
		int cont = 1;
		int a = 0;
		int c = 0;
		int b = 1;
		
		while(cont <= 13) {
			a = b;
			b = c;
			c = a + b;
			cont++;
			System.out.println(c);
		}

}
}
