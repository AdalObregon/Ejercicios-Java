package DatosPrivados;

public class Bigotes {

/*
    Orden para crear clases y objetos

    1.- Definir atributos de la clase.
    2.- Constructores.
    3.- Metodos
    4.- toString para poder visualizar la informacion
 */
//    Atributos
    public String nombre;
    public int edad;
    private String colorDePelo;
    private int numeroDeBigotes;
    public boolean enfermedades;
    private String raza;
    public boolean vacunas;
    private String calle;
    private int numeroDeCasa;
    private String colonia;
    public String numeroTelefono;
    private int codigoPostal;
    public String signoZodiacal;
    private double peso;


    //Constructores




    public Bigotes(String nombre, int edad, String colorDePelo, int numeroDeBigotes, boolean enfermedades, String raza, boolean vacunas, String calle, int numeroDeCasa, String colonia, String numeroTelefono, int codigoPostal, String signoZodiacal, double peso) {
        super();
        this.nombre = nombre;
        this.edad = edad;
        this.colorDePelo = colorDePelo;
        this.numeroDeBigotes = numeroDeBigotes;
        this.enfermedades = enfermedades;
        this.raza = raza;

        this.vacunas = vacunas;
        this.calle = calle;
        this.numeroDeCasa = numeroDeCasa;
        this.colonia = colonia;
        this.numeroTelefono = numeroTelefono;
        this.codigoPostal = codigoPostal;
        this.signoZodiacal = signoZodiacal;
        this.peso = peso;
    }//Constructor

    //        To String
    @Override
    public String toString() {
        return "Bigotes{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", colorDePelo='" + colorDePelo + '\'' +
                ", numeroDeBigotes=" + numeroDeBigotes +
                ", enfermedades=" + enfermedades +
                ", raza='" + raza + '\'' +
                ", vacunas=" + vacunas +
                ", calle='" + calle + '\'' +
                ", numeroDeCasa=" + numeroDeCasa +
                ", colonia='" + colonia + '\'' +
                ", numeroTelefono='" + numeroTelefono + '\'' +
                ", codigoPostal=" + codigoPostal +
                ", signoZodiacal='" + signoZodiacal + '\'' +
                ", peso=" + peso +
                '}';
    }// To String

//   Metodo
    public void datosCollarBigotes(){
        System.out.println(this.nombre);
        System.out.println(this.edad);
        System.out.println(this.colorDePelo);
        System.out.println(this.numeroDeBigotes);
        System.out.println(this.enfermedades);
        System.out.println(this.raza);
        System.out.println(this.vacunas);
        System.out.println(this.calle);
        System.out.println(this.numeroDeCasa);
        System.out.println(this.colonia);
        System.out.println(this.numeroTelefono);
        System.out.println(this.codigoPostal);
        System.out.println(this.signoZodiacal);
        System.out.println(this.peso);
    }

//    Getters y Setters
    public double getPeso() { //Metodo para obtener el peso
        return peso; //Retorna el peso original
    }//

    public void setPeso(double peso) { //Metodo par amodificar el peso
        this.peso = peso;   //tomo el peso original y puedo cambiarlo.
    }
}//Bigotes
