package dolphin;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

public class Admin extends User {


  ArrayList<User> listAllUsers = new ArrayList<>();
  Iterator<User> it = listAllUsers.iterator();

  Admin() {
    super();
  }
  public ArrayList<User> getListAllUsers() {
    return listAllUsers;
  }
  public void writeToFile() {
    File path = new File("memberList.txt");
    try {
      BufferedWriter bw = new BufferedWriter(new FileWriter(path));
      if (!path.exists()) {
        path.createNewFile();
      }
     if (it.hasNext()) {
       } for (int i = 0; i<listAllUsers.size(); i++){
        bw.write(listAllUsers.get(i).toString());}
     bw.flush();
      bw.close();
    } catch (IOException IO) {
      IO.getStackTrace();
    }
    finally {
      System.out.println("check if the file was written correctly!");
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
    finally {
      System.out.println("check is the file was read correctly!");
    }
  }


  public void createUser(String name, int age, int id, SystemRank type, Membership rank) {
    User newUser = new User(name, age, id, type, rank);
  listAllUsers.add(newUser);
  }

  public void printUserList() {
    System.out.println(listAllUsers.toString().trim()
        .replace("[", "")
        .replace("]","")
       .replace(",", ""));
    }
  //  public void printCompetitionList(){
   //   if (it.next().getMemberShip()) {
   //     System.out.println(listAllUsers.toString());
   //           }
    //  else
   //     System.out.println("competitors not found!");
  //  }

  public void deleteUser(String searchName) {
   for (int i = 0; i < listAllUsers.size(); i++) {
      if (Objects.equals(listAllUsers.get(i), searchName)) {
        listAllUsers.remove(i);
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



