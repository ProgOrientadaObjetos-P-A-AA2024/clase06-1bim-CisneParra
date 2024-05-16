/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete3;

/**
 *
 * @author reroes
 */
public class Computador {

    private String marca;
    private Procesador procesador;
    private Memoria memoria;
    private double costoComputador;

    public Computador(String m, Procesador p, Memoria mm) {
        marca = m;
        procesador = p;
        memoria = mm;
    }

    public void establecerMarca(String m) {
        marca = m;
    }

    public void establecerCostoC() {
        costoComputador = (obtenerMemoria().obtenerCosto())
                + (obtenerProcesador().obtenerCosto());
    }

    public void establecerProcesador(Procesador p) {
        procesador = p;
    }

    public void establecerMemoria(Memoria m) {
        memoria = m;
    }

    public double obtenerCostoC() {
        return costoComputador;
    }

    public Procesador obtenerProcesador() {
        return procesador;
    }

    public Memoria obtenerMemoria() {
        return memoria;
    }

    public String obtenerMarca() {
        return marca;
    }
}
