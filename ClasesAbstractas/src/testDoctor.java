public class testDoctor {
    public static void main(String[] args) {

        Cardiologo Adal = new Cardiologo();
        Adal.atenderPaciente();

        Pediatra Fernanda = new Pediatra();
        Fernanda.atenderPaciente();

        Nutriologa Mariana = new Nutriologa();
        Mariana.atenderPaciente();
    }
}
