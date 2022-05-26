package dolphin.Data;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PricesTest {

@Test
  void getJunior_Price() {

}
  @Test
  void getAdult_Price() {
    OverView ov = new OverView();
    ov.getMemberList().get(0).getYearlyPrice();
    assertEquals(1600, ov.getMemberList().get(0).getYearlyPrice());
  }

  @Test
  void getPassivePrice() {
  }

  @Test
  void getSenior_Price() {
  }
}