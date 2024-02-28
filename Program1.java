class Program1 extends ConsoleProgram {

  /**
  * Description
  * @author:
  */
  
  public void run() {
    // variables 
    double dblKilometers;
    double dblMiles;

    //Distance in Km from user 
    dblKilometers = readDouble("how many kilometers?: ");

    //convert kilometers to miles 
    dblMiles = dblKilometers * 0.621371;

    //output 
    System.out.println(dblKilometers + "km is" + dblMiles + "miles");
    
    
  }
}
