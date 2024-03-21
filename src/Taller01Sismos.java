import java.util.Random;
import java.util.Scanner;

public class Taller01Sismos {

    private double[][] lecturas;
    private Random random;

    public Taller01Sismos() {
        lecturas = new double[7][24];
        random = new Random();
    }

    //===================METODO 1  (Ingresar datos)===================//
    private void ingresarDatos() {
        for (int fila = 0; fila < lecturas.length; fila++) {
            for (int columna = 0; columna < lecturas[fila].length; columna++) {
                double lectura = random.nextDouble() * 10;
                lecturas[fila][columna] = lectura;
            }
        }
    }

    //===================METODO 2 (Buscar mayor sismo)===================//
    public double mayorSismo(double[][] sismos) {
        double mayorIntensidad = 0.0;
        for (int fila = 0; fila < sismos.length; fila++) {
            for (int columna = 0; columna < sismos[fila].length; columna++) {
                if (sismos[fila][columna] > mayorIntensidad) {
                    mayorIntensidad = sismos[fila][columna];
                }
            }
        }
        return mayorIntensidad;
    }

    //===================METODO 3 (Contar sismos mayores de 5.0)===================//
    public int contarSismos(double[][] sismos) {
        int contador = 0;
        for (int fila = 0; fila < sismos.length; fila++) {
            for (int columna = 0; columna < sismos[fila].length; columna++) {
                if (sismos[fila][columna] >= 5.0) {
                    contador++;
                }
            }
        }
        return contador;
    }

    //===================METODO 4 (Enviar SMS por cada sismo mayor o igual a 7.0)===================//
    public void enviarSMS(double[][] sismos) {
        for (int fila = 0; fila < sismos.length; fila++) {
            for (int columna = 0; columna < sismos[fila].length; columna++) {
                if (sismos[fila][columna] >= 7.0) {
                    System.out.println("ALERTAAA!! SE DEBE EVACUAR LA ZONA COSTERA!!!");
                }
            }
        }
    }
    //===================METODO 5 (imprimir los datos)===================//
    private void imprimirLecturas() {
        for (int fila = 0; fila < lecturas.length; fila++) {
            for (int columna = 0; columna < lecturas[fila].length; columna++) {
                System.out.printf("%.2f ", lecturas[fila][columna]);
            }
            System.out.println();
        }
    }

    //===================MAIN PARA EL MENU===================//
    public static void main(String[] args) {
        Taller01Sismos sensor = new Taller01Sismos();
        sensor.menu();
    }

    //===================MENU===================//
    public void menu() {
        int opcion;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("\n =============Menu=============");
            System.out.println("1. Ingresar datos");
            System.out.println("2. Mostrar sismos de mayor magnitud");
            System.out.println("3. Contar sismos mayores de o iguales a 5.0");
            System.out.println("4. Enviar SMS por cada sismos mayor o igual a 7.0");
            System.out.println("0. Salir del programa");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    ingresarDatos();
                    System.out.println("Todos los datos ingresados.");
                    break;
                case 2:
                    double mayorSismo = mayorSismo(lecturas);
                    System.out.println("El sismo de mayor magnitud es: " + mayorSismo);
                    break;
                case 3:
                    imprimirLecturas();
                    System.out.println("La cantidad de sismos mayores o iguales a 5.0 es: ");
                    break;
                case 4:
                    enviarSMS(lecturas);
                    break;
                case 0:
                    System.out.println("bai bai");
                    break;
                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
            }
        } while (opcion != 0);
        scanner.close();
    }
}
