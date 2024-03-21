import Taller01Sismos.scr;
import java.util.Random;


public class Taller01Sismos {

    private double [][] lecturaSensor = new double[7][24];
    private Random random             = new Random();

    //===================METODO 1  (Ingresar datos)===================//
    private void ingresarDatos (){
        for( int dia= 1; )
    }

    //===================MENU===================//
    public void menu (){
        int opciones;
        do{
            System.out.println("\n =============Menu=============");
            System.out.println("1. Ingresar datos");
            System.out.println("2. Mostrar sismos de mayor magnitud");
            System.out.println("3. Contar sismos mayores de o iguales a 5.0");
            System.out.println("4. Enviar SMS por cada sismos mayor o igual a 7.0");

        }
    }
}