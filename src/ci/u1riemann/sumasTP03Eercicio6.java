
package ci.u1riemann;

/**
 *
 * @author leoguapo-mt
 */
public class sumasTP03Eercicio6 extends sumasRiemann {

    public sumasTP03Eercicio6(double[] x, double[] w) {
        super(x, w);
    }
    
    @Override
    public double funcion(double x){
        return 3 * Math.cos(0.5*x);
    }

}
