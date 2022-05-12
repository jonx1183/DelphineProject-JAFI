package dolphin.Data;

import dolphin.Interface.IPerson;
import dolphin.enums.ActivityForm;
import dolphin.enums.ActivityLevel;
import dolphin.enums.AgeType;

public class User implements IPerson {

  private  String FullName ;
  private  Integer Age;
  public AgeType _agetype;
  public ActivityLevel _actLevel;
  public ActivityForm _actForm;
  public Double Årspris;

  public User(String name, Integer age){
    FullName = name;
    Age = age;
    SetAgeCategory();
  }
  @Override
  public String GetFullName() {
    return this.FullName;
  }

  @Override
  public Integer GetAge() {
    return this.Age;
  }



  private void SetAgeCategory(){
    if (this.Age < 18){
      this._agetype = AgeType.Junior_member;
    }
    else if (this.Age >= 18 && this.Age < 60){
      this._agetype = AgeType.Senior_member;
    }
    else {
      this._agetype = AgeType.Pensionist_member;
    }
  }

  @Override
  public String toString() {
    return "Name :" + this.FullName + " | " + "Age: "+ this.Age + " | " + "Age Category :"+ this._agetype + " | " +"Activity Level :"+ this._actLevel
        + " | " +"Activity Form :" +this._actForm + " | " +"Year Price :" +this.Årspris;
  }

}
