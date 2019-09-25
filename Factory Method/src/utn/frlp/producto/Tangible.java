/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utn.frlp.producto;

/**
 *
 * @author juan.pablo.tyrlik
 */
public class Tangible implements IProducto{

    private String nombre;
    private double precio;
    private int cantidad;

    public Tangible(double precio, int cantidad) {
        this.precio = precio;
        this.cantidad = cantidad;
    }
    
    public Tangible() {
        super();
    }

    @Override
    public String toString() {
        return "Tangible{" + "nombre=" + nombre + ", precio=" + precio + ", cantidad=" + cantidad + '}';
    }
    
    public void setCantidad(int cant) {
        this.cantidad = cant;
    }
    
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    @Override
    public int getCantidad() {
        return cantidad;
    }

    @Override
    public double getPrecio() {
        return precio;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String getNombre() {
        return nombre;
    }
    
}
