package poo.u5arreglos;
import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author leoguapo-mt
 */

public class u5Practica2 {
    
    private Scanner leo;
    
    public static void main(String[] args) {
        
        u5Practica2 ti = new u5Practica2();
        System.out.println("1_________________________");
        ti.promedio();
        System.out.println("");
        System.out.println("2_________________________");
        ti.alAzar();
        System.out.println("");
        System.out.println("3_________________________");
        ti.invertidos();
    }
    
    public void promedio(){
        this.leo = new Scanner(System.in);
        int suma = 0, div;
        System.out.println("Ingresa la cantidad de calificaciones a promediar: ");
        div = leo.nextInt();
        if (div>0){
            int [] arr = new int [div];
            System.out.println("Ingresa las calificaciones: ");
            for(int i=0; i < arr.length; i++){
                arr[i] = leo.nextInt();
                suma = suma + arr[i];
            }
            suma /= div;
            System.out.println("Promedio" + suma);
        }
    }
    
    public void alAzar(){
        String []arr = new String[6];
        arr[0] = "Leo";
        arr[1] = "JEsse";
        arr[2] = "gio";
        arr[3] = "Gera";
        arr[4] = "Pau";
        arr[5] = "Esteban";
        
        System.out.println("Arreglo completo: ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + ", ");
        }
        
        System.out.println("3 nombres random");
        int ran=0;
        for (int i = 0; i<3 ; i++) {
            ran = (int)(Math.random()*arr.length);
            System.out.println(arr[ran]);
        }
    }
    
    public void invertidos(){
        int cont = 0;
        int arr []= {1,2,3,4,5};
        
        System.out.println("Arreglo original");
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + ", ");
        }
        System.out.println("");
        System.out.println("Arreglo invertido");
        for(int i = arr.length-1; i>=0; i--){
            System.out.print(arr[i] + ", ");
        }
    }
    
}
