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
public class Producto {
    private String nombre;
    private double precioKG;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecioKG(double precio) {
        this.precioKG = precio;
    }
    
    public double getPrecio(UnidadDeMedida medida) throws InvalidUnit{
        switch (medida) {
            case KG:
                return precioKG;
            case G:
                return precioKG/1000;
            default:
                throw new InvalidUnit();
        }
    }
}
