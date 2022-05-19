
package dolphin.Classer;


import dolphin.Data.OverView;
import dolphin.Data.User;
import dolphin.enums.SubscriptionType;
import dolphin.enums.SwimmingStyle;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Random;

public class Competition {
  public LocalTime timeInSecs;

  // use to get the full list of memmber from overview
  private OverView list_Parser;
  public List<Competition> competitor_list;
  // import a user and the style
  private User User;
  private SwimmingStyle SwimmingStyle;
  final Random random = new Random();

  // overloading the constructor ,so that we can call this call without having to give parameters
  public Competition() {
    list_Parser = new OverView();
    competitor_list = GetCompList();

  }

  public Competition(User _user) {
    this.SwimmingStyle = RandomizeStyle() ;
    this.User = _user;
    this.timeInSecs = GetRandomTime();

  }


  // getting list of comp.. from existing list from overview e.g "list_Parser"
  private List<Competition> GetCompList() {
    List<User> full_memberList = list_Parser.member_List;

    // temparate list
    List<Competition> temp_list = new ArrayList<>();


    for (User person : full_memberList) {
      if (person.getSubscriptionType() == SubscriptionType.COMPETITOR) {
        Competition temp_obj = new Competition(person);
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

  /*
  private String  randomizeTimes2() {
    // SimpleDateFormat sdf = new SimpleDateFormat("mm:ss.SSS");
    Integer minute = random.nextInt(0, 3);
    Integer second = random.nextInt(0, 60);
    Integer milliseconds = random.nextInt(0, 999);
    // timeValue = "Time: " + minute.intValue() + ":" + second.intValue() + ":" + milliseconds.intValue();
    return timeValue;
  }

  public LocalTime getTimeInSecs() {
    return this.timeInSecs;
  }
   public void setTimeInSecs(String timeInSecs) {
    this.timeInSecs = timeInSecs;
  }
  */


  // using the local time instead of previews method
  public LocalTime GetRandomTime(){
    LocalTime tmp_time = LocalTime.of(random.nextInt(0,1), random.nextInt(1,3), random.nextInt(0,59),
        (int) random.nextDouble(0,999));
    return tmp_time;
  }


}





