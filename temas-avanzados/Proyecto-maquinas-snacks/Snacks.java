/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package maquinasnacks;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author navas
 */
public class Snacks {
    private static final List<Snack> snacks;
    
    //Bloque static inicializador
    
    static{
        snacks = new ArrayList<>();
        snacks.add(new Snack("Patatas",70));
        snacks.add(new Snack("Refresco",50));
        snacks.add(new Snack("Sandwich",120));
    }
    public static void agregarSnack(Snack snack){
        snacks.add(snack);
    }
    
    public static void mostrarSnacks(){
        var inventarioSnacks=""; //inicializamos vacio
        for(var snack: snacks){
            inventarioSnacks +=snack.toString()+ " ";
           
        }
         System.out.println("---Snacks en el Inventario----");
            System.out.println(inventarioSnacks);
    }
    
    public static List<Snack> getSnacks(){
        return snacks;
    }
}
