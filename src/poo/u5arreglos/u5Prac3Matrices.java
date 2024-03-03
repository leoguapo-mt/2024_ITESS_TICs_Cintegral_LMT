
package poo.u5arreglos;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author leoguapo-mt
 */
public class u5Prac3Matrices {
    public static void main(String [] args){
        u5Prac3Matrices leo = new u5Prac3Matrices();
        System.out.println("1\n__________________________________");
        leo.matrizLapicera();
        System.out.println("\n2\n__________________________________");
        leo.matrizNumeros();
        System.out.println("\n3\n__________________________________");
        leo.matrices1y0();
        System.out.println("\n4\n__________________________________");
        leo.matriz1y0de2x4();
        System.out.println("\n5\n__________________________________");
        leo.datosPersonales();
    }
    
    public void matrizLapicera(){
        String matriz [][] = {{"Borrador","Lapiz","Goma","Sacapuntas"},
                              {"USB","Corrector","Lapicero","Colores"},
                              {"Marcatextos","Sharpie","Sharpie negro",}
                             };
        for (int i=0; i<matriz.length; i++){
            for (int j=0; j<matriz[i].length; j++){
                System.out.print(matriz [i][j] + "\t");
            }
            System.out.println("");
        }
    }
    
    public void matrizNumeros(){
        int matriz [][] = {{8,9,10,6},
                           {1,2,3,5},
                           {0,0,0,6},
                           {0,0,0,6}};
        for (int i=0; i<matriz.length; i++){
            for (int j=0; j<matriz[i].length; j++){
                System.out.print(matriz [i][j] + "\t");
            }
            System.out.println("");
        }
    }
    
    //practica XD
    public void matrices1y0(){
        
        int [][] matriz = {{1,0,0,0},{0,1,0,0},{0,0,1,0},{0,0,0,1}};
        int [][] matriz1 = {{1,0,0,1},{0,1,1,0},{0,1,1,0},{1,0,0,1}};
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.println();
        }
        
        System.out.println("");
        System.out.println("");
        
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {
                System.out.print(matriz1[i][j]);
            }
            System.out.println();
        }
        
    }
    
    public void matriz1y0de2x4(){
        System.out.println("");
        System.out.println("");
        
        Scanner in = new Scanner(System.in);
        System.out.println("Ingresa el tamaño del arreglo");
        int n = in.nextInt();
        int numeros[][] = new int [n][2];
        if(n>0){
            System.out.println("Ahora llena los " + n + " espacios con valores enteros");
            for (int i=0; i < numeros.length; i++){
                System.out.println("Fila " + (i+1) + ": ");
                for (int j = 0; j < numeros[i].length; j++) {
                    System.out.print("Columna " + (j+1) + ": ");
                    numeros[i][j] = in.nextInt();
                }
            }
            for (int i = 0; i < numeros.length; i++) {
                System.out.print("|");
                for (int j = 0; j < numeros[i].length; j++) {
                    System.out.print(numeros[i][j] + "|");
                }
                System.out.println();
            }
        }
    }
    
    public void datosPersonales(){
        System.out.println("");
        System.out.println("");
        
        Scanner in = new Scanner(System.in);
        System.out.println("Ingresa el tamaño del arreglo");
        int n = in.nextInt();
        in.nextLine(); // es necesaria para que en elFor j no se salte a pedir la edad
        String datos[][] = new String [n][3];
        if(n>0){
            System.out.println("Ahora llena los datos");
            for (int i=0; i < datos.length; i++){
                System.out.println("Persona " + (i+1) + ": ");
                for (int j = 0; j < datos[i].length; j++) {
                    String campos[] = {"Nombre: ", "Edad: ", "Altura: "};
                    System.out.print(campos[j]);
                    datos[i][j] = in.nextLine();
                }
                System.out.println("");
            }
//            System.out.println("Datos: \n|Nombre\t|Edad\t|altura");
//            System.out.println(Arrays.deepToString(datos));
            
            System.out.println("Datos:\n"
                    + "|Nombre\t|Edad\t|Altura");
            for (int i = 0; i < datos.length; i++) {
                System.out.print("|");
                for (int j = 0; j < datos[i].length; j++) {
                    System.out.print(datos[i][j] + "\t|");
                }
                System.out.println();
            }
        }
            
    }
}

