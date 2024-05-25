package co.uniquindio.edu.dicretas.Model;

public class Calculadora {
    
    public static long permutaciones(int n, int k) {
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

    public static long variaciones(int n, int k) {
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

    public static long combinaciones(int n, int k) {
        if (k > n) {
            return 0;
        }
        long nFactorial= permutaciones(n,n);
        long nMenosKFactorial = (permutaciones(n-k,n-k));
        long kFactorial = permutaciones(k, k);
        long kFactorialPorNMenosKFactorial = kFactorial*nMenosKFactorial;
        long resultado = (nFactorial/kFactorialPorNMenosKFactorial);
        return resultado;
    }
}
