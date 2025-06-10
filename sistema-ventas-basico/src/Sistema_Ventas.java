/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistema_ventas;

/**
 *
 * @author navas
 */
public class Sistema_Ventas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("*** Sistema de Ventas ***"); //titulo
        
        var producto1=new Producto("Blusa", 30.00);
 
        var producto2= new Producto("Zapatos",50.00);
       
        var orden1=new Orden();
        orden1.agregarProducto(producto1);
        orden1.agregarProducto(producto2);
        orden1.mostrarOrden();
    }
    
}
