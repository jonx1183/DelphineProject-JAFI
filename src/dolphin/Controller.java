package dolphin;

public class Controller {
  public static void main(String[] args) {
    Admin prg = new Admin();
    prg.createUser("jane", 33, 70, Type.MEMBER);
    prg.createUser("john", 35, 23, Type.MEMBER);

    prg.writeToFile();
    }

}
