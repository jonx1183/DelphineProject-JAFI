package dolphin.Classer;

import dolphin.enums.ActivityLevel;
import dolphin.enums.SystemRank;
import dolphin.enums.*;

import java.util.ArrayList;

public class Admin extends User {

 ArrayList<User> listAllUsers = new ArrayList<>();


  Admin() {
    super();
  }

  public void createUser(String name, int age, int id, SystemRank type, AgeType agetype, ActivityLevel rank, SwimmingStyle style) {
    User newUser = new User(name, age, id, type, agetype,rank ,style);
  getListAllUsers().add(newUser);
  }


  public void printUserList() {
  }
}



