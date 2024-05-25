package co.uniquindio.edu.dicretas.Model;

public class CalculadoraPermutacion {

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

    public long permutaciones() {
        if (n != k) {
            return 0;
        }
        else if (n < 0) {
            throw new IllegalArgumentException("El número debe ser mayor o igual a 0.");
        }
        long resultado = 1;
        for (int i = n; i >= 1; i--) {
            resultado *= i;
        }
        return resultado;
    }

    @Override
    public String toString() {
        return "La permutación con n = " + n + " y  k = " + k + ", da como resultado = " + permutaciones();
    }
   
}
