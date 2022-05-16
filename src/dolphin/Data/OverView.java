package dolphin.Data;

import dolphin.enums.SubscriptionActivity;
import dolphin.enums.SubscriptionType;
import dolphin.enums.AgeCategory;

import java.util.List;

// THIS IS THE FRONTDESK
// SEE THIS AS THE PORTAL FOR ADMIN/CASHIER/ ETC....
public class OverView {
  // actual list to be use as dashboard for memberlist
  public List<User> member_List;
  // this is form helping setting prices
  private Prices yearPrice = new Prices();
  private Members _data = new Members();


  // contructor
  public OverView() {
    member_List = _data.Lst_of_Members;
    setSubscriptionType();
    setSubscriptionActivity();
    setYearlyPrices();
    setTimeInSeconds();
  }
  // FUCK HOW TO FIX THIS >_<
  public void setTimeInSeconds() {
    for (User item : member_List) {
      if (item._subscriptionType == SubscriptionType.COMPETITOR) {

      }
    }
  }

  // setting the activity level of each member from the dashboard
  private void setSubscriptionType() {
    // helper for indexing the list of member
    // so that we can set all even number as competitors
    // and uneven number as simple motionist
    Integer index = 0;

    // looping through the data/list
    for (User item : member_List) {
      //increment index
      index++;

      // tjek for even number
      if (index % 2 == 0) {
        // set each that satisfies the condition as competitor
        item._subscriptionType = SubscriptionType.COMPETITOR;

      } else {
        // set as motionist
        item._subscriptionType = SubscriptionType.SWIMMER;
      }
    }
  }

  private void setSubscriptionActivity() {
    for (User item : member_List) {
      // making all competitors as active members
      if (item._subscriptionType == SubscriptionType.COMPETITOR) {
        item._activeOrInactive = SubscriptionActivity.ACTIVE;
      }
      // making all motionist that are either junior og senior - Active
      else if (item._subscriptionType == SubscriptionType.SWIMMER &&
          (item._agetype != AgeCategory.SENIOR_MEMBER)) {
        item._activeOrInactive = SubscriptionActivity.ACTIVE;
      } else {
        item._activeOrInactive = SubscriptionActivity.PASSIVE;
      }
    }
  }

  // getting prices per member by Age category
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

      if (item._agetype == AgeCategory.JUNIOR_MEMBER) {
        item.yearlyPrice = yearPrice.getJunior_Price();
      } else if (item._agetype == AgeCategory.ADULT_MEMBER) {
        item.yearlyPrice = yearPrice.getAdult_Price();
      } else if (item._agetype == AgeCategory.SENIOR_MEMBER &&
          (item._activeOrInactive == SubscriptionActivity.PASSIVE)) {
        item.yearlyPrice = yearPrice.getPassivePrice();
      } else {
        item.yearlyPrice = yearPrice.getSenior_Price();
      }
    }
  }

  // summing total budget
  public Double getYearlyBudget() {
    Double amount = 0.0;
    for (User item : member_List) {
      // adding yearly price per member
      amount += item.yearlyPrice;
    }
    return amount;
  }

}
