package dolphin.Data;

import dolphin.enums.SubscriptionActivity;
import dolphin.enums.SubscriptionType;
import dolphin.enums.AgeCategory;

import java.util.List;
import java.util.Random;

// THIS IS THE FRONTDESK
// SEE THIS AS THE PORTAL FOR ADMIN/CASHIER/ ETC....
public class OverView {
  // actual list to be use as dashboard for memberlist
  public List<User> member_List;
  // this is form helping setting prices
  private Prices yearPrice = new Prices();
  private Members _data = new Members();
  private Integer timeInSeconds;


  public OverView() {
    member_List = _data.Lst_of_Members;
    setSubscriptionType();
    setSubscriptionActivity();
    setYearlyPrices();
    setTimeInSeconds(10);
  }

  // FUCK HOW TO FIX THIS >_<
  public void setTimeInSeconds(Integer timeInSeconds) {
    for (User item : member_List) {
      if (item.getSubscriptionType() == SubscriptionType.COMPETITOR)
        this.timeInSeconds = timeInSeconds;

    }
  }
  public Integer getTimeinSeconds(){
    return this.timeInSeconds;
  }


  // setting the activity level of each member from the dashboard
  private void setSubscriptionType() {
    // helper for indexing the list of member
    // so that we can set all even number as competitors
    // and uneven number as simple motionist
    Integer index = 0;


    for (User item : member_List) {
      //increment index
      index++;

      // tjek for even number
      if (index % 2 == 0) {

        item.set_subscriptionType(SubscriptionType.COMPETITOR);

      } else {
        item.set_subscriptionType(SubscriptionType.SWIMMER);
      }
    }
  }

  private void setSubscriptionActivity() {
    for (User item : member_List) {
      // making all competitors as active members
      if (item.getSubscriptionType() == SubscriptionType.COMPETITOR) {
        item.set_activeOrInactive(SubscriptionActivity.ACTIVE);
      }
      // making all motionist that are either junior og senior - Active
      else if (item.getSubscriptionType() == SubscriptionType.SWIMMER &&
          (item.get_agetype() != AgeCategory.SENIOR_MEMBER)) {
        item.set_activeOrInactive(SubscriptionActivity.ACTIVE);
      } else {
        item.set_activeOrInactive(SubscriptionActivity.PASSIVE);
      }
    }
  }

  // Price for member - Age category
  private void setYearlyPrices() {
    for (User item : member_List) {
      // case by age category
      /*
      switch (item._agetype){
        case Senior_member -> item.Årspris = yearPrice.GetSenior_Price();
        case Junior_member -> item.Årspris = yearPrice.getJunior_Price();
        case Pensionist_member ->  item.Årspris = yearPrice.GetPensionist_Price();
      }
       */

      if (item.get_agetype() == AgeCategory.JUNIOR_MEMBER) {
        item.setYearlyPrice(yearPrice.getJunior_Price());
      } else if (item.get_agetype() == AgeCategory.ADULT_MEMBER) {
        item.setYearlyPrice(yearPrice.getAdult_Price());
      } else if (item.get_agetype() == AgeCategory.SENIOR_MEMBER &&
          (item.get_activeOrInactive() == SubscriptionActivity.PASSIVE)) {
        item.setYearlyPrice(yearPrice.getPassivePrice());
      } else {
        item.setYearlyPrice(yearPrice.getSenior_Price());
      }
    }
  }

  public Double getYearlyBudget() {
    Double amount = 0.0;
    for (User item : member_List) {
      amount += item.getYearlyPrice();
    }
    return amount;
  }
}