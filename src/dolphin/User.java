package dolphin;

import java.text.Format;
import java.util.ArrayList;

public class User {
  SystemRank type;
  Membership rank;
  private String name;
  private int age;
  private int id;
  ArrayList<User> listAllUsers = new ArrayList<>();

  User(String name, int age, int id, SystemRank type, Membership rank) {
    setName(name);
    setAge(age);
    setId(id);
    setTypeofCustomer(type);
    setRank(rank);
  }

  public User() {
  }

  public ArrayList<User> getListAllUsers() {
    return listAllUsers; }

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

  public Membership getMemberShip() {
    return rank;
  }

  public void setRank(Membership rank) {
    this.rank = rank;
  }

  @Override
  public String toString() {

    String info = "\nName: " + name + " - " + "Age: " + age + " - " + "ID: " + id + " - "
        + "Type: " + type + " - " + "Rank: " + rank+"";

    return info;
  }
}

