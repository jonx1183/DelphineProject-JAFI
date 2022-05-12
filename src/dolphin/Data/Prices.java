package dolphin.Data;


public class Prices {
  private Double Junior_Price  = 1000.0;
  private Double Senior_Price = 1600.0;
  private Double Passive_Price = 500.0;

  private   Double pensionist_rabat = 0.25; // 25 %
  private Double Pensionist_Price = (Senior_Price - (Senior_Price * pensionist_rabat));

  public Double getJunior_Price() {
    return Junior_Price;
  }
  public Double GetSenior_Price(){
    return Senior_Price;
  }
  public Double GetPassivePris(){
    return Passive_Price;
  }

  public Double GetPensionist_Price(){
    return Pensionist_Price;
  }
}
