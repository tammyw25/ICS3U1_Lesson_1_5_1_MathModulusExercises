class Minutes extends ConsoleProgram {

  /**
  * Description
  * @author:
  */
  
  public void run() {

 // define the variables
 int intNumberOfMinutes;
 int intNumberOfDays;
 int intNumberOfHours;
 int intLeftOverMinutes;
 int intLeftOverMinutes2;

 // get the number of minutes from the user
 intNumberOfMinutes = readInt("Enter the number of minutes: ");

 // computer days, hours, and minutes
 intNumberOfDays = intNumberOfMinutes / 1440;
 intLeftOverMinutes = intNumberOfMinutes / 1440;
 intNumberOfHours = intLeftOverMinutes / 60;
 intLeftOverMinutes2 = intLeftOverMinutes % 60;

 // print the output
 System.out.println(intNumberOfMinutes + " represents " + intNumberOfDays + " days, " + intNumberOfHours + " hours, and " +  intLeftOverMinutes2 + " minutes.");


    
    
  }
}