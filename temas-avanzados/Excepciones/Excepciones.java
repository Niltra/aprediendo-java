/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author navas
 */
public class Excepciones {
    public static void main (String[] args){
        
      int valor1=10, valor2= 0;
      try{
      var resultado=valor1/valor2;  //division entre 0
        System.out.println(resultado);}
      catch(Exception e){
          System.out.println("Ocurrio un error: "+e);
      }
    }
}
