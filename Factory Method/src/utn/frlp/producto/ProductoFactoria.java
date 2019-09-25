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
public class ProductoFactoria {
    public static IProducto getTangible() {
        return new Tangible(5,10);
    }
    
    public static IProducto getIntangible(){
        return new Intangible(5,10);
    }
    
}
