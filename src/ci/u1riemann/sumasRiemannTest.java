
package ci.u1riemann;

/**
 *
 * @author leoguapo-mt
 */
public class sumasRiemannTest {
    public static void main(String ...args) {
        sumasEjemplo1Test();
//        sumasTP03Ejercicio6Test();
    }
    
    public static void  sumasEjemplo1Test() {
        double x[] = {0.25, 1, 1.5, 1.75, 2.25, 3};
        double w[] = {0.5, 1.25, 1.75, 2, 2.75};
        
        sumasEjemplo1 se1 = new sumasEjemplo1(x,w);
        
        se1.calcular();
        se1.imprimir();
    }
    
    public static void sumasTP03Ejercicio6Test() {
        double x[] = {    -Math.PI, 
                      -0.5*Math.PI, 
                   -0.3333*Math.PI,
                    0.3333*Math.PI,
                    7.0/12*Math.PI, 
                           Math.PI};
        double w[] = {-2.0/3*Math.PI, 
                      -1.0/3*Math.PI,
                       0, 
                       1.0/2*Math.PI,
                       2.0/3*Math.PI};
        
        sumasTP03Ejercicio6 stp = new sumasTP03Ejercicio6(x,w);
        
        stp.calcular();
        stp.imprimir();
    }
    
    public static void sumasTP03parte4(){
        double a = 1.0;
        double b = 2;
        int n = 1_000_000;
        double dx = (b-a)/n;
        double x[] = new double[n+1];
        double w[] = new double[n];
        
        
//        si se ejecuta con un for, en este ejercicio se evaluaria 1millon de 
//        veces en ejecutarlo, por lo cual es mejor 
//        for(int i=0; i < x.length; i++){
//            x[i] = a+i*dx;
//        }
//        for (int i=0; i<x.length; i++){
//            w[i] = x[i];   
//        }
        
    }
    
}