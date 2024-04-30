
public class geometricas {
double area;
double perimetro;
double hipotenusa;

public geometricas(double area, double perimetro) {
    this.area = area;
    this.perimetro = perimetro;
}

void circulo(double radio){
area=3.14159*radio*radio;
perimetro=2 * 3.14159 * radio;
System.out.println("El area del circulo es: "+area+" cm");
System.out.println("El perimetro del circulo es: "+perimetro+" cm");
}


void rectangulo(double base, double altura){

area=base*altura;
perimetro=2*(base+altura);
System.out.println("\nEl area del rectangulo es: "+area+" cm");
System.out.println("El perimetro del rectangulo es: "+perimetro+" cm");

}

void cuadrado(double lado){
area=lado*lado;
perimetro=4*lado;
System.out.println("\nEl area del cuadrado es: "+area+" cm");
System.out.println("El perimetro del cuadrado es: "+perimetro+" cm");
}


void triangulo(double base, double altura,double lado1,double lado2,double lado3){
area=0.5*base*altura;
perimetro=lado1+lado2+lado3;
System.out.println("\nEl area del triangulo es: "+area+" cm");
System.out.println("El perimetro del triangulo es: "+perimetro+" cm");
}

void hipotenusa(double lado1, double lado2){
hipotenusa=(lado1 * lado1 + lado2 * lado2);
System.out.println("\nLa hipotenusa del triangulo rectangulo es de: "+hipotenusa);

}



public static void main(String[] args) {
    geometricas geo1 = new geometricas(0, 0);
geo1.circulo(50);
geo1.rectangulo(2, 5);
geo1.cuadrado(5);
geo1.triangulo(6, 8, 2, 3, 5);
geo1.hipotenusa(3, 4);
}



}