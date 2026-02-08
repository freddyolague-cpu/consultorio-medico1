package com.consultorio;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArchivoUtil.verificarArchivos();

        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n=== SISTEMA CONSULTORIO MÉDICO ===");
            System.out.println("1. Crear paciente");
            System.out.println("2. Crear doctor");
            System.out.println("3. Crear cita");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    Paciente.crearPaciente(scanner);
                    break;
                case 2:
                    Doctor.crearDoctor(scanner);
                    break;
                case 3:
                    Cita.crearCita(scanner);
                    break;
                case 4:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }

        } while (opcion != 4);

        scanner.close();
    }
}