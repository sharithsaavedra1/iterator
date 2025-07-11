
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

// Clase principal del programa
public class FrutasIterator {
    public static void main(String[] args) {

        // Creamos el objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Creamos una lista (ArrayList) para guardar las frutas ingresadas
        ArrayList<String> frutas = new ArrayList<>();

        // Preguntamos cuántas frutas se van a ingresar
        System.out.println("¿Cuántas frutas vas a ingresar?");
        int cantidad = scanner.nextInt();  // Leemos el número de cantidad
        scanner.nextLine();

        // Ciclo para ingresar cada fruta una por una
        for (int i = 0; i < cantidad; i++) {
            System.out.print("Ingresa una fruta: ");  // Pedimos la fruta
            String fruta = scanner.nextLine();        // Leemos la fruta
            frutas.add(fruta);                        // La agregamos a la lista
        }

        // Creamos un iterador para recorrer la lista de frutas
        Iterator<String> iterador = frutas.iterator();


        System.out.println("\nUsando hasNext() y next():");

        // Mientras el iterador tenga más elementos, entramos al ciclo
        while (iterador.hasNext()) {
            // Imprimimos si hay otra fruta (debe dar true en este punto)
            System.out.println("¿Hay otra fruta? " + iterador.hasNext());

            // Obtenemos la siguiente fruta y avanzamos el iterador
            String fruta = iterador.next();

            // Imprimimos la fruta obtenida
            System.out.println("- " + fruta);
        }

        // Al finalizar el recorrido, verificamos que ya no hay más frutas
        System.out.println("¿Hay otra fruta? " + iterador.hasNext());  // Debe mostrar false
    }
}
