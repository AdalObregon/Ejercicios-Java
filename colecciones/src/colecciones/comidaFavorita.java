package colecciones;

import java.util.ArrayList;
import java.util.Scanner;

public class comidaFavorita {

	public static void main(String[] args) {
		
		//Vamos a crear un menu para preguntarle al usuario su 			comida favorita
		
		//1. Pedirle su comida favorita (.add)
		//2. Preguntarle si quiere agregar mas comidas 					favoritas (condicional que dispare un 					.add)
		//3. Darle la opcion de modificar alguna 					comida (.set)
		//4. Darle la opcin de borrar cualquier comida 					que haya ingresado (.clear o .remove)
		
		//CRUD
		
		//Create
		//Read
		//Update
		//Delete
		
		Scanner scanner = new Scanner(System.in);
		ArrayList<String> comidaFavorita = new ArrayList<String>();
		byte arrayOpcion;
		byte op, op2;
		String comidaIngresada,nuevaComida;
	
		do {

			System.out.println("**Tu comida favorita***");

			System.out.println("¿Que desea hacer? \n" + "ingrese opcion numero");
			System.out.println("1.-Ingresar comida favorita \n" + "2.- Modificar Comida \n"
					+ "3.Borra comida- \n" + "4.Salir");
			op = scanner.nextByte();

			switch (op) {
			case 1:
				System.out.println("Ingrese su comida favorita");
				comidaIngresada = scanner.next();
				comidaFavorita.add(comidaIngresada);
				break;
			
			case 2:
				if (comidaFavorita.isEmpty()) {
					System.out.println("Error, lista vacia, primero ingrese su comida");
				} else {
					System.out.println(comidaFavorita);
					System.out.println("Ingrese la posicion de la comida que desea modificar");
					arrayOpcion = scanner.nextByte();
					System.out.println("Ingrese la nueva comida favorita");
					nuevaComida = scanner.next();
					comidaFavorita.set(arrayOpcion - 1,nuevaComida);
					System.out.println("Ha sido modificado correctamente");
					System.out.println(comidaFavorita);
					
				}
			
				break;
			case 3:
				if (comidaFavorita.isEmpty()) {
					System.out.println("Error, lista vacia, primero ingrese su comida");
				} else {
					System.out.println(comidaFavorita);
					System.out.println("Ingrese la posicion de la comida que desea borrar");
					arrayOpcion = scanner.nextByte();
					comidaFavorita.remove(arrayOpcion - 1);
					System.out.println("Ha sido borrado correctamente");
					System.out.println(comidaFavorita);
				}
				
				break;
			case 4:
				System.out.println("Saliendo...");
				break;

			default:
				System.out.println("Error"+ op+"No existe");
			}

		} while (op != 4);
	}

}
