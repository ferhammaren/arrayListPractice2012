/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.util.Random;
import java.util.ArrayList;
import misClases.Linea;
import misClases.Turtle;
import misClases.World;


/**
 *
 * @author lfmeza
 */
public class UserInteraction {
        private static final World mundo2=new World(400,400);
        Turtle tortuga2=new Turtle(mundo2);    
        private int numero1;
        private ArrayList<Linea> coordenadas = new ArrayList<Linea>();
        private ArrayList<Linea> coordenadasEspecificas = new ArrayList<Linea>();
        public UserInteraction(){
          for (int i = 0; i < 10; i++) {
            tortuga2.moveTo(i, i);
          }
        }
        
        public void option1(){
       
        Random randomGenerator = new Random();
       
        numero1 = randomGenerator.nextInt(20);

        if (numero1 < 10) {
            numero1 = numero1 + 10;
        }
        System.out.println(numero1);
        for (int j = 0; j < numero1; j++) {
            int colorRandom = randomGenerator.nextInt(10);
            coordenadas.add(j, new Linea(0, 0, colorRandom));
            coordenadas.get(j).coordenadasAleatorias(mundo2.getWidth(), mundo2.getHeight());
        }
        Turtle tortuga = new Turtle(coordenadas.get(0).getInitialX(), coordenadas.get(0).getInitialY(), mundo2);
        for (int f = 0; f < numero1; f++) {
            tortuga.setPenColor(coordenadas.get(f).getColor());
            tortuga.setPenWidth(3);
            if (f != 0) {
                tortuga.penUp();
                tortuga.moveTo(coordenadas.get(f - 1).getFinalX(), coordenadas.get(f - 1).getFinalY());
                tortuga.penDown();
            }
            tortuga.moveTo(coordenadas.get(f).getFinalX(), coordenadas.get(f).getFinalY());
            if (f == (numero1 - 1)) {
                tortuga.moveTo(0, 0);
            }
        }
    }
        public void figure2(int numero2){
            Random randomGenerator = new Random();
            
            for (int i = 0; i < numero2; i++) {
                for (int j = 0; j < numero2; j++) {
                    coordenadasEspecificas.add(j, new Linea(0, 0, 1));
                    coordenadasEspecificas.get(j).coordenadasAleatorias(mundo2.getWidth(), mundo2.getHeight());
                }

            }
            Turtle tortuga2 = new Turtle(coordenadasEspecificas.get(0).getInitialX(), coordenadasEspecificas.get(0).getInitialY(), mundo2);
            for (int h = 0; h < numero2; h++) {
                int colorRandom = randomGenerator.nextInt(10);
                tortuga2.setPenColor(coordenadasEspecificas.get(h).setColor(colorRandom));
                tortuga2.setPenWidth(3);
                if (h != 0) {
                    tortuga2.penUp();
                    tortuga2.moveTo(coordenadasEspecificas.get(h - 1).getFinalX(), coordenadasEspecificas.get(h - 1).getFinalY());
                    tortuga2.penDown();
                }
                tortuga2.moveTo(coordenadasEspecificas.get(h).getFinalX(), coordenadasEspecificas.get(h).getFinalY());
                if (h == (numero2 - 1)) {
                    tortuga2.moveTo(0, 0);
                }
            }
        }
        
        public void drawFigures(){
            Random randomGenerator = new Random();
            for (int h = 0; h < numero1; h++) {
                int colorRandom = randomGenerator.nextInt(10);
                Turtle tortugaRedibujar2 = new Turtle(coordenadasEspecificas.get(0).getInitialX(), coordenadasEspecificas.get(0).getInitialY(), mundo2);
                tortugaRedibujar2.setPenColor(coordenadasEspecificas.get(h).setColor(colorRandom));
                tortugaRedibujar2.moveTo(coordenadasEspecificas.get(h).getFinalX(), coordenadasEspecificas.get(h).getFinalY());
                if (h == numero1) {
                    tortugaRedibujar2.moveTo(coordenadasEspecificas.get(0).getInitialX(), coordenadasEspecificas.get(0).getInitialY());
                }
            }

        }
}
