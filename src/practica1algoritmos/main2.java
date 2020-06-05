/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1algoritmos;

import misClases.Turtle;
import misClases.World;

/**
 *
 * @author ubuntu
 */
public class main2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        World mundo2=new World(400,400);
        Turtle tortuga2=new Turtle(mundo2);
        
        
        for (int i = 0; i < 10; i++) {
            tortuga2.moveTo(i, i);
        }
    }
}
