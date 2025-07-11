import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class FrutasIterator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> frutas = new ArrayList<>();

        System.out.println("¿Cuántas frutas vas a ingresar?");
        int cantidad = scanner.nextInt();
        scanner.nextLine(); // Limpiar el salto de línea

        // Ingreso de frutas una por una
        for (int i = 0; i < cantidad; i++) {
            System.out.print("Ingresa una fruta: ");
            String fruta = scanner.nextLine();
            frutas.add(fruta);
        }

        Iterator<String> iterador = frutas.iterator();

        System.out.println("\nUsando hasNext() y next():");
        while (iterador.hasNext()) {
            System.out.println("¿Hay otra fruta? " + iterador.hasNext());  // true
            String fruta = iterador.next();  // avanza al siguiente
            System.out.println("- " + fruta);
        }

        System.out.println("¿Hay otra fruta? " + iterador.hasNext());  // false al final
    }
}
