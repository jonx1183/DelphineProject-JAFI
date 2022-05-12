package dolphin;

import dolphin.enums.AgeType;
import dolphin.enums.MembershipLevel;
import dolphin.enums.SwimmingStyle;
import dolphin.enums.SystemRank;

import java.util.ArrayList;

public class User {
  SystemRank type;
  AgeType rank;
  SwimmingStyle style;
  MembershipLevel level;
  private String name;
  private int age;
  private int id;
  private ArrayList<User> listAllUsers = new ArrayList<>();

  User(String name, int age, int id, SystemRank type, AgeType rank, MembershipLevel _level, SwimmingStyle _style) {
    setName(name);
    setAge(age);
    setId(id);
    setTypeofCustomer(type);
    setRank(rank);
    setSwimStyle(_style);
    setMemberLevel(_level);

  }

  public User() {
  }

  public ArrayList<User> getListAllUsers() {
    return listAllUsers;
  }

  public String getName() {
    return name;

  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public void setTypeofCustomer(SystemRank type) {
    this.type = type;
  }

  public SystemRank getTypeOfCustomer() {
    return type;
  }

  public AgeType getMemberShip() {
    return rank;
  }

  public void setRank(AgeType rank) {
    this.rank = rank;
  }

  public void setMemberLevel(MembershipLevel level) {

    this.level = level;
  }
  public void setSwimStyle(SwimmingStyle style) {
    if(this.level == MembershipLevel.Competitor){
      this.style = style;
    }else {
      this.style = SwimmingStyle.none;
    }

  }

  @Override
  public String toString() {

    String info = "\nName: " + name + " - " + "Age: " + age + " - " + "ID: " + id + " - "
        + "Type: " + type + " - " + "Rank: " + rank+"";

    return info;
  }
}

