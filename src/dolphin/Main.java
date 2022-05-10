package dolphin;

public class Main {
  public class Controller {
    public static void main(String[] args) {
      Admin prg = new Admin();
      //  User newuser = new User("joe", 33, 70, Type.MEMBER);
      prg.createUser("jane", 33, 70, Type.MEMBER);
      System.out.println(prg.listAllUsers.get(0));
      System.out.println(prg.listAllUsers.get(0).getName());
      for (int i = 0; i < prg.listAllUsers.size(); i++)
        System.out.println(prg.listAllUsers.get(i));
      System.out.println(prg.listAllUsers.isEmpty());
    }

  }
}
