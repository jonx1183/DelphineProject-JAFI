package dolphin.Data;

import dolphin.enums.SubscriptionActivity;
import dolphin.enums.SubscriptionType;
import dolphin.enums.AgeCategory;

import java.util.List;

public class OverView {
  private List<User> memberList;
  private Prices yearPrice = new Prices();
  private Members data = new Members();
  private Integer timeInSeconds;

  public OverView() {
    memberList = data.listOfMembers;
    setSubscriptionType();
    setSubscriptionActivity();
    setYearlyPrices();
  }

  private void setSubscriptionType() {
    // Even numbers for competitors, odd for normal Members
    Integer index = 0;
    for (User user : memberList) {
      index++;
      if (index % 2 == 0) {user.setSubscriptionType(SubscriptionType.COMPETITOR);
      }
      else {user.setSubscriptionType(SubscriptionType.SWIMMER);
      }
    }
  }

  private void setSubscriptionActivity() {
    for (User item : memberList) {
      //All Competitors are active Members
      if (item.getSubscriptionType() == SubscriptionType.COMPETITOR) {
        item.setActiveOrInactive(SubscriptionActivity.ACTIVE);
      }
      // Set all swimmers that are either junior or senior to ActiveSubscription
      else if
      (item.getSubscriptionType() == SubscriptionType.SWIMMER &&
          (item.getAgeCategory() != AgeCategory.SENIOR_MEMBER)) {
        item.setActiveOrInactive(SubscriptionActivity.ACTIVE);
      } else {
        item.setActiveOrInactive(SubscriptionActivity.PASSIVE);
      }
    }
  }

  // Price for member by Age category
  private void setYearlyPrices() {
    for (User user : memberList) {

      if (user.getAgeCategory() == AgeCategory.JUNIOR_MEMBER) {
        user.setYearlyPrice(yearPrice.getJuniorPrice());
      } else if (user.getAgeCategory() == AgeCategory.ADULT_MEMBER) {
        user.setYearlyPrice(yearPrice.getAdultPrice());
      } else if (user.getAgeCategory() == AgeCategory.SENIOR_MEMBER &&
          (user.getActiveOrInactive() == SubscriptionActivity.PASSIVE)) {
        user.setYearlyPrice(yearPrice.getPassivePrice());
      } else {
        user.setYearlyPrice(yearPrice.getSeniorPrice());
      }
    }
  }

  public Double getYearlyBudget() {
    Double amount = 0.0;
    for (User item : memberList) {
      amount += item.getYearlyPrice();}
    return amount;
  }

  public List<User> getMemberList() {return memberList;}
  public Integer getTimeinSeconds(){return this.timeInSeconds;}
}