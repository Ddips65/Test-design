/* Assignment-1 Unit test.*/

package edu.bu.met.cs665;

import edu.bu.met.cs665.example1.BeverageTypes;
import edu.bu.met.cs665.example1.VendingMachine;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestBeverage {

  public TestBeverage() {}

  @Test
  public void testAmericanoTotalNumberOfCondiments() {
    VendingMachine am = new VendingMachine(BeverageTypes.AMERICANO);
    /** 2 units of milk. 2 unit of sugar. */
    am.addMilk();
    am.addMilk();
    am.addSugar();
    am.addSugar();
    /** The total number of Condiments are 4. */
    assertEquals(am.getTotalNumberOfCondiments(), 4);
  }

  @Test
  public void testLatteTotalNumberOfCondiments() {
    VendingMachine la = new VendingMachine(BeverageTypes.LATTE_MACCHIATO);
    /** 3 Units of milk and 3 units of sugar. */
    la.addMilk();
    la.addMilk();
    la.addMilk();
    la.addSugar();
    la.addSugar();
    la.addSugar();
    /** The total number of Condiments are 6. */
    assertEquals(la.getTotalNumberOfCondiments(), 6);
  }

  @Test
  public void testEspressoTotalNumberOfCondiments() {
    VendingMachine es = new VendingMachine(BeverageTypes.ESPRESSO);
    /** 2 Units of milk and 3 units of sugar. */
    es.addMilk();
    es.addMilk();
    es.addSugar();
    es.addSugar();
    es.addSugar();
    /** The total number of Condiments are 5. */
    assertEquals(es.getTotalNumberOfCondiments(), 5);
  }

  @Test
  public void testBlackTeaTotalNumberOfCondiments() {
    VendingMachine blk = new VendingMachine(BeverageTypes.BLACK_TEA);
    /** 3 Units of milk and 2 units of sugar */
    blk.addMilk();
    blk.addMilk();
    blk.addMilk();
    blk.addSugar();
    blk.addSugar();
    /** The total Condiments are 5. */
    assertEquals(blk.getTotalNumberOfCondiments(), 5);
  }

  @Test
  public void testGreenTeaTeaTotalNumberOfCondiments() {
    VendingMachine gt = new VendingMachine(BeverageTypes.GREEN_TEA);
    /** 1 Units of milk and 1 units of sugar */
    gt.addMilk();
    gt.addSugar();
    /** The total Condiments are 2. */
    assertEquals(gt.getTotalNumberOfCondiments(), 2);
  }

  @Test
  public void testYellowTeaTeaTotalNumberOfCondiments() {
    VendingMachine yt = new VendingMachine(BeverageTypes.YELLOW_TEA);
    /** 1 Units of milk and 2 units of sugar */
    yt.addMilk();
    yt.addSugar();
    yt.addSugar();
    /** The total Condiments are 3. */
    assertEquals(yt.getTotalNumberOfCondiments(), 3);
  }

  @Test
  public void testTotalUnitOfMilk() {
    VendingMachine bt = new VendingMachine(BeverageTypes.BLACK_TEA);
    /** 4 units of milk and 1 units of sugar */
    bt.addMilk();
    bt.addMilk();
    bt.addMilk();
    bt.addMilk();
    bt.addSugar();

    /**
     * The total unit of milk in this case are 3 instead of 4 as only 3 units of milk are allowed.
     */
    assertEquals(bt.getTotalMilkUnit(), 3);
  }

  @Test
  public void testTotalUnitOfSugar() {
    VendingMachine esp = new VendingMachine(BeverageTypes.ESPRESSO);
    /** 5 units of sugar and 1 unit of milk */
    esp.addSugar();
    esp.addSugar();
    esp.addSugar();
    esp.addSugar();
    esp.addSugar();
    esp.addMilk();
    /** The total unit of sugar 3 instead of 5 only 3 units of sugar are allowed. */
    assertEquals(esp.getTotalSugarUnit(), 3);
  }
}
