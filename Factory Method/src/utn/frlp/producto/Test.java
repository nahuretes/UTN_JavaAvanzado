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
public class Test {
    public static void main(String[] args) {
        IProducto tangible = ProductoFactoria.getTangible();
        IProducto inTangible = ProductoFactoria.getIntangible();
        
        System.out.println(tangible.getCantidad());
        System.out.println(tangible.getPrecio());
        tangible.setNombre("Juan Pablo");
        System.out.println(tangible.getNombre());
        
        inTangible.setNombre("Nahuel");
        System.out.println(inTangible.getCantidad());
        System.out.println(inTangible.getPrecio());
        System.out.println(inTangible.getNombre());
        
        System.out.println(tangible.toString());
        System.out.println(inTangible.toString());
    }
}
