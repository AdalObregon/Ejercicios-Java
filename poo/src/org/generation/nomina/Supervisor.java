package org.generation.nomina;

public class Supervisor extends Employee{
    /*Supervisor
    *
    * 1.- Atributos
    * 2.- Constructores
    * 3.- Metodos
    * 4.- toString
    * 5.- Getters and Setters
    * */



//    Atributos
    private String departamento;
    private double bono;

//    Constructor


    public Supervisor(String firstName, String lastName, int age, String RFC, double salary, String departamento, double bono) {
        super(firstName, lastName, age, RFC, salary);
        this.departamento = departamento;
        this.bono = bono;
    }

    //Metodos

    //Getters y Setters
    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public double getBono() {
        return bono;
    }

    public void setBono(double bono) {
        this.bono = bono;
    }


    //To String


    @Override
    public String toString() {
        return "Supervisor{" +
                "departamento='" + departamento + '\'' +
                ", bono=" + bono +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", RFC='" + RFC + '\'' +
                ", salary=" + salary +
                '}';
    }
}

