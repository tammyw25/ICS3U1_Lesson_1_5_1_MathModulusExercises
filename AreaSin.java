class AreaSin extends ConsoleProgram {

  /**
  * Description
  * @author:
  */
  
  public void run() {
    
    // variables 
    double dblSideA; 
    double dblSideB;
    double dblAngleC;
    double dblArea;

    //input 
    dblSideA = readDouble ("Angle side of A of triangle: ");
    dblSideB = readDouble ("Enter side B of triangle: ");
    dblAngleC = readDouble ("Enter angle of Side A and B triangle: ");
    
    //calculate
    dblArea = (dblSideA * dblSideB * Math.sin(Math.toRadians(dblAngleC))) / 2.0;

    //output
    System.out.println("Area is "+ dblArea);
  }
}