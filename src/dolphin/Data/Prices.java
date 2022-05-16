package dolphin.Data;


public class Prices {
  private Double Junior_Price  = 1000.0;
  private Double adult_Price = 1600.0;
  private Double passive_Price = 500.0;

  private Double senior_Discount = 0.25; // 25 %
  private Double senior_Price = (adult_Price - (adult_Price * senior_Discount));

  public Double getJunior_Price() {
    return Junior_Price;
  }
  public Double getAdult_Price(){
    return adult_Price;
  }
  public Double getPassivePrice(){
    return passive_Price;
  }

  public Double getSenior_Price(){
    return senior_Price;
  }
}
