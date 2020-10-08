/**
 * The AddingMachine program does calculations which a calculator could do.
 * 
 *@Rishabh Marisetti
 *@version 2.0
 *@since 2020-09-07
 */


package cse360assignment02;

public class AddingMachine {
  private int total;
  private String history = "0";
  
  
  public AddingMachine () {
    total = 0;  // not needed - included for clarity
  }
  
  /**
   * This method gets the total.
   * @return NOTHING
   */

  
  public int getTotal () {
    return total;
    
  }
  
  /**
   * This method does the add function.
   * @param value This is the only parameter to AddingMachine.
   * @return Total + value
   */

  
  public void add (int value) {
	  total = total + value;
	  history += " + " + value;
  }
  
  /**
   * This method does the subtract function.
   * @param value This is the only parameter to AddingMachine.
   * @return total - value
   */


  public void subtract (int value) {
	  total = total - value;
	  history += " - " + value;
  }
  
  /**
   * This method will provide the final calculations and store it in history
   * @return history
   * 
   */

  public String toString () {
    return history;
  }
  
  /**
   * This method will clear all calculations made which would be zero. This means history will also be set to 0.
   * @return history
   */

  public void clear() {
	  total = 0;
	  history = "0";
  }
  
}