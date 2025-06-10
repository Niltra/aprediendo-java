/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistema_ventas;

/**
 *
 * @author navas
 */
public class Producto {
    
    private final int idProducto; //id del producto, es final para que la id no sea modificable
    private String nombre; //nombre del producto
    private double precio; //precio del producto
    private static int contadorProductos; //contador poara saber el numero de productos
    
    
    public Producto(String nombre, double precio){
        this.idProducto=++Producto.contadorProductos; //le asignamos una valor a la id Productos que va sumando a medida que creamos con el constructor
        this.nombre=nombre; 
        this.precio=precio;
    }

    
    //metodos get y set para cada atributo menos el set en  id producto ya que no es modificable
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public static int getContadorProductos() {
        return contadorProductos;
    }

    public static void setContadorProductos(int contadorProductos) {
        Producto.contadorProductos = contadorProductos;
    }
    
    public int getIdProducto(){
        return this.idProducto;
    }
    
    //metodo toString()

    @Override
    public String toString() {
        return "Producto{" + "idProducto=" + this.idProducto + ", nombre=" + this.nombre + ", precio=" + this.precio + '}';
    }
    
    
}
