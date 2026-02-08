package com.consultorio;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Cita {

    public static void crearCita(Scanner scanner) {
        try {
            System.out.print("Nombre del paciente: ");
            String paciente = scanner.nextLine();

            System.out.print("Nombre del doctor: ");
            String doctor = scanner.nextLine();

            System.out.print("Fecha (dd/mm/aaaa): ");
            String fecha = scanner.nextLine();

            FileWriter writer = new FileWriter("db/citas.txt", true);
            writer.write(paciente + "," + doctor + "," + fecha + "\n");
            writer.close();

            System.out.println("Cita guardada correctamente.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}