
package ci.u1riemann;

/**
 *
 * @author leoguapo-mt
 */
public class sumasTP03Ejercicio6 extends sumasRiemann {

    public sumasTP03Ejercicio6(double[] x, double[] w) {
        super(x, w);
    }
    
    @Override
    public double funcion(double x){
        return 3 * Math.cos(0.5*x);
    }

}
