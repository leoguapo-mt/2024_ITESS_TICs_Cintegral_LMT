
package ci.u1teoremaf;

/**
 *
 * @author leoguapo-mt
 */
public class AreaAproximationTest {
    public static void main(String args[]) {
        AreaAproximation ap = new AreaAproximation(1, 3, 10);
        
        ap.computeArea();
        System.out.println(ap.getArea());
         
    }
}