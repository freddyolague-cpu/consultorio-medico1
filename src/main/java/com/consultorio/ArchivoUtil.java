package com.consultorio;

import java.io.File;
import java.io.IOException;

public class ArchivoUtil {

    public static void verificarArchivos() {
        crearArchivo("db/pacientes.txt");
        crearArchivo("db/doctores.txt");
        crearArchivo("db/citas.txt");
    }

    private static void crearArchivo(String ruta) {
        try {
            File file = new File(ruta);
            file.getParentFile().mkdirs();

            if (!file.exists()) {
                file.createNewFile();
                System.out.println("Archivo creado: " + ruta);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
