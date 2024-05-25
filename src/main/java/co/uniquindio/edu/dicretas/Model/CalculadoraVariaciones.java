package co.uniquindio.edu.dicretas.Model;

public class CalculadoraVariaciones {

    private int n;
    private int k;


    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public int getK() {
        return k;
    }

    public void setK(int k) {
        this.k = k;
    }
    
    public long variaciones() {
        if (k > n) {
            return 0;
        }
        else{
            long nFactorial= permutaciones(n,n);
            long nMenosKFactorial = (permutaciones(n-k,n-k));
            long resultado = nFactorial/nMenosKFactorial;
            return resultado;
        }
    }

    private long permutaciones(int h,int j) {
        if (h != j) {
            return 0;
        }
        else if (h < 0) {
            throw new IllegalArgumentException("El número debe ser mayor o igual a 0.");
        }
        long resultado = 1;
        for (int i = h; i >= 1; i--) {
            resultado *= i;
        }
        return resultado;
    }
}
