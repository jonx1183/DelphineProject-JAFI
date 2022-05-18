
package dolphin.Classer;

import dolphin.Data.OverView;
import dolphin.Data.User;
import dolphin.enums.SubscriptionType;
import dolphin.enums.SwimmingStyle;

import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Random;

public class Competition {
  private String timeInSecs;

  // use to get the full list of memmber from overview
  private OverView list_Parser;
  public List<Competition> competitor_list;
  // import a user and the style
  private User User;
  private SwimmingStyle SwimmingStyle;

  // overloading the constructor ,so that we can call this call without having to give parameters
  public Competition() {
    list_Parser = new OverView();
    competitor_list = GetCompList();
  }

  public Competition(User _user, SwimmingStyle _style, String timeInSecs) {
    this.SwimmingStyle = _style;
    this.User = _user;
    this.timeInSecs = timeInSecs;

  }


  // getting list of comp.. from existing list from overview e.g "list_Parser"
  private List<Competition> GetCompList() {
    List<User> full_memberList = list_Parser.member_List;

    // temparate list
    List<Competition> temp_list = new ArrayList<>();


    for (User person : full_memberList) {
      if (person.getSubscriptionType() == SubscriptionType.COMPETITOR) {
        Competition temp_obj = new Competition(person, RandomizeStyle(), randomizeTimes2());
        temp_list.add(temp_obj);
      }
    }
    return temp_list;
  }

  private SwimmingStyle RandomizeStyle(){
    SwimmingStyle[] Values = SwimmingStyle.values();
    // length of array of swimstyles
    int len = Values.length;
    // indexing the random method according to the length of our array
    int randIndex = new Random().nextInt(len);
    return Values[randIndex];
  }

  public SwimmingStyle GetSwimmningStyle(){
    return this.SwimmingStyle;
  }
  public User GetUserDetail(){
    return this.User;
  }
  private String randomizeTimes2() {
    // SimpleDateFormat sdf = new SimpleDateFormat("mm:ss.SSS");
    final Random random = new Random();
    Integer minute = random.nextInt(0, 3);
    Integer second = random.nextInt(0, 60);
    Integer milliseconds = random.nextInt(0, 999);
    String timeValue = "Time: " + minute.intValue() + ":" + second.intValue() + ":" + milliseconds.intValue();
    return timeValue;
  }

  public String getTimeInSecs() {
    return timeInSecs;
  }

  public void setTimeInSecs(String timeInSecs) {
    this.timeInSecs = timeInSecs;
  }

}





