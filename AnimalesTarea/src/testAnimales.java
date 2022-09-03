public class testAnimales {
    public static void main(String[] args) {

        //Primer animal

        Gato silvestre = new Gato();
        silvestre.sonido();
        silvestre.desplazarse();

        //Segundo animal
        System.out.println("--------------------------");
        Perro firulais = new Perro();
        firulais.sonido();
        silvestre.desplazarse();

        //Tercer animal
        System.out.println("--------------------------");
        Vaca pili = new Vaca();
        pili.sonido();
        silvestre.desplazarse();

        //Cuarto animal
        System.out.println("--------------------------");
        Pajaro Hernesto = new Pajaro();
        Hernesto.sonido();
        Hernesto.desplazarse();

        //Quinto animal
        System.out.println("--------------------------");
        Pato Lucas = new Pato();
        Lucas.sonido();
        Lucas.desplazarse();

    }
}
