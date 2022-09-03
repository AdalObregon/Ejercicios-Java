package org.generation.nomina;

public class Employee {




        //1.- Propiedades.

        public String firstName;
        public String lastName;
        public int age;
        public String RFC;
        public double salary;

        //2.- Constructor
    /*
    En el constructor debemos tomar en cuenta lo siguiente

    1.- Debe coincidir con el nombre de nuestra clase.
    2.- Debe tener los parametros que declaramos anteriormente como parametros
    3.-
    * */

//    Constructor usando todos los parametros
    public Employee(String firstName, String lastName, int age, String RFC,double salary){
            super();
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.RFC = RFC;
            this.salary = salary;
        }
//    Constructor usando Strings nombre y apellido
    public Employee(String firstName, String lastName){
        super();
        this.firstName = firstName;
        this.lastName = lastName;
    }
//    Constructor usando String nombre e int edad
    public Employee(String firstName, int age){
        super();
        this.firstName = firstName;
        this.age = age;
    }

//    Metodos o funciones de nuestro sistema contable

//      Metodo para imprimir recibo de nomina (ustedes).

//      Metodo para calcular salario.

    public void calculateSalary(){
        System.out.println("El salario es: " + this.salary * 21);
    }// calculateSalary

    //Metodo para calcular salario con dias festivos
    public void calculateSalary(int days, int holidays){
        holidays *=3;
        System.out.println((this.salary * holidays) + (this.salary * days));
    }
    /*
    Estructura de un método o una función
    Modificador de acceso + tipo de retorno+ Nombre + Parametros
*/

    //Metodos (acciones a realizar)
    //Obtener el nombre
    //Calcular salario por mes
    //Imprimir el recibo de nomina


    //Metodo para calcular el salario
    //Sintaxis del metodo (modificador de acceso + void + nombre del metodo + parametros)


    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", RFC='" + RFC + '\'' +
                ", salary=" + salary +
                '}';
    }
} // Class Employee

/*
* 1.- Vamos a crear dos clases: Employee y TestEmployee.
* 2.- Clases y Objetos.
*   - Tipos de datos.
*   - Clases Wrapper.
* 3.- Crear nuestro primer constructor.
* 4.- Crear metodos para calcular salario.
* 5.- Sobrecarga de metodos.
* 6.- Sobrecarga de constructores.
* 7.- Crear paquetes (org.generation.nomina.)
* 8.- Revisar errores.
*
* */



