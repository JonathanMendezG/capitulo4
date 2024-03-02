import java.util.Scanner;

/**
 * Clase main del proyecto capitulo4
 * @author Jonathan
 */
public class main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el número para la criba de Erastótenes:");
        int dato = teclado.nextInt();
        int[] vector = new int[dato];
        System.out.println("\nVector de primos hasta: " + dato);
        for (int i = 0; i < vector.length; i++) {
            if (i % 10 == 0) {
                System.out.println();
                System.out.println(i + 1 + "\t");
            }
        }
        vector = Criba.generarPrimos(dato);
        System.out.println("\nVector de primos hasta: " + dato);
        for (int i = 0; i < vector.length; i++) {
            if (i % 10 == 0) {
                System.out.println();
                System.out.println(i + 1 + "\t");
            }
        }
    }
}
