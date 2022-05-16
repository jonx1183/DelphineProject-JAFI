package dolphin.Data;

import dolphin.Interface.IPerson;
import dolphin.enums.SubscriptionActivity;
import dolphin.enums.SubscriptionType;
import dolphin.enums.AgeCategory;

public class User implements IPerson {

  public AgeCategory _agetype;
  public SubscriptionType _subscriptionType;
  public SubscriptionActivity _activeOrInactive;
  public Double yearlyPrice;
  private String fullName;
  private Integer age;
  private Double timeInSeconds;

  public User(String name, Integer age) {
    fullName = name;
    this.age = age;
    setAgeCategory();
  }
  public User(String name, Integer age, Double timeInSeconds) {
    fullName = name;
    this.age = age;
    this.timeInSeconds = timeInSeconds;
    setAgeCategory();
  }

  @Override
  public String getFullName() {
    return this.fullName;
  }

  @Override
  public Integer getAge() {
    return this.age;
  }


  private void setAgeCategory() {
    if (this.age < 18) {
      this._agetype = AgeCategory.JUNIOR_MEMBER;
    } else if (this.age >= 18 && this.age < 60) {
      this._agetype = AgeCategory.ADULT_MEMBER;
    } else {
      this._agetype = AgeCategory.SENIOR_MEMBER;
    }
  }
//public void set_subscriptionType(SubscriptionType level){
  //  this._subscriptionType = level;
//}



  @Override
  public String toString() {
    return "Name :" + this.fullName + " | " + "Age: " + this.age + " | " + "Age Category :" + this._agetype + " | " + "Activity Level :" + this._subscriptionType
        + " | " + "Activity Form :" + this._activeOrInactive + " | " + "Year Price :" + this.yearlyPrice;
  }

  public String toString(boolean x) {
    return "Name :" + this.fullName + " | " + "Age: " + this.age + " | " + "Age Category :" + this._agetype + " | " + "Activity Level :" + this._subscriptionType
        + " | " + "Last Time :" + this.timeInSeconds;

  }
}


