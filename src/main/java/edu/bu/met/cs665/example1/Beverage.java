/** Name : Dipti Doshi Date: 2/10/2022 Course: CS-665 Assignment-1. */

package edu.bu.met.cs665.example1;

/**
 * Beverage class holds beverage information like number of condiments ,number of milk and sugar
 * units.
 */
public class Beverage {

  private int totalNumberOfCondiments;
  private int totalMilkUnit;
  private int totalSugarUnit;

  // get the total number of condiments after adding milk and sugar unit.
  public int getTotalNumberOfCondiments() {
    return totalNumberOfCondiments;
  }

  // set the total number of condiments
  public void setTotalNumberOfCondiments(int totalNumberOfCondiments) {
    this.totalNumberOfCondiments += totalNumberOfCondiments;
  }

  // get total number of Sugar units.
  public int getTotalSugarUnit() {
    return totalSugarUnit;
  }

  // set the total number of Sugar units.
  public void setTotalSugarUnit(int totalSugarUnit) {
    this.totalSugarUnit = totalSugarUnit;
  }

  // get the total number of Milk units.
  public int getTotalMilkUnit() {
    return totalMilkUnit;
  }

  // set the total number of Milk units.
  public void setTotalMilkUnit(int totalMilkUnit) {
    this.totalMilkUnit = totalMilkUnit;
  }

  /**
   * This method is to add the Milk unit in the drink and method is overridden in the vending
   * machine.
   */
  public void addMilk() {}

  /**
   * This method is to add the sugar unit in the drink and method is overridden in the vending
   * machine.
   */
  public void addSugar() {}
}
