package misClases;

import java.awt.Color;

/**
 * A class that represents a picture. This class inherits from SimplePicture and
 * allows the student to add functionality to the Picture class.
 *
 * Copyright Georgia Institute of Technology 2004-2005
 *
 * @author Barbara Ericson ericson@cc.gatech.edu
 */
public class Picture extends SimplePicture {
    ///////////////////// constructors //////////////////////////////////

    /**
     * Constructor that takes no arguments
     */
    public Picture() {
        /*
         * not needed but use it to show students the implicit call to super()
         * child constructors always call a parent constructor
         */
        super();
    }

    /**
     * Constructor that takes a file name and creates the picture
     *
     * @param fileName the name of the file to create the picture from
     */
    public Picture(String fileName) {
        // let the parent class handle this fileName
        super(fileName);
    }

    /**
     * Constructor that takes the width and height
     *
     * @param width the width of the desired picture
     * @param height the height of the desired picture
     */
    public Picture(int width, int height) {
        // let the parent class handle this width and height
        super(width, height);
    }

    /**
     * Constructor that takes a picture and creates a copy of that picture
     */
    public Picture(Picture copyPicture) {
        // let the parent class do the copy
        super(copyPicture);
    }

    ////////////////////// methods ///////////////////////////////////////
    /**
     * Method to return a string with information about this picture.
     *
     * @return a string with information about the picture such as fileName,
     * height and width.
     */
    @Override
    public String toString() {
        String output = "Picture, filename " + getFileName()
                + " height " + getHeight()
                + " width " + getWidth();
        return output;

    }

    /**
     * Dibuja un cuadro rojo de 20x20 en la esquina superior izquierda
     */
    public void squareUp() {
        for (int x = 0; x < 21; x++) {
            for (int c = 0; c < 21; c++) {
                super.getPixel(x, c).setColor(Color.red);
            }
        }
    }

    /**
     * Dibuja un cuadro azul de 20x20 en la esquina superior derecha
     */
    public void squareUpRight() {
        for (int r = ((getWidth()) - 20); r < getWidth(); r++) {
            for (int h = 0; h < 21; h++) {
                super.getPixel(r, h).setColor(Color.blue);
            }
        }
    }

    /**
     * Dibuja un cuadro amarillo en la esquina inferior izquierda
     */
    public void squareDown() {
        for (int t = 0; t < 21; t++) {
            for (int a = (getHeight() - 20); a < getHeight(); a++) {
                super.getPixel(t, a).setColor(Color.yellow);
            }
        }
    }

    /**
     * Dibuja un cuadro verde en la esquina inferior derecha
     */
    public void squareDownRight() {
        for (int k = (getWidth() - 20); k < getWidth(); k++) {
            for (int p = (getHeight() - 20); p < getHeight(); p++) {
                super.getPixel(k, p).setColor(Color.green);
            }
        }
    }

    public Pixel[][] getPixelMatrix() {

        Pixel[][] matrix = new Pixel[this.getWidth()][this.getHeight()];
        for (int x = 0; x < this.getWidth(); x++) {
            for (int y = 0; y < this.getHeight(); y++) {
                matrix[x][y] = getPixel(x, y);
            }
        }
        return matrix;
    }

    public void cambiaColor(Picture imagen, Color viejo, Color nuevoColor) {
        Pixel[][] matrix = imagen.getPixelMatrix();
        Pixel pixel = null;
        int r = viejo.getRed();
        int b = viejo.getBlue();
        int g = viejo.getGreen();
        for (int x = 0; x < this.getWidth(); x++) {
            for (int y = 0; y < this.getHeight(); y++) {
                pixel = matrix[x][y];
                int red = pixel.getRed();
                int green = pixel.getGreen();
                int blue = pixel.getBlue();
                if (red == r && green == g && blue == b) {
                    pixel.setColor(nuevoColor);
                }
            }
        }
        imagen.repaint();
    }

    public void fusiona(Picture original, Picture fondo) {
        Pixel[][] originalmatrix = original.getPixelMatrix();
        Pixel[][] fondomatrix = fondo.getPixelMatrix();

        if (original.getWidth() == fondo.getWidth() && original.getHeight() == fondo.getHeight()) {
            Pixel[][] fusionamat = original.getPixelMatrix();
            Color color = null;
            Pixel pixel = null;
            for (int x = 0; x < original.getWidth(); x++) {
                for (int y = 0; y < original.getHeight(); y++) {
                    pixel = fusionamat[x][y];
                    int g = pixel.getGreen();
                    int r = pixel.getRed();
                    int b = pixel.getBlue();
                    if (r == 0 && g == 255 && b == 1) {
                        pixel.setColor(fondomatrix[x][y].getColor());
                    }
                }
            }
        } else {
            System.out.println("Error");
        }
    }

    public void rotaIzq() {
        Pixel[][] rotMat = this.getPixelMatrix();
        Picture imgRot = new Picture(this.getHeight(), this.getWidth());
        Pixel[][] resultado = imgRot.getPixelMatrix();
        for (int i = 0; i < this.getWidth(); i++) {
            for (int j = 0; j < this.getHeight(); j++) {
                resultado[j][this.getWidth() - 1 - i].setColor(rotMat[i][j].getColor());
            }
        }
        imgRot.repaint();
    }

    public void rotaDer() {
        Pixel[][] rotMat = this.getPixelMatrix();
        Picture imgRot = new Picture(this.getHeight(), this.getWidth());
        Pixel[][] resultado = imgRot.getPixelMatrix();
        for (int i = 0; i < this.getWidth(); i++) {
            for (int j = 0; j < this.getHeight(); j++) {
                resultado[this.getHeight() - 1 - j][i].setColor(rotMat[i][j].getColor());
            }
        }
        imgRot.repaint();
    }

    public void smaller() {
        Pixel[][] matriz = this.getPixelMatrix();
        Picture chii = new Picture(this.getWidth(), this.getHeight());
        Pixel[][] atarashii = chii.getPixelMatrix();
        int x = 0;
        for (int i = 0; i < this.getWidth(); i += 2, x++) {
            int y = 0;
            for (int j = 0; j < this.getHeight(); j += 2, y++) {
                atarashii[x][y].setColor(matriz[i][j].getColor());

            }
        }
        chii.repaint();
    }

    public void horMirror() {
        Pixel[][] matrix = this.getPixelMatrix();
        int puntoMedio = this.getHeight() / 2;
        for (int i = 0; i < this.getWidth(); i++) {
            for (int j = 0; j < puntoMedio; j++) {
                matrix[i][this.getWidth()-1 -j].setColor(matrix[i][j].getColor());
            }
        }
        this.repaint();

    }
} // end of class Picture, put all new methods before this

