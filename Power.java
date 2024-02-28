class Power extends ConsoleProgram { 

  /**
  * Description
  * @author: T.Wong 
  */
  
  public void run(){
    
    //variables 
    double dblPower;
    double dblBase; 
    double dblResult;

    //input
    dblPower = readDouble("What is the power?: ");
    dblBase = readDouble("What is base?: ");
    

    //Calculate 
    dblResult = Math.pow(dblBase, dblPower);

    //output
    System.out.println(dblBase + " to the power of " + dblPower + " is " + dblResult);

  }

}