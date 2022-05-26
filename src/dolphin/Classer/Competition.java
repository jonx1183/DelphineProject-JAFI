package dolphin.Classer;

import dolphin.Data.OverView;
import dolphin.Data.User;
import dolphin.enums.SubscriptionType;
import dolphin.enums.SwimmingStyle;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Competition {
  final Random random = new Random();
  private LocalTime getRandomTimeRecord;
  private List<Competition> competitorList;
  private OverView overViewOfMemberList;
  private User User;
  private SwimmingStyle SWIMMINGSTYLE;

  public Competition() {
    overViewOfMemberList = new OverView();
    competitorList = getListOfCompetitors();
  }

  public Competition(User user) {
    this.SWIMMINGSTYLE = randomizeStyle();
    this.User = user;
    this.getRandomTimeRecord = getRandomTime();
  }

  private List<Competition> getListOfCompetitors() {
    List<User> fullMemberList = overViewOfMemberList.getMemberList();
    List<Competition> competitorList = new ArrayList<>();

    for (User user : fullMemberList) {
      if (user.getSubscriptionType() == SubscriptionType.COMPETITOR) {
        Competition competitor = new Competition(user);
        competitorList.add(competitor);
      }
    }
    return competitorList;
  }

  private SwimmingStyle randomizeStyle() {
    SwimmingStyle[] swimmingStyles = SWIMMINGSTYLE.values();
    int length = swimmingStyles.length;
    int randomIndex = new Random().nextInt(length);
    return swimmingStyles[randomIndex];
  }

  public LocalTime getRandomTime() {
    LocalTime randomTime = LocalTime.of(
        random.nextInt(0, 1),
        random.nextInt(1, 3), random.nextInt(0, 59),
         random.nextInt(0, 999) * 1000000);
    return randomTime;
  }

  public List<Competition> getCompetitorList() {return competitorList;}
  public SwimmingStyle getSwimmningStyle() {return this.SWIMMINGSTYLE;}
  public User GetUserDetail() {return this.User;}
  public LocalTime getRandomTimeRecord() {return getRandomTimeRecord;}
}