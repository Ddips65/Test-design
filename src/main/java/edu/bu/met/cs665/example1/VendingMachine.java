/** Name : Dipti Doshi Date: 2/10/2022 Course: CS-665 Assignment-1. */

package edu.bu.met.cs665.example1;

/** VendingMachine class can add maximum 3 units of milk and sugar. */
public class VendingMachine extends Beverage {

  private static final int MAX_NUM_MILK_UNIT = 3;
  private static final int MAX_NUM_SUGAR_UNIT = 3;
  private int milkUnit;
  private int sugarUnit;
  public BeverageTypes drinkType;

  /**
   * parameterize constructor set the beverage drink type.
   *
   * @param drinkType BeverageTypes
   */
  public VendingMachine(BeverageTypes drinkType) {
    this.milkUnit = 0;
    this.sugarUnit = 0;
    this.drinkType = drinkType;
  }

  /**
   * This method get the total milk units and check if more could be added. If more could be added
   * then it will add an update the total number of the milk unit.It is an example of method
   * overriding.
   */
  @Override
  public void addMilk() {
    super.addMilk();
    this.milkUnit = getTotalMilkUnit();
    if (milkUnit < MAX_NUM_MILK_UNIT) {
      this.milkUnit++;
      setTotalMilkUnit(this.milkUnit);
      setTotalNumberOfCondiments(1);
    }
  }

  /**
   * This method get the total sugar units and check if more could be added. If more could be added
   * then it will add an update the total number of the sugar unit.It is an example of method
   * overriding.
   */
  @Override
  public void addSugar() {
    super.addSugar();
    this.sugarUnit = getTotalSugarUnit();
    if (sugarUnit < MAX_NUM_SUGAR_UNIT) {
      this.sugarUnit++;
      setTotalSugarUnit(this.sugarUnit);
      setTotalNumberOfCondiments(1);
    }
  }

  /** creating or preparing the drink. */
  public void createDrink() {
    switch (this.drinkType) {
      case ESPRESSO:
        System.out.println("Espresso coffee");
        break;
      case AMERICANO:
        System.out.println("Americano coffee");
        break;
      case LATTE_MACCHIATO:
        System.out.println("Latte Macchiato coffee");
        break;
      case BLACK_TEA:
        System.out.println("Black Tea");
        break;
      case GREEN_TEA:
        System.out.println("Green Tea");
        break;
      case YELLOW_TEA:
        System.out.println("Yellow Tea");
        break;
      default:
        break;
    }
  }
}
