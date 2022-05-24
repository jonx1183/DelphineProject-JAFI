package dolphin.Data;

import dolphin.Interface.IPerson;
import dolphin.enums.SubscriptionActivity;
import dolphin.enums.SubscriptionType;
import dolphin.enums.AgeCategory;

public class User implements IPerson {

  private AgeCategory ageCategory;
  private SubscriptionType _subscriptionType;
  private SubscriptionActivity _activeOrInactive;
  private Double yearlyPrice;
  private String fullName;
  private Integer age;
  private Integer timeInSeconds;

  public User(String name, Integer age) {
    fullName = name;
    this.age = age;
    setAgeCategory();
  }

  @Override
  public String getFullName() {
    return this.fullName;
  }

  public AgeCategory getAgeCategory() {
    return ageCategory;
  }

  public void setAgeCategory(AgeCategory ageCategory) {
    this.ageCategory = ageCategory;
  }

  public SubscriptionType getSubscriptionType(){
    return this._subscriptionType;
  }

  public void set_subscriptionType(SubscriptionType _subscriptionType) {
    this._subscriptionType = _subscriptionType;
  }

  public SubscriptionActivity get_activeOrInactive() {
    return _activeOrInactive;
  }

  public void set_activeOrInactive(SubscriptionActivity _activeOrInactive) {
    this._activeOrInactive = _activeOrInactive;
  }

  public Double getYearlyPrice() {
    return yearlyPrice;
  }

  public void setYearlyPrice(Double yearlyPrice) {
    this.yearlyPrice = yearlyPrice;
  }

  @Override
  public Integer getAge() {
    return this.age;
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
//public void set_subscriptionType(SubscriptionType level){
  //  this._subscriptionType = level;
//}



  @Override
  public String toString() {
    String fullinfo = "Name :" + this.fullName + " | " + "Age: " + this.age + " | " + "Age Category :" + this.ageCategory + " | " + "Activity Level :" + this._subscriptionType
        + " | " + "Activity Form :" + this._activeOrInactive + " | " + "Year Price :" + this.yearlyPrice + "\n";

    return fullinfo;
  }

public String toString2(boolean x) {
    return "Name :" + this.fullName + " | " + "Age: " + this.age + " | " + "Age Category :" + this.ageCategory + " | " + "Activity Level :" + this._subscriptionType
        + " | " + "\n";

  }
}


