package DatosPublicos;

import DatosPrivados.Bigotes;

public class CollarBigotes {
    public static void main(String[] args){
    //Constructor por defecto
    /*Bigotes.nombre = "Bigotes";
    Bigotes.edad = 15;
    Bigotes.colorDePelo = "cafe";
    Bigotes.numeroDeBigotes = 14;
    Bigotes.enfermedades = true;
    Bigotes.raza = "Siames";
    Bigotes.vacunas = true;
    Bigotes.calle = "Moctezuma y Madero";
    Bigotes.numeroCasa = 105;
    Bigotes.colonia = "Las Lomas de Santa Anita";
    Bigotes.numeroTelefono = 5512345678;
    Bigotes.codigoPostal = 00100;
    Bigotes.signoZodiacal = "Leo";
    Bigotes.peso = 12.34d;
    */
    Bigotes Bigotes = new Bigotes ("Bigotes", 15, "Cafe", 14 ,true, "Siames", true, "Moctezuma y Madero", 105, "Las lomas de santa anita", "5512345678", 12345, "Leo", 12.34d);

        System.out.println(Bigotes);
        System.out.println("-------------------");
        Bigotes.datosCollarBigotes();

/*        Bigotes.peso = 5.24d;
        System.out.println(Bigotes.peso);*/

        Bigotes.setPeso(3.45d);
        System.out.println("El peso actual es: " + Bigotes.getPeso());


    }
}
