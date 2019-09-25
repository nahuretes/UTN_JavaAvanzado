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
public interface IProducto {
    void setCantidad(int cantidad);
    void setPrecio(double precio);
    int getCantidad();
    double getPrecio();
    void setNombre(String nombre);
    String getNombre();
}
