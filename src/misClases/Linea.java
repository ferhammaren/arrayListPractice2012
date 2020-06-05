package misClases;

import java.awt.*;
import java.util.Random;
public class Linea {

    private int x;
    private int y;
    private int colorSel;
    private int destinoX;
    private int destinoY;
    private Color turtleColor;
private  Random randomGenerator = new Random();
    public Linea(int consx, int consy, int colorSel) {
        this.x = consx;
        this.y = consy;
        this.setColor(colorSel);
    }

    public Color setColor(int selector) {

        switch (selector) {
            case 1:
                turtleColor = Color.BLUE;
                break;
            case 2:
                turtleColor = Color.CYAN;
                break;
            case 3:
                turtleColor = Color.GREEN;
                break;
            case 4:
                turtleColor = Color.RED;
                break;
            case 5:
                turtleColor = Color.PINK;
                break;
            case 6:
                turtleColor = Color.YELLOW;
                break;
            case 7:
                turtleColor = Color.MAGENTA;
                break;
            case 8:
                turtleColor = Color.DARK_GRAY;
                break;
            case 9:
                turtleColor = Color.gray;
                break;
            case 10:         turtleColor = Color.BLACK;
                break;

        }
        return turtleColor;
    }

    public void setPuntoInicial(int initialX, int initialY) {
        x = initialX;
        y = initialY;
    }

    public void setPuntoDestino(int x2, int y2) {
    x=x2;
    y=y2;
    }

    public int getInitialX() {
        return x;
    }

    public int getInitialY() {
        return y;
    }

    public int getFinalX() {
        return destinoX;
    }

    public int getFinalY() {
        return destinoY;
    }
public Color getColor(){
    return turtleColor;
}
public void coordenadasAleatorias(int worldSizeX, int worldSizeY){
 destinoX = randomGenerator.nextInt(worldSizeX);
 destinoY = randomGenerator.nextInt(worldSizeY);
}

//    public void recorrido(int puntoInicial, int puntoFinal) {
//    
//  }

    @Override
    public String toString() {
        return "Linea{" + "x=" + x + ", y=" + y + ", destinoX=" + destinoX + ", destinoY=" + destinoY + '}';
    }
}
