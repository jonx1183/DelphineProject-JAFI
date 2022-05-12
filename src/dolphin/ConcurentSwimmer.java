package dolphin;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class ConcurentSwimmer extends User {
  Iterator<User> it = getListAllUsers().iterator();
  User user = new User();
  Admin admin = new Admin();
  Controller control = new Controller();
  ArrayList<User> listAllUsers = new ArrayList<>();

  public void findingMembers() {
    for (int i = 0; i < getListAllUsers().size(); i++ ) {
      System.out.println(getListAllUsers().get(i).toString());
    }
    System.out.println("yooo");
   getListAllUsers().toString();

    System.out.println(getListAllUsers().toString().trim());

  }

}
    // If member is "COMPETITOR", add read from list. (Maybe add to new list.)


