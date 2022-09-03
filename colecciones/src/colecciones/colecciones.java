package colecciones;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;


public class colecciones {

	/*
	 * Estructuras de datos
	 * 
	 * 
	 * Son un sistema mediante el cual se organizan los 			datos en la memoria de
	 * nuestra aplicacion que estamos desarrollando. 			Tenemos muchas formas de
	 * organizar esta informacion, como:
	 * 
	 * 
	 * - Arrays (datos primitivos)
	 * 
	 * - Colecciones (clases) - Listas (list) - 				Conjuntos (Set/HashSet) - Mapas
	 * (Map/HashMap)
	 * 
	 * //Sintaxis de nuestros arreglos en JAVA
	
		//TipoDato [] nombreDelArreglo = {"elemento 1", "elemento 2", 		"elemento n};

	 * 
	 * 
	 * Los arreglos normales son para un solo tipo de 			dato, ordenados por indice y
	 * tienen un tamanio definido.
	 * 
	 * 
	 * Cosas que podemos hacer con arreglos normales
	 * 
	 * 	- Crearlos
	 * 	- Recorrerlos
	 * 	- Saber su tamaño
	 * 	- Encontrar elementos por su indice
	 * 	- Hacer copias
	 * 
	 *
	 *
	 *
	 *
	 */
	
	


