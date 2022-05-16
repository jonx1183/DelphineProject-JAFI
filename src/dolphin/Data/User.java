package dolphin.Data;

import dolphin.Interface.IPerson;
import dolphin.enums.ActivityForm;
import dolphin.enums.ActivityLevel;
import dolphin.enums.AgeType;

public class User implements IPerson {

  private  String fullName;
  private  Integer age;
  public AgeType _agetype;
  public ActivityLevel _actLevel;
  public ActivityForm _actForm;
  public Double yearlyPrice;

  public User(String name, Integer age){
    fullName = name;
    this.age = age;
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



  private void setAgeCategory(){
    if (this.age < 18){
      this._agetype = AgeType.Junior_member;
    }
    else if (this.age >= 18 && this.age < 60){
      this._agetype = AgeType.Senior_member;
    }
    else {
      this._agetype = AgeType.Pensionist_member;
    }
  }

  @Override
  public String toString() {
    return "Name :" + this.fullName + " | " + "Age: "+ this.age + " | " + "Age Category :"+ this._agetype + " | " +"Activity Level :"+ this._actLevel
        + " | " +"Activity Form :" +this._actForm + " | " +"Year Price :" +this.yearlyPrice;
  }

}
