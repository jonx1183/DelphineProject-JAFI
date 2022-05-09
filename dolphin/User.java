package dolphin;

import java.util.ArrayList;

public class User {
  Type type;
  private String name;
  private int age;
  private int id;

  User(String name, int age, int id, Type type) {
    setName(name);
    setAge(age);
    setId(id);
    setTypeofCustomer(type);

  }

  public User() {
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

  public void setTypeofCustomer(Type type) {
    this.type = type;
  }

  public Type getTypeOfCustomer() {
    return type;
  }

  @Override
  public String toString() {
    return "Name: " + name + " - Age: " + age + " - ID: " + id + " - Type: " + type;
  }
}
