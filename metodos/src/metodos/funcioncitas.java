package metodos;

import java.util.Random;
import java.util.Scanner;

public class funcioncitas {

//	Funcion para hacer un System.out

	static void imprimirDatos() {
		System.out.println("Primer funcion de funcioncitas");
	}

//	Funcion con argumentos

	static void imprimirDatos1(String mensaje) {
		System.out.println(mensaje);
	}

//	Funcion que haga return booleano

	static boolean regresarBooleano() {
		return true;
	}

//	Return int

	static int regresarEntero() {
		return 2022;
	}

//	Return String

	static String regresarString() {
		return "Hola Mundo";
	}

//	Return double
	static double regresarDoble() {
		return 3.1415;
	}

//	Return double y arg double

	static double areaTriangulo(double base, double altura) {
		return base * altura / 2;

	}

//	Return double + mensaje
//	static String areaTrianguloMensaje(double base, double altura) {
//		return "El area del triangulo es: " + (base * altura /2);
//	}

	static String areaTrianguloMensaje(double base, double altura) {
		String mensaje = "El area del triangulo es: " + (base * altura / 2);
		return mensaje;
	}

//	Return string + mensaje
	static String imprimirLongitud(String mensaje) {
		return "La longitud es de: " + mensaje.length();
	}

//	Adivina Adivinador

	static Scanner sc = new Scanner(System.in);
	static Random rand = new Random();

//	Variables globales
	static int randomNumber = rand.nextInt(10) + 1;

	static int adivinaAdivinador() {
		int numeroUsuario = 0;
//      Ingresar valor
		System.out.println("El numero random es: " + 		randomNumber);
		System.out.println("Ingrese un numero del 1 al 10");
		numeroUsuario = sc.nextInt();

		while (numeroUsuario != randomNumber) {

//		      Ingresar valor
			System.out.println("Ingrese un numero del 1 al 			10");
			numeroUsuario = sc.nextInt();

//		          Primer condicion
			if (numeroUsuario == randomNumber) {
				System.out.println("Se ha ganado unos 				chocorroles");
//		              System.exit(0);
			} else if (numeroUsuario > randomNumber) {
				System.out.println("Su número ingresado es 				mayor");
			} else {
				System.out.println("Su número ingresado es 				menor");
			}
		}
		return numeroUsuario;
	}
	
//	Method Overloading
	static String error(String error) {
		String mensaje = "Ha ocurrido un error: " + error;
		return mensaje;
	}
//	Mismo metodo, mas parametros
	static String error(String error, String warning) {
		String mensaje = "Ha ocurrido un error: " + error + "\n" + warning;
		return mensaje;
	}
//	Mismo metodo, diferentes parametros
	static int error(int error) {
		int mensaje = error;
		return mensaje;
	}

	public static void main(String[] args) {
//		
//		imprimirDatos();
//		imprimirDatos1("Hola :p");
//		imprimirDatos1("Como estás?");

//		System.out.println(regresarBooleano());
//		System.out.println(regresarEntero());
//		System.out.println(regresarString());
//		System.out.println(regresarDoble());
//		System.out.println(areaTriangulo(3,7));
//		System.out.println(areaTrianguloMensaje(3, 7));
//		System.out.println("Tangananica");
//		System.out.println(adivinaAdivinador());
		
		System.out.println(error("404"));
		System.out.println(error("404", "No se encuentra la ruta"));		
		System.out.println(error(404));
	}

}
