/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1algoritmos;

import java.awt.Color;

import java.util.Random;
import javax.swing.JOptionPane;
import misClases.Linea;
import misClases.World;
import misClases.Turtle;

/**
 *
 * @author Ferhammaren
 */
public class Practica1Algoritmos {

   public static void main(String[] args) {
//      Object[] botones = {"Puntos Aleatorios", "Puntos especìficos", "Dibujar Figura", "Terminar",};
//       World mundo = new World(400, 400);
//     
//     ArrayList<Linea> coordenadasEspecificas = new ArrayList<Linea>();
//        
//
//      Color color = null;
//
//      boolean menu = true;
//    int numero2 = 0;
//      int numeroX = 0;
//
//     do {
//          int opcion = JOptionPane.showOptionDialog(null, "¿Què quieres hacer?", "Practica 1", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, botones, botones[0]);
//         switch (opcion) {//poner mensajes de lo que hace el programa!
//               case 0:
//                JOptionPane.showMessageDialog(null, "Se generará una figura de 10 a 20 puntos", "Mensaje",
//                      JOptionPane.INFORMATION_MESSAGE);
//                
//             break;
//
//           case 1:
//
//                    JOptionPane.showMessageDialog(null, "De cuantos puntos quieres la figura", "Mensaje",
//                            JOptionPane.INFORMATION_MESSAGE);
//                    String numero = JOptionPane.showInputDialog("Ingresa un numero del 10 al 20");
//                    numero2 = Integer.parseInt(numero);
//                   if (numero2 < 10 || numero2 > 20) {
//                       JOptionPane.showMessageDialog(null, "Debe ser un numero del 10 al 20", "Mensaje",
//                                JOptionPane.INFORMATION_MESSAGE);
//                   }
//
//                    for (int i = 0; i < numero2; i++) {
//                        for (int j = 0; j < numero2; j++) {
//                        coordenadasEspecificas.add(j, new Linea(0, 0, 1));
//                           coordenadasEspecificas.get(j).coordenadasAleatorias(mundo.getWidth(), mundo.getHeight());
//                   }
//
//               }
//               Turtle tortuga2 = new Turtle(coordenadasEspecificas.get(0).getInitialX(), coordenadasEspecificas.get(0).getInitialY(), mundo);
//               for (int h = 0; h < numero2; h++) {
//                 int colorRandom = randomGenerator.nextInt(10);
//                 tortuga2.setPenColor(coordenadasEspecificas.get(h).setColor(colorRandom));
//                  tortuga2.setPenWidth(3);
//                  if (h != 0) {
//                     tortuga2.penUp();
//                       tortuga2.moveTo(coordenadasEspecificas.get(h - 1).getFinalX(), coordenadasEspecificas.get(h - 1).getFinalY());
//                    tortuga2.penDown();
//                  }
//                   tortuga2.moveTo(coordenadasEspecificas.get(h).getFinalX(), coordenadasEspecificas.get(h).getFinalY());
//                 if (h == (numero2 - 1)) {
//                         tortuga2.moveTo(0, 0);
//                      }
//                   }
//                 break;
//
//          case 2: //dibujar
//                 Object[] figuras = {"Figura 1", "Figura 2"};
//                    int fig = JOptionPane.showOptionDialog(null, "Selecciona la figura a dibujar",
//                          " ", JOptionPane.DEFAULT_OPTION,
//                         JOptionPane.QUESTION_MESSAGE, null, figuras, figuras[0]);
//                    switch (fig) {
//                     case 0:
//                           if (coordenadas.isEmpty()) {
//                             JOptionPane.showMessageDialog(null, "No hay coordenadas ", "ERROR",
//                                      JOptionPane.INFORMATION_MESSAGE);
//                        } else {
//
//                               Turtle tortuga1 = new Turtle(coordenadas.get(0).getInitialX(), coordenadas.get(0).getInitialY(), mundo);
//                              for (int h = 1; h < numero1; h++) {
//                                    tortuga1.setPenColor(coordenadas.get(h).getColor());
//                                   tortuga1.setPenWidth(3);
//                                    tortuga1.moveTo(coordenadas.get(h).getFinalX(), coordenadas.get(h).getFinalY());
//                                   if (h < numero1 - 1) {
//                                       tortuga1.moveTo(coordenadas.get(0).getInitialX(), coordenadas.get(0).getInitialY());
//                                  }
//
//                              }
//                           }
//                           break;
//
//                      case 1:
//                         if (coordenadasEspecificas.isEmpty()) {
//                             JOptionPane.showMessageDialog(null, "No hay coordenadas ", "ERROR",
//                                      JOptionPane.INFORMATION_MESSAGE);
//                           } else {
//                              for (int h = 0; h < numero1; h++) {
//                                 int colorRandom = randomGenerator.nextInt(10);
//                                  Turtle tortugaRedibujar2 = new Turtle(coordenadasEspecificas.get(0).getInitialX(), coordenadasEspecificas.get(0).getInitialY(), mundo);
//                                  tortugaRedibujar2.setPenColor(coordenadasEspecificas.get(h).setColor(colorRandom));
//                                tortugaRedibujar2.moveTo(coordenadasEspecificas.get(h).getFinalX(), coordenadasEspecificas.get(h).getFinalY());
//                                   if (h == numero1) {
//                                       tortugaRedibujar2.moveTo(coordenadasEspecificas.get(0).getInitialX(), coordenadasEspecificas.get(0).getInitialY());
//                                   }
//                               }
//                            }
//                          break;
//                    }
//                  break;
//
//               case 3:
//                  int yesNoResponse = JOptionPane.showConfirmDialog(null, "Estas seguro de que quieres salir del programa?", "Si o No",
//                          JOptionPane.YES_NO_OPTION);
//                if (yesNoResponse == JOptionPane.YES_OPTION) {
//                     menu = false;
//                  } else {
//                      menu = true;
//                   }
//                 break;
//         }
//       } while (menu == true);
//       JOptionPane.showMessageDialog(null, "Gracias por usar el programa", "Mensaje",
//             JOptionPane.INFORMATION_MESSAGE);
    }
}
