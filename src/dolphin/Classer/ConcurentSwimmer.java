
package dolphin.Classer;

import dolphin.Data.OverView;
import dolphin.Data.User;
import dolphin.enums.SubscriptionType;
import dolphin.enums.SwimmingStyle;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ConcurentSwimmer {

  // use to get the full list of memmber from overview
  private OverView list_Parser;
  public List<ConcurentSwimmer> competitor_list;
  // import a user and the style
  private User User;
  private SwimmingStyle SwimmingStyle;

  // overloading the constructor ,so that we can call this call without having to give parameters
  public ConcurentSwimmer(){
    list_Parser = new OverView();
    competitor_list = GetCompList();
  }
  public ConcurentSwimmer(User _user, SwimmingStyle _style){
    this.SwimmingStyle = _style;
    this.User = _user;

  }

  // getting list of comp.. from existing list from overview e.g "list_Parser"
  private List<ConcurentSwimmer> GetCompList(){
    List<User> full_memberList = list_Parser.member_List;

    // temparate list
    List<ConcurentSwimmer> temp_list = new ArrayList<>();


    for (User person: full_memberList) {
      if (person.getSubscriptionType() == SubscriptionType.COMPETITOR){
        ConcurentSwimmer temp_obj = new ConcurentSwimmer(person,RandomizeStyle());
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

}





