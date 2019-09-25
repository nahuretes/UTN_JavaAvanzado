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
public class Intangible implements IProducto {

    private String nombre;
    private double precio;
    private int cantidad;

    public Intangible(double precio, int cantidad) {
        this.precio = precio;
        this.cantidad = cantidad;
    }
    
    public Intangible(){
        super();
    }

    @Override
    public String toString() {
        return "Intangible{" + "nombre=" + nombre + ", precio=" + precio + ", cantidad=" + cantidad + '}';
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
