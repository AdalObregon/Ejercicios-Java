package org.generation.nomina;

import java.util.Arrays;

public class Front extends Supervisor {
    private int aniosExp;

    public Front(String firstName, String lastName, int age, String RFC, double salary, String departamento, double bono, int aniosExp) {
        super(firstName, lastName, age, RFC, salary, departamento, bono);
        this.aniosExp = aniosExp;

    }

//Constructor


    public int getAniosExp() {
        return aniosExp;
    }

    public void setAniosExp(int aniosExp) {
        this.aniosExp = aniosExp;
    }

    @Override
    public String toString() {
        return "Front{" +
                "aniosExp=" + aniosExp +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", RFC='" + RFC + '\'' +
                ", salary=" + salary +
                '}';
    }
}
