/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica9;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Administrador
 */
public class Lista {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Object>ejemplo=new ArrayList<>();
        ejemplo.add("Camilo chipagua");
        ejemplo.add(65);
        ejemplo.add(5.10);
        ejemplo.add('c');
        System.out.println(ejemplo);
        //Recorriendo mediante itirador;
        Iterator<Object>it =ejemplo.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
    
}
