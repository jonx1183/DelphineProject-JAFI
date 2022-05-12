package dolphin;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class ConcurentSwimmer extends Admin {
  //Iterator<User> it = listAllUsers.iterator();
//  User user = new User();
 ArrayList<User> listAllUsers = new Admin().getListAllUsers();
 Admin admin = new Admin();
 // Controller control = new Controller();


  public void findingMembers() {
    for (int i = 0; i < getListAllUsers().size(); i++ ) {
      System.out.println(admin.listAllUsers.get(i).toString());
      admin.listAllUsers.get(i).toString();
      System.out.println(listAllUsers.get(i).toString());
      System.out.println("hi");
    }
    System.out.println("yooo");
    System.out.println(admin.listAllUsers.isEmpty());
    System.out.println("yooooo");
    System.out.println(listAllUsers.toString());

    System.out.println(listAllUsers.toString().trim());
    listAllUsers.toString();


  }
}
    // If member is "COMPETITOR", add read from list. (Maybe add to new list.)


