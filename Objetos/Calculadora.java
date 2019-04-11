package Objetos;

import java.util.Scanner;

public class Calculadora {

    public Scanner popo = new Scanner(System.in);
    public double n1 = 0, n2 = 0, res = 0;

    public void pedirdatos() {
        System.out.println("Ingresa tu primer valor");
        n1 = popo.nextDouble();
        System.out.println("Ingrese tu segundo valor");
        n2 = popo.nextDouble();
        res = n1 + n2;
    }

    public void restar(double res) {
        System.out.println("La resta papu"+res);
    }

    public void restar() {
        res = n1 - n2;
        System.out.println("El resultado es: " + res + "\n");
    }

    public void sumar() {
        res = n1 + n2;
        System.out.println("El resultado es: " + res + "\n");
    }

    public void dividir() {
        res = n1 / n2;
        System.out.println("El resultado es: " + res + "\n");
    }

    public void multiplicar() {
        res = n1 * n2;
        System.out.println("El resultado es: " + res + "\n");
    }

    public static void main(String args[]) {
       
        int opc;
        Scanner pipi = new Scanner(System.in);
        Calculadora kk = new Calculadora();
        do {
            System.out.println("Ingresa la opcion que desee\n"
                    + "0)Salir'\n"
                    + "1)Suma\n"
                    + "2)Resta\n"
                    + "3)Division\n"
                    + "4)Multiplicacion\n");
            opc = pipi.nextInt();
            switch (opc) {
                case 0:
                    System.out.println("¡Gracias!");
                    break;
                case 1:
                    kk.pedirdatos();
                    kk.sumar();
                    break;
                case 2:
                    kk.pedirdatos();
                    kk.restar();
                    kk.restar(0);
                    break;
                case 3:
                    kk.pedirdatos();
                    kk.dividir();
                    break;
                case 4:
                    kk.pedirdatos();
                    kk.multiplicar();
                    break;
                default:
                    System.out.println("La opcion que digitaste no esta disponible");
            }
        } while (opc != 0);
    }

}
