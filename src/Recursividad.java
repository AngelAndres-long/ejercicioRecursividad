public class Recursividad {

    // 1. Regresa una cadena con los números desde n hasta 0
    public String serieN0(int n) {
        // Caso base: cuando llegamos a 0, regresamos "0"
        if (n == 0) {
            return "0";
        }

        // Caso recursivo: ponemos el número actual y seguimos con el siguiente
        return n + " " + serieN0(n - 1);
    }

    // 2. Regresa una cadena con los números desde 0 hasta n
    public String serie0N(int n) {
        // Caso base
        if (n == 0) {
            return "0";
        }

        // Caso recursivo: primero la serie y al final el número actual
        return serie0N(n - 1) + " " + n;
    }

    // 3. Multiplica dos números usando sumas sucesivas
    public int calculoMultiplicacion(int a, int b) {
        // Caso base
        if (b == 0) {
            return 0;
        }

        // Caso recursivo
        return a + calculoMultiplicacion(a, b - 1);
    }

    // 4. Regresa los primeros n números de la serie de Fibonacci
    public String serieFibonacci(int n) {
        // Caso base
        if (n == 0) {
            return "";
        }

        if (n == 1) {
            return "0";
        }

        // Caso recursivo: formamos la cadena y agregamos el siguiente número
        return serieFibonacci(n - 1) + " " + fibonacci(n - 1);
    }

    // Método recursivo que calcula un número de Fibonacci
    private int fibonacci(int n) {
        // Casos base
        if (n == 0) {
            return 0;
        }

        if (n == 1) {
            return 1;
        }

        // Caso recursivo
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    // 5. Verifica si un número es primo
    public boolean esPrimo(int numero) {
        return esPrimoAux(numero, 2);
    }

    // Método auxiliar para buscar divisores
    private boolean esPrimoAux(int numero, int divisor) {
        // Caso base: números menores o iguales a 1 no son primos
        if (numero <= 1) {
            return false;
        }

        // Caso base: ya no hay divisores posibles
        if (divisor * divisor > numero) {
            return true;
        }

        // Caso base: encontramos un divisor
        if (numero % divisor == 0) {
            return false;
        }

        // Caso recursivo: probar el siguiente divisor
        return esPrimoAux(numero, divisor + 1);
    }

}