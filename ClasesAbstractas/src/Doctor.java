public abstract class Doctor {

    //Atributos
    String nombre;

    //metodo para atender a un paciente
    public abstract void atenderPaciente();

} // Clase Doctor

/////////////////////////////

class Pediatra extends Doctor{


    @Override
    public void atenderPaciente() {
        System.out.println("el pediatra te regala una paleta");
    }//metodo atenderPaciente del pediatra.
}//Clase pediatra

////////////////////////////

class Cardiologo extends Doctor{

    @Override
    public void atenderPaciente() {
        System.out.println("El cardiologo nos hace un electrocardiograma");
    }
}

////////////////////////////

class Nutriologa extends Doctor{

    @Override
    public void atenderPaciente() {
        System.out.println("Nos regaña por tomar coca");
    }
}
////////////////////////////

class testDoctores{
    public static void main(String[] args) {
        Cardiologo Adal = new Cardiologo();
        Adal.atenderPaciente();
    }
}//main
