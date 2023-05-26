import java.util.Scanner;
public class MeryJane {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir edad al usuario
        System.out.print("Introduce tu edad: ");
        int edad = scanner.nextInt();

        // Comprobar si la edad está entre 18 y 66
        if (edad < 18 || edad > 65) {
            System.out.println("La edad DEBE estar entre 18 y 70 años.");
        } else {
            // Pedir DNI al usuario
            System.out.print("Introduce tu DNI (8 números y 1 letra): ");
            String dni = scanner.next();

            // Comprobar si el DNI cumple con el formato de 8 números y 1 letra
            if (!dni.matches("\\d{8}[A-Za-z]")) {
                System.out.println("El DNI debe tener 8 números y 1 letra.");
            } else {
                System.out.println("Edad y DNI válidos.");
            }
        }
    }
}

