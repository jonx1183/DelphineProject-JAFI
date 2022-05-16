package dolphin.Data;

import dolphin.enums.ActivityForm;
import dolphin.enums.ActivityLevel;
import dolphin.enums.AgeType;

import java.util.List;
// THIS IS THE FRONTDESK
// SEE THIS AS THE PORTAL FOR ADMIN/CASHIER/ ETC....
public class OverView {
 // this is form helping setting prices
  private Prices yearPrice = new Prices();

  private Members _data = new Members();

  // actual list to be use as dashboard for memberlist
  public List<User> Member_List;

  // contructor
  public OverView(){
    Member_List = _data.Lst_of_Members;
    SetActivityLevel();
    SetActivityFrom();
    SetYearlyPrices();
  }

  // setting the activity level of each member from the dashboard
  private void SetActivityLevel(){
    // helper for indexing the list of member
    // so that we can set all even number as competitors
    // and uneven number as simple motionist
    Integer index = 0;

    // looping through the data/list
    for (User item: Member_List) {
      //increment index
      index++;

      // tjek for even number
      if (index %2 == 0){
        // set each that satisfies the condition as competitor
        item._actLevel = ActivityLevel.Competitor;

      }
      else {
        // set as motionist
        item._actLevel = ActivityLevel.motionist;
      }
    }
  }

  private void SetActivityFrom(){
    for (User item: Member_List) {
      // making all competitors as active members
      if (item._actLevel == ActivityLevel.Competitor){
        item._actForm = ActivityForm.active;
      }
      // making all motionist that are either junior og senior - Active
      else if (item._actLevel == ActivityLevel.motionist &&
            (item._agetype != AgeType.Pensionist_member)){
        item._actForm = ActivityForm.active;
      }else {
        item._actForm = ActivityForm.passive;
      }
    }
  }

  // getting prices per member by Age category
  private void SetYearlyPrices(){
    for (User item: Member_List) {
      // case by age category
      /*
      switch (item._agetype){
        case Senior_member -> item.Årspris = yearPrice.GetSenior_Price();
        case Junior_member -> item.Årspris = yearPrice.getJunior_Price();
        case Pensionist_member ->  item.Årspris = yearPrice.GetPensionist_Price();
      }
       */

      if (item._agetype == AgeType.Junior_member){
        item.yearlyPrice = yearPrice.getJunior_Price();
      }
      else if (item._agetype == AgeType.Senior_member){
        item.yearlyPrice = yearPrice.GetSenior_Price();
      }
      else if (item._agetype == AgeType.Pensionist_member &&
          (item._actForm == ActivityForm.passive)){
        item.yearlyPrice = yearPrice.GetPassivePris();
      }
      else {
        item.yearlyPrice = yearPrice.GetPensionist_Price();
      }
    }
  }

  // summing total budget
  public Double GetYearlyBudget(){
    Double amount = 0.0;
    for (User item: Member_List
         ) {
      // adding yearly price per member
      amount += item.yearlyPrice;
    }
    return amount;
  }

}
