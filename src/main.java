import java.util.Scanner;
import java.util.Stack;

public class main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        PruebasUnitarias();

        Calculadora(scan);
    }

    static void PruebasUnitarias(){
        System.out.println("Vamos a hacer primero unas pruebas unitarias.");
        System.out.println("Primero, probamos una multiplicación.");
        System.out.println("Multiplcaremos 6 veces 6, esto debe dar 36, veamos.");
        System.out.println();
        System.out.println("6 * 6 = " + String.valueOf(Operaciones.getInstance().Mult(6,6)));

        System.out.println("Ok, correcto.");
        System.out.println();

        System.out.println("Veamos con una raíz.");
        System.out.println("Raíz de 25 es 5, probemos");
        System.out.println();
        System.out.println("Raíz de 25 = " + String.valueOf(Operaciones.getInstance().SQRT(25)));
        System.out.println("Ok, correcto.");
        System.out.println("Todo bien.");
        System.out.println();
    }

    static void Calculadora(Scanner scan){
        System.out.println("Bienvenido a la calculadora!");
        System.out.println("Para multiplicacion presione 1, \n Para suma presione 2, \n Para resta presione 3, \n Para" +
                " division presione 4, \n Para raiz cuadrada presione 5");
        System.out.println("Introduzca su numero: ");
        int num = scan.nextInt();
        if (num > 0 & num < 5){
            System.out.println("Introduzca el primer numero: ");
            double num0 = scan.nextDouble();
            System.out.println("Introduzca el segundo numero: ");
            double num1 = scan.nextDouble();

            if (num == 1){
                System.out.println("Multiplicacion: " + String.valueOf(Operaciones.getInstance().Mult(num0,num1)));
            } else if (num == 2){
                System.out.println("Suma: "+String.valueOf(Operaciones.getInstance().Suma(num0,num1)));

            } else if (num == 3){
                System.out.println("Resta: "+ String.valueOf(Operaciones.getInstance().Resta(num0,num1)));
            } else {
                System.out.println("Division: "+String.valueOf(Operaciones.getInstance().Div(num0,num1)));
            }

        } else if (num == 5){
            System.out.println("Introduzca el primer numero: ");
            double num2 = scan.nextDouble();
            System.out.println("La raiz es: "+ String.valueOf(Operaciones.getInstance().SQRT(num2)));
        }
    }
}
