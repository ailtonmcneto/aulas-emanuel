
public class Main{
    public static void main(String[] args) {

    CalcularArea c = new CalcularArea();
    double areaQuadrado = c.quadrado(5);
    System.out.println("área do primeiro quadrado: " + areaQuadrado);
    double areaQuadrado2 = c.quadrado(10);
    System.out.println("área do segundo quadrado: " + areaQuadrado2);
    double areaRetangulo = c.retangulo(5, 5);
    System.out.println("área do retângulo: " + areaRetangulo);
    double areaTriangulo = c.triangulo(3,5);
    System.out.println("área do triangulo: " + areaTriangulo);
    System.out.print("area do triangulo:");
    }
}
