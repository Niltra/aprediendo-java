/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author david
 */
public class ClaseAbstracta{
  public static void main(String[] args) {
      
     // FiguraGeometrica figura= new FiguraGeometrica();  //no se puede instanciar una clase abstracta
      FiguraGeometrica figura= new Rectangulo(); //se instancia a la clase hija
      
      figura.dibujar();
      
      FiguraGeometrica figura2=new Circulo();
      figura2.dibujar(); 
  }
}

//clase abstracta
public abstract class FiguraGeometrica { //clase abstracta
    public abstract void dibujar(); //metodo abstracto
}

class Rectangulo extends FiguraGeometrica{  //al ser hija debe implementar metodos abstractos

    @Override
    public void dibujar() {
        System.out.println("Se debe dibujar un rectangulo");
        
    }
    
}

class Circulo extends FiguraGeometrica{

    @Override
    public void dibujar() {
        System.out.println("Se debe dibujar un circulo");
    }
    
}
