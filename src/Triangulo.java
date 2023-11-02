public class Triangulo extends Forma {
    private double base;
    private double altura;
    private TipoForma x;

    public Triangulo(double base, double altura, TipoForma x) {
        this.base = base;
        this.altura = altura;
        this.x = x;
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    public double calcularArea(){
        return (base * altura )/2;
    }

    public TipoForma getX() {
        return x;
    }
}
