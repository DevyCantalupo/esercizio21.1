public class Rectangulo extends Forma  {
    private double lado1;
    private double lado2;
    private TipoForma x;

    public Rectangulo(double lado1, double lado2,TipoForma x) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.x = x;

    }

    public double getLado1() {
        return lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public double calcularArea(){
        return lado1 * lado2;
    }

    public TipoForma getX() {
        return x;
    }
}
