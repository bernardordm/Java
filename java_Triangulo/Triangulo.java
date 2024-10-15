import java.util.Scanner;
public class Triangulo {
    private float base;
    private float altura;
    private float area;
    public static Scanner sc = new Scanner(System.in);

    void calcularArea(){
        this.area = (this.base * this.altura)/2;
    }

    public static void main(String[] args) {
        System.out.println("Calculadora e comparativo de triangulos");

        Triangulo triangulo1 = new Triangulo();
        System.out.println("Digite os dados do primeiro triângulo:");
        System.out.println("Base do triângulo :");
        triangulo1.base = sc.nextFloat();
        System.out.println("Base digitada :"+ triangulo1.base);

        System.out.println("Altura do triângulo :");
        triangulo1.altura = sc.nextFloat();
        System.out.println("Altura digitada :"+ triangulo1.altura);

        triangulo1.calcularArea();
        System.out.println("A área do primeiro triângulo é :"+ triangulo1.area );

        Triangulo triangulo2 = new Triangulo();
        System.out.println("Digite os dados do segundo triângulo:");
        System.out.println("Base do triângulo :");
        triangulo2.base = sc.nextFloat();
        System.out.println("Base digitada :"+ triangulo2.base);

        System.out.println("Altura do triângulo :");
        triangulo2.altura = sc.nextFloat();
        System.out.println("Altura digitada :"+ triangulo2.altura);

        triangulo2.calcularArea();
        System.out.println("A área do segundo triângulo é :"+ triangulo2.area );


        if (triangulo2.area > triangulo1.area) {
            System.out.println("O triângulo 2 tem a área maior que o triângulo 1");
        }
        else if (triangulo2.area < triangulo1.area) {
            System.out.println("O triângulo 1 tem a área maior que o triângulo 2");
        }
        else if (triangulo2.area == triangulo1.area) {
            System.out.println("Os dois triângulos tem a mesma área.");
        }
        sc.close();
    }

}
