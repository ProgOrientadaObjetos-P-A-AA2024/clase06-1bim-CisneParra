/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete3;

import java.util.ArrayList;
import java.util.Scanner;
import paquete2.Calificacion;

/**
 *
 * @author utpl
 */
public class Ejecutor {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String marcaCm, marcaPr, marcaMm;
        double costoPr, costoM;
        Memoria mem;
        Procesador p;
        int num;
        ArrayList<Computador> computadoras = new ArrayList<>();
        System.out.println("Ingrese el número de computadoras a comprar");
        num = entrada.nextInt();

        entrada.nextLine();
        for (int i = 0; i < num; i++) {
            System.out.printf("Ingrese marca del computador #%d\n", i + 1);
            marcaCm = entrada.nextLine();
            System.out.printf("Ingrese marca de la memoria #%d\n", i + 1);
            marcaMm = entrada.nextLine();
            System.out.printf("Ingrese costo de la memoria #%d\n", i + 1);
            costoM = entrada.nextDouble();
            entrada.nextLine();
            mem = new Memoria(marcaMm, costoM);
            System.out.printf("Ingrese marca del procesador #%d\n", i + 1);
            marcaPr = entrada.nextLine();
            System.out.printf("Ingrese costo del procesador #%d\n", i + 1);
            costoPr = entrada.nextDouble();
            entrada.nextLine();
            p = new Procesador(marcaPr, costoPr);
            Computador comp = new Computador(marcaCm, p, mem);
            comp.establecerCostoC();
            computadoras.add(comp);
        }
        Venta ventas = new Venta(computadoras);
        ventas.establecerValorVenta();
        System.out.printf("%s", ventas);
        System.out.printf("Numero de computadores vendidos: %d\n", num);
    }
}
