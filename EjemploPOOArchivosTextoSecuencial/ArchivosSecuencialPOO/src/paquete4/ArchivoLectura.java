/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete4;

import paquete4.Empresa;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import paquete1.Profesor;

public class ArchivoLectura {

    private Scanner entrada;
    private String nombreArchivo;
    private String rutaArchivo;
    private ArrayList<Empresa> lista;

    public ArchivoLectura(String n) {
        nombreArchivo = n;
        rutaArchivo = String.format("data/%s", nombreArchivo);

        try {
            entrada = new Scanner(new File(rutaArchivo));
            // entrada = new Scanner(System.in);
            // entrada = new Scanner(f);
        } // fin de try
        catch (FileNotFoundException e) {
            System.err.println("Error al leer del archivo: " + e);

        } // fin de catch

    }

    public void establecerNombreArchivo(String n) {
        nombreArchivo = n;
    }

    public void establecerRutaArchivo() {
        rutaArchivo = String.format("data/%s.txt",
                obtenerNombreArchivo());
    }

    public String obtenerNombreArchivo() {
        return nombreArchivo;
    }

    public String obtenerRutaArchivo() {
        return rutaArchivo;
    }

    // establecer valores de cada línea
    // en la lista de tipo Profesor
    public void establecerLista() {
        lista = new ArrayList<>();
        File f = new File(rutaArchivo);

        if (f.exists()) {

            while (entrada.hasNext()) {
                String linea = entrada.nextLine(); // Tara Hernandez;contratado

                ArrayList<String> linea_partes = new ArrayList<>(
                        Arrays.asList(linea.split(";")) // ["Tara Hernandez", "contratado"]
                );
                Empresa p = new Empresa (linea_partes.get(0), // Tara Hernandez
                        linea_partes.get(1) // contratado
                );
                lista.add(p);

            } // fin de while
        }
    }

    public ArrayList<Empresa> obtenerLista() {

        return lista;
    }

    public void cerrarArchivo() {
        if (entrada != null) {
            entrada.close();
        } // cierra el archivo

    }

    @Override
    public String toString() {
        String cadena = "Lista Ciudades\n";
        for (int i = 0; i < obtenerLista().size(); i++) {
            Empresa pr = obtenerLista().get(i); // Obj. Profesor
            cadena = String.format("%s %s %s\n", cadena,
                    pr.obtenerNombre(), // obtenerLista().get(i).obtenerNombre(),
                    pr.obtenerCiudad());    // obtenerLista().get(i).obtenerTipo());
        }
        return cadena;
    }
}
