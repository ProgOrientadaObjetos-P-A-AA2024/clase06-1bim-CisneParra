/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete3;

import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class Venta {

    private double valorVenta;
    private ArrayList<Computador> computadoras;

    public Venta(ArrayList<Computador> cm) {
        computadoras = cm;
    }

    public void establecerComputadoras(ArrayList<Computador> cm) {
        computadoras = cm;
    }

    public void establecerValorVenta() {
        double suma = 0;
        for (int i = 0; i < computadoras.size(); i++) {
            suma = suma + computadoras.get(i).obtenerCostoC();
        }
        valorVenta = suma;
    }

    public double obtenerValorVenta() {
        return valorVenta;
    }

    public ArrayList<Computador> obtenerComputadoras() {
        return computadoras;
    }

    @Override
    public String toString() {
        String cadena = "Informe de ventas:\n-----------------------------\n";
        for (int i = 0; i < computadoras.size(); i++) {
            cadena = String.format("%s"
                    + "Marca del computador: %s\n"
                    + "Procesador: %s\n"
                    + "Memoria: %s\n"
                    + "Costo del computador: %.2f\n"
                    + "------------------------------------------\n", cadena,
                    computadoras.get(i).obtenerMarca(),
                    computadoras.get(i).obtenerProcesador().obtenerMarca(),
                    computadoras.get(i).obtenerMemoria().obtenerMarca(),
                    computadoras.get(i).obtenerCostoC());
        }
        cadena = String.format("%sValor total de las ventas: %.2f\n", cadena,
                obtenerValorVenta());
        return cadena;
    }

}
