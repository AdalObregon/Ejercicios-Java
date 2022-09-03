package practicaFlujo;

import java.util.Scanner;

public class practicaFlujo {

	public static void main(String[] args) {
		// Variables globales
		Scanner sc = new Scanner(System.in);
		/*
		 * System.out.println("Ingrese su edad");
		 * 
		 * //Variables int edad = sc.nextInt();
		 * 
		 * //Logica if(edad> 0 && edad >= 18) {
		 * System.out.println("Ahi viene el SAT, A pagar por vivir"); } else {
		 * System.out.println("Te falta Danonino criatura"); }
		 * 
		 */

		/*
		 * // Logicaif(edad > 0) {// logica si es un numero validoif (edad >= 18) {
		 * System.out.println("Ahi viene el SAT. Pasa al afore.");} else if(edad < 18 )
		 * { System.out.println("Chiquitin");} } else {// logica si no es valido
		 * System.out.println("Ingrese un numero valido");}
		 */
		/*
		 * // Misma verificacion, con else ifif(edad <= 0)
		 * {System.out.println("Ingrese un numero valido");} else if (edad < 18) {
		 * System.out.println("Chiquitin"); } else {
		 * System.out.println("Ahi viene el SAT. Pasa al afore."); }
		 */

		// Primavera
		// Venano
		// Otoño
		// Invierno

		// input =1-4
		// Verificar a que estacion le pertenece le pertenece ese numero
		// Output = La estacion del año

		/*
		 * System.out.println("Las 4 estaciones"); int numero = sc.nextInt();
		 * 
		 * if (numero==1) { System.out.println("Es primavera"); } else if (numero==2); {
		 * System.out.println("Es verano"); } if (numero ==3); {
		 * System.out.println("Es Otoño"); } if (numero ==4);{
		 * System.out.println("Es invierno"); } // else {
		 * //System.out.println("El numero no es valido"); //}
		 */

		// Crear un programa donde el ususario deva adivinar un numero del 1 al 10
		// Declarar un numero del 1 al 10
		// Mientras no se adivine, sigue preguntando al usuario
		// Avisar al usuario si el numero es mayor, menor o igual al declarado
		// Debe de terminar cuando el usuario adivine.

		System.out.println("Ingrese un numero del 1 al 4");
		int estacion = sc.nextInt();

		switch (estacion) {
		case 1:
			System.out.println("Primevera");
			break;
		case 2:
			System.out.println("Verano");
			break;
		case 3:
			System.out.println("Hallowen");
			break;
		case 4:
			System.out.println("Navidad");
			break;

		default:
			System.out.println("Su numero no es valido");
		}

		/*
		 * Ejercicio 01 Calcular el descuento de usuario segun su nivel Fan club
		 * cinepolis
		 * 
		 * Variables: Nivel Fan, Descuento Niveles: 1 - 5%, 2 - 10%, 3 - 20%, 4 - 50%
		 * Output:
		 * "Usted es Super Fan de nivel $nivel y su descuento 				 					es de $descuento"
		 * 
		 */
		System.out.println("Ingrese su nivel de FanClub para obtener su descuento");
		int nivel = sc.nextInt();

		switch (nivel) {
		case 1:
			System.out.println("Usted es Fan nivel: " + nivel + " Y tiene acceso a un descuento del 5%");
			break;
		case 2:
			System.out.println("Usted es Fan nivel: " + nivel + " Y tiene acceso a un descuento del 10%");
			break;
		case 3:
			System.out.println("Usted es Fan nivel: " + nivel + " Y tiene acceso a un descuento del 20%");
			break;
		case 4:
			System.out.println("Usted es Fan nivel: " + nivel + " Y tiene acceso a un descuento del 50%");
			break;
		}


		/*
		 * Ejercicio 02
		 * 
		 * Calcular la mensualidad de el usuario segun su nivel y cupon de 			descuento int
		 * cupon = 10; 
		 * Variables: Nivel, Mensualidad, Cupon 
		 * Niveles: Basico, Intermedio,Completo, Pro 
		 * Output:
		 * "Suscripcion $suscripcion de: $mensaulidad aplicando cupon de 			promocion"
		 * 
		 * Monto: Basico = $100, Intermedio = 120, Completo = 170, Pro = 250;
		 * 
		 * Mensualidad: monto - (monto * cupon); resultado = monto - (monto * %);
		 * 
		 * 100 * .10 = 10% =
		 */
		System.out.println("Ingrese su nivel de Mensualidad para obtener su descuento");
		
		final double cupon = .10f;
		double mensualidad;
		int nivelUsuario, monto;
		nivelUsuario = sc.nextInt();

		switch(nivelUsuario) {
			case 1:
				monto = 100;
				mensualidad = monto - (monto * cupon);
				System.out.println("Suscripcion " + nivelUsuario + " de: " + mensualidad + " " + "aplicando cupon de promocion");
				break;
			case 2:
				monto = 120;
				mensualidad = monto - (monto * cupon);
				System.out.println("Suscripcion " + nivelUsuario + " de: " + mensualidad + " " + "aplicando cupon de promocion");
				break;
			case 3:
				monto = 170;
				mensualidad = monto - (monto * cupon);
				System.out.println("Suscripcion " + nivelUsuario + "de: " + mensualidad + " " + " aplicando cupon de promocion");
				break;
			case 4:
				monto = 250;
				mensualidad = monto - (monto * cupon);
				System.out.println("Suscripcion " + nivelUsuario + " de: " + mensualidad + " " + " aplicando cupon de promocion");
				break;
				default:
					System.out.println("Ingresa un valor valido");

			}
	
	}
}
