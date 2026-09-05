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

    // 1. Verifica si el valor x se encuentra en el arreglo
    public int encontrarEnArreglo(int n, int[] arreglo, int indice) {
        // Si el indice es mayor o igual a la longitud del arreglo o ya se encontro el valor, se hace return
        if (indice >= arreglo.length) {
            return -1;
        } else if (arreglo[indice] == n) {
            return indice;
        } else {
            // Recursividad que revisa todos los indices del arreglo
            return encontrarEnArreglo(n, arreglo, indice + 1);
        }
    }

    // 2. Valor mas grande en un arreglo
    public int encontrarMaximo(int[] arreglo, int indice) {
        // Si indice es la longitud del arreglo - 1, se regresa el ultimo valor encontrado
        if (indice == arreglo.length - 1) {
            return arreglo[indice];
        }

        // Recursividad que busca el valor mas grande
        int maximoRestante = encontrarMaximo(arreglo, indice + 1);
        // Evalua cual numero es mayor, el del arreglo o la variable maximoRestante
        return Math.max(arreglo[indice], maximoRestante);
    }

    // 3. Indicar si c1 aparece inmediatamente antes de c2 en cad, al menos una vez
    public boolean apareceAntes(String cad, char c1, char c2, int indice) {
        // Si el indice es mayor o igual a la longitud de la cadena, ya se evaluo todo y regresa false
        if (indice >= cad.length() - 1) {
            return false;
        }
        // Si se cumple la condicion solicitada (c1 antes de c2), regresa true
        if (cad.charAt(indice) == c1 && cad.charAt(indice + 1) == c2) {
            return true;
        }
        // Recursividad para checar todos los indices
        return apareceAntes(cad, c1, c2, indice + 1);
    }

    // 4. Cantidad de orejas de conejo hay en el campo
    public int orejasDeConejo(int n) {
        if (n==0) {
            return n;
        } else {
            // Basicamente duplica la n
            return orejasDeConejo(n-1) + 2;
        }
    }

    // 5. Sumar digitos que haya en la cadena
    public int sumarDigitosEnCadena(String cad, int indice) {
        // Si el indice llega al final de la cadena, regresa 0 para acabar con la recursividad
        if (indice >= cad.length()) {
            return 0;
        }

        char caracterActual = cad.charAt(indice);
        int valor = 0;

        // Si el caracter actual de la cadena es un VALOR, se guarda
        if (Character.isDigit(caracterActual)) {
            valor = Character.getNumericValue(caracterActual);
        }

        // Recursividad que suma los valores encontrados
        return valor + sumarDigitosEnCadena(cad, indice + 1);
    }

}