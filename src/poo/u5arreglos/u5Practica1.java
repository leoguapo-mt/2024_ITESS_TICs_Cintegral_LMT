
package poo.u5arreglos;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Programa que imprime el nombre de mis companeros 
 * Leonardo Mora Trujillo TI201
 * @author leoguapo-mt
 */
public class u5Practica1 {
    public static void main(String[] args) {
        u5Practica1 ti = new u5Practica1();
//        ti.verticalHorizontal();
//        ti.arregloN();

    }
    
    public void verticalHorizontal(){
        // esta es una opcion de la declaracion de un metodo
//        String [] nombres1 = new String [12];
//        nombres1 [0] = "Jesse";
//        nombres1 [1] = "pau";
//        nombres1 [2] = "leo";
//        nombres1 [3] = "gio";
//        nombres1 [4] = "esteban";
//        nombres1 [5] = "karen";
//        nombres1 [6] = "isaac";
//        nombres1 [7] = "julian";
//        nombres1 [8] = "antonio";
//        nombres1 [9] = "omar";
//        nombres1 [10] = "panchisco";
//        nombres1 [11] = "gera";

        //esta es otra forma mas corta de declararlo
        
        

        String nombres1[] = {"gera","panchisco","omar","antonio","julian","isaac","karen","esteban","gio","leo","pau","jesse"};
        
        //VERTICAL
        System.out.println("VERTICAL\n");
        for (int i=0; i <  nombres1.length; i++){
            System.out.println(nombres1[i] + " ");    
        }
        
        //HORIZONTAL
        System.out.println("\n\nHORIZONTAL\n");
        for (int i=0; i <  nombres1.length-1; i++){
            System.out.print(nombres1[i] + ", ");
        }
        System.out.print(nombres1[11] + ".");
    }
    
    public void arregloN(){
        Scanner in = new Scanner(System.in);
        
        System.out.println("Ingresa el tamaño del arreglo");
        int n = in.nextInt();
        int numeros[] = new int [n];
        
        System.out.println("Ahora llena los " + n + " espacios con valores enteros");
        for (int i=0; i < numeros.length; i++){
            numeros[i] = in.nextInt();
        }
        System.out.print(Arrays.toString(numeros));
    }
}