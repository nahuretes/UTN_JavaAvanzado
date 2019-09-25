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
public class Tarifador {

    private Producto producto;

    public Tarifador(Producto producto) {
        this.producto = producto;
    }
    
    public double calcularTarifa(UnidadDeMedida unidad, int cantidad, double fraccionamiento) {
        try {
            //En este caso interpreté que el fraccionamiento es una medida como por ejemplo 0.6, en caso de no ser así, deberia corregirse la cuenta.
            return producto.getPrecio(unidad)*cantidad*fraccionamiento;
        } catch (InvalidUnit e) {
            System.out.println("Ingrese una unidad de medida valida (G, KG)");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return 0;
    }
}
