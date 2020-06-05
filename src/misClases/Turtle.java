package misClases;


/**
 * Class that represents a turtle which is similar to a Logo turtle.
 * This class inherts from SimpleTurtle and is for students
 * to add methods to.
 *
 * Copyright Georgia Institute of Technology 2004
 * @author Barb Ericson ericson@cc.gatech.edu
 */
public class Turtle extends SimpleTurtle
{
  ////////////////// constructors ///////////////////////
  
  /** Constructor that takes the x and y and a picture to
   * draw on
   * @param x the starting x position
   * @param y the starting y position
   * @param picture the picture to draw on
   */
  public Turtle (int x, int y, Picture picture) 
  {
    // let the parent constructor handle it
    super(x,y,picture);
  }
  
  /** Constructor that takes the x and y and a model
   * display to draw it on
   * @param x the starting x position
   * @param y the starting y position
   * @param modelDisplayer the thing that displays the model
   */
  public Turtle (int x, int y, ModelDisplay modelDisplayer) 
  {
    // let the parent constructor handle it
    super(x,y,modelDisplayer);
  }
  
  /** Constructor that takes the model display
   * @param modelDisplay the thing that displays the model
   */
  public Turtle (ModelDisplay modelDisplay) 
  {
    // let the parent constructor handle it
    super(modelDisplay);
  }
  
  /**
   * Constructor that takes a picture to draw on
   * @param p the picture to draw on
   */
  public Turtle (Picture p)
  {
    // let the parent constructor handle it
    super(p);
  }
  
  /////////////////// methods ///////////////////////
  
  /**
   * Crea un cuadrado de lado x
   */
  public void square(int x){
      for (int c=0;c<4;c++){
        super.forward(x);
        super.turn(90);
        }
  }
  /**
   * Crea un triangulo de lados x
   */
  public void triangle(int x){
        super.turn(45);
        super.forward(x);
        super.turn(90);
        super.forward(x);
        super.turn(135);
        super.forward(x+40);
  }
  
  /**
   * Crea una estrella de tamaño n
   */
  public void star(int s){
      super.turn(90);
      super.forward(150);
        for(int k=0;k<4;k++){
        super.turn(145);
        super.forward(150);
        }    
  }
   /**
    * Crea un rectangulo de lados x y y
    */
  public void rectangle(int x, int y){
      for (int c=0;c<2;c++){
        super.forward(x);
        super.turn(90);
        super.forward(y);
        super.turn(90);
        }
  }
  /**
   * Crea un circulo
   */
  public void circletine(){
      for (int c=0;c<70;c++){
            super.forward(20);
            super.turn(12);
            }
  }
  /**
   * Crea cuadrados rotados
   */
  public void rotaSquares(){
      for (int b=0;b<18;b++){
            super.penUp();
          for (int c=0;c<4;c++){ 
              super.penDown();
              super.forward(40);
              super.turn(90);
              }
           super.turn(100);
        }  
  }
} // end of class Turtle, put all new methods before this