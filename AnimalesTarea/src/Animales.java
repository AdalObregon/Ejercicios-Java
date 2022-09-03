public abstract class Animales {


    public abstract void sonido();
    public abstract void desplazarse();
}

class Gato extends Animales{


    @Override
    public void sonido() {
        System.out.println("El gato hace: Miauuuuuuu");
    }

    @Override
    public void desplazarse() {
        System.out.println("El gato se desplaza: Caminando");
    }

}

class Perro extends Animales {


    @Override
    public void sonido() {
        System.out.println("El perro hace: Guauuuuuuuuu");
    }

    @Override
    public void desplazarse() {
        System.out.println("El perro se desplaza: Caminando");

    }
}

class Vaca extends Animales {

    @Override
    public void sonido() {
        System.out.println("La vaca hace: Muuuuuuuuuuuuuu");
    }

    @Override
    public void desplazarse() {
        System.out.println("La vaca se desplaza: Caminando");

    }
}

class Pajaro extends Animales{

    @Override
    public void sonido() {
        System.out.println("El Pajaro hace: Pio Pio ");
    }

    @Override
    public void desplazarse() {
        System.out.println("El Pajaro se desplaza: Volando");
    }
}

class Pato extends Animales{

    @Override
    public void sonido() {
        System.out.println("El pato hace: Quack Quack");
    }

    @Override
    public void desplazarse() {
        System.out.println("El pato se desplaza: Nadando");
    }
}