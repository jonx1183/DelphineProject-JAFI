package dolphin;

public class Controller {

  public static void main(String[] args) {
    ConcurentSwimmer competition = new ConcurentSwimmer();
    Admin prg = new Admin();
    prg.createUser("jane", 33, 70, SystemRank.MEMBER, Membership.MEMBER);
    prg.createUser("john", 35, 23, SystemRank.MEMBER, Membership.COMPETITOR);
    prg.createUser("Lukas", 25, 13, SystemRank.TRAINER, Membership.COMPETITOR);
    prg.createUser("Arne", 25, 15, SystemRank.MEMBER, Membership.COMPETITOR);
    prg.createUser("Hugo", 25, 17, SystemRank.MEMBER, Membership.COMPETITOR);
    prg.createUser("Luke", 25, 10, SystemRank.MEMBER, Membership.COMPETITOR);
    prg.createUser("Lars", 25, 43, SystemRank.ADMIN, Membership.WORKER);
    prg.createUser("Philine", 25, 33, SystemRank.MEMBER, Membership.COMPETITOR);
    prg.createUser("Maria", 25, 31, SystemRank.MEMBER, Membership.ELDER);
    prg.createUser("Johan", 25, 32, SystemRank.MEMBER, Membership.ELDER);
    prg.createUser("Katrine", 25, 35, SystemRank.MEMBER, Membership.ELDER);
    prg.createUser("Mischa", 25, 63, SystemRank.MEMBER, Membership.ELDER);

    //prg.printUserList();
  //prg.readFromFile();
    //prg.writeToFile();
    //competition.findingMembers();
    prg.printCompetitionList();
    }

}
