

public class esercizio21di1 {
    public static void main(String[] args) {
        Rectangulo rect = new Rectangulo(6,9,TipoForma.RECTANGULO);
        System.out.println(rect.getX());
        System.out.println("Base: "+ rect.getLado1() +", altura: "+ rect.getLado2());
        System.out.println("Area= " + rect.calcularArea());

        System.out.println('\n');

        Triangulo tria = new Triangulo(6,9, TipoForma.TRIANGULO);
        System.out.println(tria.getX());
        System.out.println("Base: "+ tria.getBase() +", altura: "+ tria.getAltura());
        System.out.println("Area= " + tria.calcularArea());
    }
}
