class Circumference extends ConsoleProgram {

  /**
  * Description
  * @author:
  */
  
  public void run() {
    
    // start coding here
    double dblRadius;
    double dblCircumference;
    dblRadius = readDouble("Enter radius: ");
    dblCircumference = (2 * 3.14 * dblRadius);
    System.out.println("The circumference of this circle is: " + dblCircumference);
  }
}