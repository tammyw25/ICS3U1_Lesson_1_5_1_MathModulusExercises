class Rads extends ConsoleProgram {

  /**
  * Description
  * @author:
  */
  
  public void run() {
    
    // variables 
    double dblRadian;
    double dblDegree;

    //input
    dblDegree = readDouble("The degree measurement is: ");

    //degree to rad 
    dblRadian = Math.toRadians(dblDegree);

    //output
    System.out.println(dblDegree + "degree: " + dblRadian+ "radian ");
    
  }
}