	public static void main(String[] args) {
		
		//Arreglos "normales"
		
		// sintaxis basica de un arreglo
		// Primero se declara el tipo de dato
		// Despues, se abren corchetes para indicar que es 			un array
		// Se agrega el nombre de nuestro array
		// Por ultimo, se agregan los valores dentro de 			llaves {}
		
		//Matriz (arreglo de arreglos)
		int matriz [][] = {
				{1, 2, 3, 4, 5}, //0
				{6, 7, 8, 9, 10}, // 1
				{11, 12, 13, 14, 15} // 2
		};
		System.out.println(matriz[1][3]);
		
		
		
		
		
		
		
		
		
		
		
		String[] meses = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio"}; 
		int [] calificaciones = {1,4,6};
		
		//Cosas que podemos hacer enun array "normal"
		System.out.println(meses.length);
		System.out.println("La posicion del indice 1 es: " + meses[1]);
		
		//Ejemplo de arreglo con el limite establecido
		int [] numerosDel1Al100 = new int[100];
		
		//foreach para recorrer elementos de un array normal
		for (String temporal:meses) { //Para cada elemento del tipo string que hay en meses, sacalo de ahi, asignalo a una variable llamada temporal
			System.out.println(temporal); // Imprime la variable temporal
		}
		
		/*
		 * Colecciones
		 * 
		 * 
		 * Listas (list)
		 * 
		 * 
		 * La interfaz List define una sucesion de elementos. A diferencia de la interfaz Set, esta si admite elementos duplicados. Podemos hacer distintas cosas con las listas como:
		 * 
		 * - Manipular elementos en funcion de su posicion dentro de esta lista
		 * - Buscar elementos concretos de la lista y devolver su posicion
		 * - Iterar o hacer ciclos sobre esos elementos
		 * - Realizar operaciones sobre rangos de elementos de la misma lista
		 * 
		 * ArrayList
		 * 
		 * 
		 * 
		 * Implementacion mas utilizada dentro de la coleccion List. Se basa en un array redimensionable, esto es que va aumentando de tamanio dependiendo de la situacion. Es el que mayor rendimiento tiene dentro de las listas (linkedlist).
		 
		 * 
		 * Caracteristicas del ArrayList: 
	*	- Siempre va indexado
	*	- Si le agregamos un elemento, solo se agrega al final
	*	- Podemos almacenar elementos repetidos
	*	- Tienen un orden conforme los vamos agregando
	*
		 */
		
		ArrayList<String> autos = new ArrayList<String>();
		
		//Agregar datos al ArrayList con .add
		autos.add("Honda");
		autos.add("Nissan");
		autos.add("Audi");
		
		System.out.println(autos);
		
		//Metodo para modificar items con .set
		autos.set(0, "Mustang");
		System.out.println(autos);
		
		//Metodo para quitar o remover items con .remove
		autos.remove(0);
		System.out.println(autos);
		
		System.out.println(autos.get(0));
		System.out.println(autos.size());
		autos.clear();
		System.out.println(autos);
		
		//////////////////////////////////////////////////
//		System.out.println("Ingresa tu comida favorita");
//		
//		
//		
//		ArrayList<String> comodaFavoritaDeAdal = new 		ArrayList<String>();
//		comodaFavoritaDeAdal.add(comidaIngresada);
//		System.out.println("La comida favorita de Adal Es: " + comodaFavoritaDeAdal);
		

		 /*
		  * Set (conjuntos)
		 * 
		 * Define una coleccion que no puede tener elementos duplicados. Dentro de esta interfaz existen distintas implementaciones, una de ellas es HashSet. Sirve para almacenar datos en una tabla hash. Es la implementacion que mejor rendimiento de todas da, pero no garantiza el orden al momento de hacer iteraciones. Debemos definir el tamanio inicial de la tabla porque el tamanio marcara el rendimiento de esta implementacion.
		 * 
		 * Map (mapas)
		 *
	 *La interfaz Map asocia claves a valores, y no puede contener claves duplicadas, y cada una de esas claves solo puede tener asociado un valor como maximo. Dentro de los map, existe la implementacion llamada HashMap, la cual almacena las claves en una tabla hash. Es la implementacion que mejor rendimiento tiene de todas, y es imporante definir el tamanio inicial de la tabla ya que este tamanio define el rendimiento de la implementacion.

		 * 
		 * 
		 * 
		 * 
*/
	
		// ArrayList
		ArrayList<String> autos2 = new ArrayList<String>(); 
					autos2.add("Honda");
					autos2.add("Nissan");
					autos2.add("Audi");

		//HashSet (metodos)
		HashSet<String> cars = new HashSet<String>();
					cars.add("Volvo");
					cars.add("BMW");
					cars.add("Ford");
					cars.add("BMW");
					cars.add("Mazda");
					System.out.println(cars);
					
		// HashMap
		HashMap<String, String> capitalCities = new HashMap<String, String>();
				    capitalCities.put("England", "London");
				    capitalCities.put("Germany", "Berlin");
				    capitalCities.put("Norway", "Oslo");
				    capitalCities.put("USA", "Washington DC");
				    capitalCities.put("Mexico", "CDMX");
				    System.out.println(capitalCities);


/////////////////////////////////////////////////////////////
				    
				 // ArrayList
					System.out.println("ARRAYLIST");
					ArrayList<String> participantes = new ArrayList<String>(); 
					participantes.add("Felipe");
					participantes.add("Jaciel");
					participantes.add("Edwin");
					participantes.add("Gabriel");
					participantes.add("Fernando");
					participantes.add("Fernando");
					System.out.println(participantes);
					
					
					System.out.println("HASHSET");
					//HashSet (metodo para comprobar si existe un elemento o no)
					HashSet<String> participantes2 = new HashSet<String>();
					participantes2.add("Felipe");
					participantes2.add("Jaciel");
					participantes2.add("Edwin");
					participantes2.add("Gabriel");
					participantes2.add("Fernando");
					System.out.println(participantes2);
					
				    
				    System.out.println("HASHMAP");
					//HashMap
				    HashMap<String, Integer> calificaciones1 = new HashMap<String, Integer>();
				    //metodo put para agregar informacion
				    calificaciones1.put("Felipe", 5);
				    calificaciones1.put("Jaciel", 10);
				    calificaciones1.put("Edwin", 10);
				    calificaciones1.put("Gabriel", 9);
				    calificaciones1.put("Fernando1", 9);
				    calificaciones1.put("Fernando2", 7);
				    calificaciones1.put("Fernando3", 0);
				    System.out.println(calificaciones1);
				    
				    
				    
				    
				    
				    
				    
				    
				    
				    
				    
				    
				    
				    
				    
				    
				    
				    
				    
				    
				    

	}//Main

}//Main class colecciones
