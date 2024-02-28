class FtoC extends ConsoleProgram {

  /**
  * Description
  * @author: T. Wong
  */
  
  public void run() {
    
  //variables 
  double dblDegreeinFahrenheit;
  int intDegreeinCelsius;

  //input
  dblDegreeinFahrenheit = readDouble("Enter degree measure in Fahrenheit: ");
  intDegreeinCelsius = ((int)dblDegreeinFahrenheit -32) *5/9;
  
  //output
  System.out.println("c =" + intDegreeinCelsius);
    
  }
}