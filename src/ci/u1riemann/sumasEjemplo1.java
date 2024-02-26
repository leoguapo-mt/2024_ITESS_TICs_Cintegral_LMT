
package ci.u1riemann;

/**
 *
 * @author leoguapo-mt
 */
public class sumasEjemplo1 extends sumasRiemann {

    public sumasEjemplo1(double[] x, double[] w) {
        super(x, w);
    }
    
    @Override
    public double funcion(double x){
        return 10 - x*x;
    }
}
