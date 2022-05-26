package dolphin.Data;

public class Prices {
  private Double juniorPrice = 1000.0;
  private Double adultPrice = 1600.0;
  private Double passivePrice = 500.0;
  private Double seniorDiscount = 0.25; // 25 %
  private Double seniorPrice = (adultPrice - (adultPrice * seniorDiscount));


  public Double getJuniorPrice() {return juniorPrice;}
  public Double getAdultPrice(){return adultPrice;}
  public Double getPassivePrice(){return passivePrice;}
  public Double getSeniorPrice(){return seniorPrice;}
}
