package org.generation.test;

import org.generation.nomina.Employee; //Si dejamos el *, tendremos acceso a todos los elementos. En este caso, la unica clase que nos importa es la clase Employee
import org.generation.nomina.Front;
import org.generation.nomina.Supervisor;


public class testEmployee {
    public static void main(String[] args) {

        //CONSTRUCTOR POR DEFAULT
        //Es importante mantener el orden de los parametros al momento de construir a nuestro empleado
        Employee Adal = new Employee("Adal","Obregon", 24, "AOU920416XXX", 350.65);
        Employee Angel = new Employee("Angel", "Martinez", 24, "XXXXXXXXXXX", 1024.50);

//        Instanciar para crear al supervisor Alonso
        Supervisor Alonso = new Supervisor ("Alonso", "Grajeda", 289, "ALGR12454XXXX", 15000.32, "Mentoria", 500);

//        Instanciar Front
        Front Irma = new Front("Irma", "Meza", 23, "AOU920416XXX", 15000, "Front", 1500, 10);


        System.out.println(Irma);
        System.out.println("Salario de Adal");
        //Ponemos el nombre del objeto.nombre del metodo
        Adal.calculateSalary();
        Adal.calculateSalary(10, 2);
        System.out.println();

        System.out.println("Salario de Angel");
        //Ponemos el nombre del objeto.nombre del metodo
        Angel.calculateSalary();

    }
}
