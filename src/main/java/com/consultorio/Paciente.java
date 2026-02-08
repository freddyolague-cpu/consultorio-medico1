package com.consultorio;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Paciente {

    public static void crearPaciente(Scanner scanner) {
        try {
            System.out.print("Nombre del paciente: ");
            String nombre = scanner.nextLine();

            System.out.print("Edad: ");
            int edad = scanner.nextInt();
            scanner.nextLine();

            FileWriter writer = new FileWriter("db/pacientes.txt", true);
            writer.write(nombre + "," + edad + "\n");
            writer.close();

            System.out.println("Paciente guardado correctamente.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
