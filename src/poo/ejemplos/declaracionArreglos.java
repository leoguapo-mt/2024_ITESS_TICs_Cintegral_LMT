
package poo.ejemplos;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author leoguapo-mt
 */
public class declaracionArreglos {
    public static void main (String []args){
        
        /**
         * un arreglo se declara de la siguiente forma
         * tipoVariable nomArreglo[] = new tipoVariable [longitud];
         * o
         * tipovariable nomArreglo[] = {valor1, valor2, valor3.....}
         */
        
        String []array1 = new String[3]; //dar tamano al arreglo
        array1[0] = "Leo";
        array1[1] = "Jesse";  //asignar un "valor" por casilla
        array1[2] = "pau";
        
        System.out.println("ARRAY 1");
        //muestra solo la casilla indicada
        System.out.println(array1[0]);
        System.out.println("");
        //muestra todo el array segun se indique en el FOR
        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }
        System.out.println("");
        //imprime el indice mas el dato
        for (int i = 0; i < array1.length; i++) {
            System.out.println("Indice " + i + ": " + array1[i]);
        }
        System.out.println("");
        //imrime el indice sin mostrar 0 mas el dato
        for (int i = 0; i < array1.length; i++) {
            System.out.println("Indice " + (i+1) + ": " + array1[i]);
        }
         
        //otra forma de declarar un array 
        String array2[] = {"Leo", "Jesse", "Pau"};
        
        System.out.println("");
        System.out.println("ARRAY 2");
        //muestra todo el array segun se indique en el FOR
        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i]);
        }
        System.out.println("");
        //imprime el indice mas el dato
        for (int i = 0; i < array2.length; i++) {
            System.out.println("Indice " + i + ": " + array2[i]);
        }
        System.out.println("");
        //imrime el indice sin mostrar 0 mas el dato
        for (int i = 0; i < array2.length; i++) {
            System.out.println("Indice " + (i+1) + ": " + array2[i]);
        }
         
        int []numeros, n;
        numeros = new int [5];
 
         
        boolean []logica = {true, false, true}; 
    }
}