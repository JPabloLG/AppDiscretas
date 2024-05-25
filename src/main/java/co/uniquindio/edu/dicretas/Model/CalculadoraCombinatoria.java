package co.uniquindio.edu.dicretas.Model;

public class CalculadoraCombinatoria {

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

    public long combinaciones() {
        if (k > n) {
            return 0;
        }
        long nFactorial= permutaciones(n);
        long nMenosKFactorial = (permutaciones(n-k));
        long kFactorial = permutaciones(k);
        long kFactorialPorNMenosKFactorial = kFactorial*nMenosKFactorial;
        long resultado = (nFactorial/kFactorialPorNMenosKFactorial);
        return resultado;
    }

    private long permutaciones(int h) {

        if (h < 0) {
            throw new IllegalArgumentException("El número debe ser mayor o igual a 0.");
        }
        long resultado = 1;
        for (int i = h; i >= 1; i--) {
            resultado *= i;
        }
        return resultado;
    }
    @Override
    public String toString() {
        return "La combinatoria con n = " + n + " y  k = " + k + ", da como resultado = " + combinaciones();
    }
    
}
