package dolphin.Data;

import dolphin.Interface.IPerson;
import dolphin.enums.SubscriptionActivity;
import dolphin.enums.SubscriptionType;
import dolphin.enums.AgeCategory;

public class User implements IPerson {
  private AgeCategory ageCategory;
  private SubscriptionType subscriptionType;
  private SubscriptionActivity activeOrInactive;
  private Double yearlyPrice;
  private String fullName;
  private Integer age;
  private Integer timeInSeconds;

  public User(String name, Integer age) {
    fullName = name;
    this.age = age;
    setAgeCategory();
  }
  private void setAgeCategory() {
    if (this.age < 18) {
      this.ageCategory = AgeCategory.JUNIOR_MEMBER;
    } else if (this.age >= 18 && this.age < 60) {
      this.ageCategory = AgeCategory.ADULT_MEMBER;
    } else {
      this.ageCategory = AgeCategory.SENIOR_MEMBER;
    }
  }

  @Override
  public String getFullName() {return this.fullName;}
  public AgeCategory getAgeCategory() {return ageCategory;}
  public void setAgeCategory(AgeCategory ageCategory) {this.ageCategory = ageCategory;}
  public SubscriptionType getSubscriptionType(){return this.subscriptionType;}
  public void setSubscriptionType(SubscriptionType subscriptionType) {this.subscriptionType = subscriptionType;}
  public SubscriptionActivity getActiveOrInactive(){return activeOrInactive;}
  public void setActiveOrInactive(SubscriptionActivity activeOrInactive) {this.activeOrInactive = activeOrInactive;}
  public Double getYearlyPrice() {return yearlyPrice;}
  public void setYearlyPrice(Double yearlyPrice) {this.yearlyPrice = yearlyPrice;}
  @Override
  public Integer getAge() {return this.age;}

  @Override
  public String toString() {
    return "Name :" + this.fullName + " | " + "Age: " + this.age + " | " + "Age Category :" + this.ageCategory + " | " + "Activity Level :" + this.subscriptionType
        + " | " + "Activity Form :" + this.activeOrInactive + " | " + "Year Price :" + this.yearlyPrice + "\n";}

public String toString2(boolean x) {
    return "Name :" + this.fullName + " | " + "Age: " + this.age + " | " + "Age Category :" + this.ageCategory + " | " + "Activity Level :" + this.subscriptionType
        + " | " + "\n";
  }
}


