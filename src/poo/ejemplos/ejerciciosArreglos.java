
package poo.ejemplos;
import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author leoguapo-mt
 */
public class ejerciciosArreglos {
    
    private Scanner leer;
    
    public static void main(String [] args){
        ejerciciosArreglos ti = new ejerciciosArreglos();
//        ti.numeroAlAzar();
//        ti.invertirArrays();
//        ti.promedio();
        ti.pedirDatosEnArray();
    }
    
    public void mostrarArray(){
        String nombre[] = {"Julion", "Karen", "Esteban", "Franchesco", "Isaackynio"};
        System.out.println(Arrays.toString(nombre));
        for(int i = 0; i<nombre.length; i++){
            System.out.println(nombre[i]);
        }
    }
    public void pedirDatosEnArray(){
        this.leer = new Scanner (System.in);
        System.out.println("Tamaño de array");
        int n = leer.nextInt();
        int [] num = new int [n];
        for(int i = 0; i<num.length; i++){
            num[i]=leer.nextInt();
        }
        System.out.println(Arrays.toString(num));
    }
    public void promedio(){
        
    }
//    public int numeroAlAzar(){
//        Random random = new Random();
//        System.out.println(Arrays.toString(random));
//        return random.nextInt(23) + 1;
//        
//    }
    public void invertirArrays(){
        int cont =0;
        int [] arr2, arr1 = {9, 5, 3, 2, 10};
        arr2 = new int [arr1.length];
        
        for (int i=arr1.length-1; i>=0; i--){
           if (cont < (arr1.length)){
                arr2[cont] = arr1[i];
                cont++;
          }
        }
        System.out.println(Arrays.toString(arr2));
        System.out.println();
    }
}
