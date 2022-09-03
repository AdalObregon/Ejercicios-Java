import java.util.Scanner;
import java.util.Random;

public class Jueguito {

	public static void main(String[] args) {
//      Objetos
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();

//      Variables globales
		int randomNumber = rand.nextInt(10) + 1;

//      Debugging
		System.out.println("El numero random es: " + randomNumber);
		int numeroUsuario = 0;

		while (numeroUsuario != randomNumber) {

//      Ingresar valor
			System.out.println("Ingrese un numero del 1 al 10");
			numeroUsuario = sc.nextInt();

//          Primer condicion
			if (numeroUsuario == randomNumber) {
				System.out.println("Se ha ganado unos chocorroles");
//              System.exit(0);
			} else if (numeroUsuario > randomNumber) {
				System.out.println("Su número ingresado es mayor");
			} else {
				System.out.println("Su número ingresado es menor");
			}
		}
	}
}