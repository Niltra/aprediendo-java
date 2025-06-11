/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

/**
 *
 * @author david
 */
public interface Traductor {
    //public y abstract
    
    void traducir(); //las clases hijas deben implementar el comportamiento de este metodo
    
    
    
    //Metodos con implementacion por default
    default void iniciarTraductor(){ //las clases ya no estan obligadas a este implementacion
        System.out.println("Iniciando traductos...");
    }
}
class Ingles implements Traductor{

    @Override
    public void traducir() {
        System.out.println("Traduzco a ingles");

    }
    
}

