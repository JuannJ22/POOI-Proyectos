package co.edu.uniquindio;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Estudiante estudiante1 = almacenarEstudiante();
    }
    public static Estudiante almacenarEstudiante() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese los nombres: ");
        String nombres = scanner.nextLine();
        System.out.print("Ingrese los apellidos: ");
        String apellidos = scanner.nextLine();
        System.out.print("Ingrese el documento de Identiadad: ");
        String numeroIdentificacion = scanner.nextLine();
        System.out.print("Ingrese el correo: ");
        String correo = scanner.nextLine();
        System.out.print("Ingrese el teléfono: ");
        String telefono = scanner.nextLine();
        System.out.print("Ingrese la edad: ");
        int edad = scanner.nextInt();
        scanner.close();

        return new Estudiante(nombres, apellidos, numeroIdentificacion, correo, telefono, edad);
    }
}
