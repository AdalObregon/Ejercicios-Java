public class Cuadrado extends Figura{

    int lado;
    
    @Override
    public float area() {
        return this.lado * this.lado;
    }
}
