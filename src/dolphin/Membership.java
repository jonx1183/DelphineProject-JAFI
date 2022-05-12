package dolphin;

import java.util.Comparator;

public enum Membership implements Comparator<User> {
  JUNIORMEMBER(1000d),
  MEMBER(1600d),
  INACTIVE(500d),
  WORKER(0d),
  ELDER(1600/0.75f),
  COMPETITOR(1600d);


final double price;

  Membership(double price){
this.price = price;
  }

  @Override
  public int compare(User o1, User o2) {
    return compare(o1, o2);
  }
}
