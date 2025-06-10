/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistema_ventas;

/**
 *
 * @author navas
 */
public class Orden {
    private final int idOrden; //id no modificable en cada orden
    private Producto [] productos;
    private int contadorProductos;
    private static final int MAX_PRODUCTOS=10; //ponemos el limite de los elementos que puede contener el array de productos
    private static int contadorOrdenes;
    
    public Orden(){  
    //constructor para inicializar el pedido, generamos la id y creamos el array con el maximo permitido
        this.idOrden=++Orden.contadorOrdenes;
        this.productos=new Producto[Orden.MAX_PRODUCTOS];
    }
    
    public void agregarProducto(Producto producto){
        if(this.contadorProductos<Orden.MAX_PRODUCTOS){ //comprobante de si se pasa del maximo permitido o no
        this.productos[this.contadorProductos++]=producto;
        }
        else{
            System.out.println("Se ha superado el máximo de productos: "+ Orden.MAX_PRODUCTOS);
        }
    }
    
    public double calcularTotal(){
        double total=0;
        for(var i=0; i<this.contadorProductos;i++){ //un for para iterar todos los productos, el contador productos nos servira para saber la cantidad exacta
            var producto= this.productos[i];
          total+=producto.getPrecio(); //total=total+precioproducto
        }
        return total;
    }
    
    public void mostrarOrden(){
        System.out.println("Id Orden: " +this.idOrden);
       
        var totalOrden =this.calcularTotal();
        System.out.println("Total de la orden: "+totalOrden+ "euros");
        System.out.println("Productos de la orden: ");
        for (var i=0; i<this.contadorProductos; i++){
            System.out.println(" "+this.productos[i]);
        }
    }
}
