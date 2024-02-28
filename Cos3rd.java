class Cos3rd extends ConsoleProgram {

  /**
  * Description
  * @author:
  */
  
  public void run() {
    
    // variables 
    double dblSideA;
    double dblSideB; 
    double dblAngleC;
    double dblSideC;

    // Side A, side B, and ange C from user 
    dblSideA = readDouble ("What is length of Side A?: ");
    dblSideB = readDouble ("what is length of Side B?:");
    dblAngleC = readDouble ("What is degree of Angle of C:");

   // Calculate the third side with cosine law 
   dblSideC = Math.sqrt(Math.pow(dblSideA, 2) + Math.pow(dblSideB, 2) - 2 * dblSideA * dblSideB * Math.toRadians(dblAngleC));

    
    //output
    System.out.println("The length of Side C is: " + dblSideC);
   
    
  }
}