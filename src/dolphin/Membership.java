package dolphin;

public enum Membership {
  JUNIORMEMBER(1000d),
  MEMBER(1600d),
  INACTIVE(500d),
  ELDER(1600/0.75f),
  COMPETITOR(1600d);

final double price;

  Membership(double price){
this.price = price;
  }
}
