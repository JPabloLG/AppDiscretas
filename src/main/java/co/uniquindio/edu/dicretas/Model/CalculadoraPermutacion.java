package co.uniquindio.edu.dicretas.Model;

public class CalculadoraPermutacion {

    private int n;


    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public long permutaciones() {
        if (n < 0) {
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
        return "La permutación de n = " + n + " , da como resultado = " + permutaciones();
    }
   
}
