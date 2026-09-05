public class Main {

    public static void main(String[] args) {

        // Creamos un objeto de la clase Recursividad para poder usar sus métodos
        Recursividad r = new Recursividad();

        // 1. Serie de N a 0
        System.out.println("1. Serie N a 0:");
        System.out.println(r.serieN0(5));                    // Debe imprimir: 5 4 3 2 1 0

        // 2. Serie de 0 a N
        System.out.println("\n2. Serie 0 a N:");
        System.out.println(r.serie0N(5));                    // Debe imprimir: 0 1 2 3 4 5

        // 3. Multiplicación usando sumas sucesivas
        System.out.println("\n3. Multiplicación:");
        System.out.println(r.calculoMultiplicacion(5, 5));   // Debe imprimir: 25

        // 4. Serie de Fibonacci
        System.out.println("\n4. Fibonacci (7 términos):");
        System.out.println(r.serieFibonacci(7));             // Debe imprimir: 0 1 1 2 3 5 8

        // 5. Verificar si un número es primo
        System.out.println("\n5. ¿Es primo 7?");
        System.out.println(r.esPrimo(7));                    // Debe imprimir: true

        // Arreglo de prueba para los siguientes métodos
        int[] arr = {4, 8, 15, 16, 23, 42};

        System.out.println("\n----- Segunda seccion -----");

        // 1. Verifica si el valor x se encuentra en el arreglo
        System.out.println("\n1. Se encuentra 23? en que posicion?");
        System.out.println(r.encontrarEnArreglo(23,arr,0));

        // 4. Cantidad de orejas de conejo hay en el campo
        System.out.println("4. Orejas de conejo en un campo de 32 conejos:");
        System.out.println(r.orejasDeConejo(32));
    }
}