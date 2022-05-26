package dolphin.Data;

import java.util.ArrayList;
import java.util.List;

public class Members {
  List<User> listOfMembers;

  public Members() {
    listOfMembers = createMemberList();
  }

  private List<User> createMemberList() {
    List<User> listOfMembers = new ArrayList<>();
    listOfMembers.add(new User("Malik Delacruz", 38));
    listOfMembers.add(new User("Chadwick Osborne", 18));
    listOfMembers.add(new User("Alea Aguilar", 42));
    listOfMembers.add(new User("Calista Conley", 13));
    listOfMembers.add(new User("Kay Rutledge", 15));
    listOfMembers.add(new User("Geraldine Oneil", 66));
    listOfMembers.add(new User("Colleen Le", 52));
    listOfMembers.add(new User("Josephine Dudley", 60));
    listOfMembers.add(new User("Rinah Lindsay", 51));
    listOfMembers.add(new User("Hu Stanley", 65));
    listOfMembers.add(new User("Amity Parker", 20));
    listOfMembers.add(new User("Vaughan Ray", 32));
    listOfMembers.add(new User("Kyle Broflovski", 32));
    listOfMembers.add(new User("Regina Hodge", 32));
    listOfMembers.add(new User("Lara Croft", 58));
    listOfMembers.add(new User("Vivien Lara", 58));
    listOfMembers.add(new User("Beverly Foster", 63));
    listOfMembers.add(new User("Arsenio Raymond", 32));
    listOfMembers.add(new User("Philip Walsh", 40));
    listOfMembers.add(new User("Georgia Fields", 58));
    listOfMembers.add(new User("Regina King", 50));
    listOfMembers.add(new User("Stacy Salinas", 50));
    listOfMembers.add(new User("Beverly Vaughan", 64));
    listOfMembers.add(new User("Yen Howard", 55));
    listOfMembers.add(new User("Donovan Patterson", 29));
    listOfMembers.add(new User("Destiny Montgomery", 39));
    listOfMembers.add(new User("Benjamin Hopper", 23));
    listOfMembers.add(new User("May Bolton", 16));
    listOfMembers.add(new User("Hakeem Duffy", 53));
    listOfMembers.add(new User("Lavinia Haynes", 43));
    listOfMembers.add(new User("Hayfa Moreno", 19));
    listOfMembers.add(new User("Arden Hudson", 42));
    listOfMembers.add(new User("Ann Henson", 69));
    listOfMembers.add(new User("Ima Meyer", 60));
    listOfMembers.add(new User("Kermit Mejia", 44));
    listOfMembers.add(new User("Magee Holt", 49));
    listOfMembers.add(new User("Calvin Cardenas", 21));
    listOfMembers.add(new User("Riley Cline", 58));
    listOfMembers.add(new User("September Wyatt", 38));
    listOfMembers.add(new User("Lillith Reeves", 62));
    listOfMembers.add(new User("Hiram Christian", 36));
    listOfMembers.add(new User("Keegan Nichols", 62));
    listOfMembers.add(new User("Bardin Gorekson", 62));
    listOfMembers.add(new User("Hilel Murray", 47));
    listOfMembers.add(new User("Moana Daniels", 61));
    listOfMembers.add(new User("Hop Edwards", 62));
    listOfMembers.add(new User("Lillian Greer", 65));
    listOfMembers.add(new User("Flynn Burt", 64));
    listOfMembers.add(new User("Valentine Fowler", 58));
    listOfMembers.add(new User("Lila Gray", 16));
    listOfMembers.add(new User("Scarlet Maxwell", 27));
    listOfMembers.add(new User("Sienna Ferguson", 45));
    listOfMembers.add(new User("Len Hines", 45));
    listOfMembers.add(new User("James Watts", 45));
    listOfMembers.add(new User("Vaughan Aguilar", 59));

    return listOfMembers;
  }
}
