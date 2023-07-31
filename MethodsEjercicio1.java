import java.util.Scanner;
public class MethodsEjercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre: ");
        String name = scanner.nextLine();

        System.out.println("Ingrese el apellido: ");
        String lastName = scanner.nextLine();

        printNameLength(name);
        printNameCharacters(name);
        printFullName(name, lastName);
    }

    private static void printNameLength(String name) {
        System.out.println("Longitud del nombre: " + name.length() + " caracteres.");
    }

    private static void printNameCharacters(String name) {
        System.out.println("Caracteres del nombre:");
        for (int i = 0; i < name.length(); i++) {
            System.out.println(name.charAt(i));
        }
    }

    private static void printFullName(String name, String lastName) {
        System.out.println("Nombre completo: " + name + " " + lastName);
    }
}
