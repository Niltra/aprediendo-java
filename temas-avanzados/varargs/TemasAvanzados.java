/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package temasavanzados;

/**
 *
 * @author navas
 */
public class TemasAvanzados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    // imprimirNumeros(1,2,3,4,5); //varargs
        
        variosParametros("Karla", 10,20,30);
        
        
    }

  static void imprimirNumeros(int...numeros) { //crea un array que va generando dinamicamente segun los parametros que metamos, sin tener que definirlos todos
      
      for (int i=0;i<numeros.length;i++){
          System.out.println(numeros[i]+" ");
      }
    }

    private static void variosParametros(String nombre, int...numeros) {
        
        System.out.println(nombre);
        System.out.println(" ");
        imprimirNumeros(numeros);
    }
    
}
