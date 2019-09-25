/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utn.java.tarifador;

/**
 *
 * @author juan.pablo.tyrlik
 */
public class Test {
    public static void main(String[] args) {
        Producto prod = new Producto();
        prod.setNombre("Morcilla");
        prod.setPrecioKG(75);
        Tarifador tarifador = new Tarifador(prod);
        System.out.println(tarifador.calcularTarifa(UnidadDeMedida.KG, 50, 0.6));
        System.out.println(tarifador.calcularTarifa(UnidadDeMedida.KG, 10, 0.4));
        System.out.println(tarifador.calcularTarifa(UnidadDeMedida.KG, 1, 0.1));
        System.out.println(tarifador.calcularTarifa(UnidadDeMedida.KG, 5, 1));
        System.out.println(tarifador.calcularTarifa(UnidadDeMedida.G, 50, 1));
        System.out.println(tarifador.calcularTarifa(UnidadDeMedida.G, 50, 1));
        
    }
}
