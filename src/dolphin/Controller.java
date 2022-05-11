package dolphin;

public class Controller {

  public static void main(String[] args) {
    Admin prg = new Admin();
    prg.createUser("jane", 33, 70, SystemRank.MEMBER, Membership.MEMBER);
    prg.createUser("john", 35, 23, SystemRank.MEMBER, Membership.COMPETITOR);
    prg.createUser("Lukas", 25, 13, SystemRank.TRAINER, Membership.ELDER);

    prg.printUserList();
    prg.writeToFile();
    }

}
