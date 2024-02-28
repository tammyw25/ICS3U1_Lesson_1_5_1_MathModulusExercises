class Hours extends ConsoleProgram {

  /**
  * Description
  * @author: T. Wong
  */
  
  public void run() {
    
   
    // variables 
    double dblHours;
    int intDays;
    int intExtraHours;

    //calculations 
    dblHours = readDouble("Hours: ");
    intDays = (int) dblHours/ 24;
    intExtraHours = (int) dblHours/ 24;

    //printing
    System.out.println (intDays + "days and " + intExtraHours + "hours ");


  }
}