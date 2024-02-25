package ci.u1series;

public class serie {
    private int iIni;
    private int iEnd;
    private int n;
    private int i[];
    private int f[];
    private int suma;

    public serie(int iIni, int iEnd) {
        this.iIni = iIni;
        this.iEnd = iEnd;
        
        n = iEnd - iIni + 1;
        i = new int[n];
        f = new int[n];
    }
    
    public void compute() {
        int index = 0;
        suma = 0;
        for (int i = iIni; i <= iEnd; i++) {
            this.i[index] = i;
            f[index] = 2*i*i - 2*i;
            suma += f[index];
            index++;
        }
    }
    
    public void print() {
        System.out.println("index  |   i   |   f");
        for (int index = 0; index < n; index++) {
            System.out.println(index + "   |   " + i[index] + "   | " + f[index]);
        }
        System.out.println("suma: " + suma);
    }
}