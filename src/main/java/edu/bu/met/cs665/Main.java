/** Assignment-1 Main program to start execution of the program. */

package edu.bu.met.cs665;

import edu.bu.met.cs665.example1.BeverageTypes;
import edu.bu.met.cs665.example1.VendingMachine;

public class Main {

  /**
   * A main method to run program.
   *
   * @param args String
   */
  public static void main(String[] args) {

    // -------------------ADD MY OWN LOGIC INSIDE MAIN-----------------------------------

    VendingMachine coffee = new VendingMachine(BeverageTypes.AMERICANO);
    coffee.addMilk();
    coffee.addMilk();
    coffee.addMilk();
    coffee.addMilk();
    coffee.addSugar();
    coffee.addSugar();
    coffee.addSugar();
    coffee.addSugar();
    /*
     * The total Condiments in this case 6 instead of 8 as allow to add up to 3 units each.
     */
    coffee.createDrink();
    System.out.println(
        "The beverage "
            + coffee.drinkType
            + " has added "
            + coffee.getTotalMilkUnit()
            + " Milk Units"
            + " and "
            + coffee.getTotalSugarUnit()
            + " Sugar Units."
            + " Total number of the condiments are "
            + coffee.getTotalNumberOfCondiments());

    VendingMachine tea = new VendingMachine(BeverageTypes.BLACK_TEA);
    tea.addMilk();
    tea.addMilk();
    tea.addMilk();
    tea.addMilk();
    tea.addMilk();
    tea.addMilk();
    tea.addSugar();
    tea.addSugar();
    tea.addSugar();
    tea.addSugar();
    tea.addSugar();
    /*
     * The total Condiments in this case 6 instead of 8 as allow to add up to 3 units each.
     */
    tea.createDrink();
    System.out.println(
        "The beverage "
            + tea.drinkType
            + " has added "
            + tea.getTotalMilkUnit()
            + " Milk Units"
            + " and "
            + tea.getTotalSugarUnit()
            + " Sugar Units."
            + " Total number of the condiments are "
            + tea.getTotalNumberOfCondiments());
  }
}
