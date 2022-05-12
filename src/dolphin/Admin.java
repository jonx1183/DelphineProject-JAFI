package dolphin;

import dolphin.enums.AgeType;
import dolphin.enums.MembershipLevel;
import dolphin.enums.SystemRank;
import dolphin.enums.SwimmingStyle;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

public class Admin extends User {
  ArrayList<User> listAllUsers = new ArrayList<>();
  Iterator<User> it = getListAllUsers().iterator();

  Admin() {
    super();
  }

  public void writeToFile() {
    File path = new File("memberList.txt");
    try {
      BufferedWriter bw = new BufferedWriter(new FileWriter(path));
      if (!path.exists()) {
        path.createNewFile();
      }
      if (it.hasNext()) {
        for (int i = 0; i<getListAllUsers().size(); i++)
        bw.write(getListAllUsers().get(i).toString());
      }
      bw.flush();
      bw.close();
    } catch (IOException IO) {
      IO.getStackTrace();
    }
  }
  public void readFromFile(){
    File path = new File("memberList.txt");
    try {
      BufferedReader br = new BufferedReader(new FileReader(path));
      if (!path.exists()) {
        System.out.println("file doesnt exist!");
      }
      while (br.ready()) {
        System.out.println(br.readLine());
      }
      br.close();
    } catch (IOException IO) {
      IO.getStackTrace();
    }
  }


  public void createUser(String name, int age, int id, SystemRank type, AgeType rank, MembershipLevel level,
    SwimmingStyle style ) {
    User newUser = new User(name, age, id, type, rank, level,style);
     listAllUsers.add(newUser);
    getListAllUsers().add(newUser);
  }

  public void printUserList() {
    System.out.println(getListAllUsers().toString().trim()
        .replace("[", "")
        .replace("]","")
        .replace(",", ""));
    }

  public void deleteUser(String searchName) {
    for (int i = 0; i < getListAllUsers().size(); i++) {
      if (Objects.equals(getListAllUsers().get(i), searchName)) {
        getListAllUsers().remove(i);
        System.out.println(searchName + ", is removed from the list.");
      } else
        System.out.println("a match has not been found.");
    }
  }
  }
// TODO: this is not working, need to string
  /*public void changeUser(String newName, int newAge, int newId, Type newType){
    this.setName(newName);
    this.setAge(newAge);
    this.setId(newId);
    this.setTypeofCustomer(newType);
    System.out.println("the new userdata: );
  }*/



