
package poo.ejemplos;

/**
 *
 * @author leoguapo-mt
 */
public class ejemploMatrices {
    public static void main(String[] args) {
        ejemploMatrices bidi = new ejemploMatrices();
        
        String arr[][] = {
            {"Isaac","Tonio","Sebas"},
            {"karen","","pau"},
            {"","",""}
        };
        bidi.mostrarBidArr(arr);
        //Se rellenan los datos faltantes en la matriz de arriba
        arr[1][1] = "Diana";
        arr[2][0] = "Manuel";
        arr[2][1] = "Omar";
        arr[2][1] = "panch";
        System.out.println("____________________");
        bidi.mostrarBidArr(arr);
    }
    
    
    public void mostrarBidArr(String bidimensional[][]){
        for (int i = 0; i < bidimensional.length; i++) {
            for (int j = 0; j < bidimensional[i].length; j++) {
                System.out.print(bidimensional[i][j] + "\t");
            }
            System.out.println();
        }
    }
    
    public void ti201(){
        
    }
}
