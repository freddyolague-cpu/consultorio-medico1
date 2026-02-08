package com.consultorio;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Doctor {

    public static void crearDoctor(Scanner scanner) {
        try {
            System.out.print("Nombre del doctor: ");
            String nombre = scanner.nextLine();

            System.out.print("Especialidad: ");
            String especialidad = scanner.nextLine();

            FileWriter writer = new FileWriter("db/doctores.txt", true);
            writer.write(nombre + "," + especialidad + "\n");
            writer.close();

            System.out.println("Doctor guardado correctamente.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}