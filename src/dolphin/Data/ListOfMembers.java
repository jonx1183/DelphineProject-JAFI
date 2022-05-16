package dolphin.Data;

import dolphin.Classer.UI;
import dolphin.Data.OverView;
import dolphin.Data.User;
import dolphin.enums.ActivityLevel;

import java.text.NumberFormat;

public class ListOfMembers {
  OverView obj = new OverView();
  // getting correct currency
  NumberFormat currency = NumberFormat.getCurrencyInstance();

  public void showMembers() {
    System.out.println();

    //printing the results
    String leftAlignFormat = "| %-20s   |%-5d |%-25d   |%-10d     |%-10s    |%-10s  |%n";
    System.out.format("|-------------------------------- List Of Dolphin Club Member ------------------------------+%n");
    System.out.format("+-------------------+------+------------------+---------------+--------------+--------------+%n");
    System.out.format("| Name              |Age   |AgeCategory       |ActivityLevel  |ActivityForm  |Yearly Price  |%n");
    System.out.format("+-------------------+------+------------------+---------------+--------------+--------------+%n");

    for (User item : obj.Member_List) {
      leftAlignFormat = "| %-15s   |%-5d |%-15s   |%-10s     |%-10s    |%-10s  |%n";
      System.out.print("\033[36m"); // Open print red
      System.out.printf(leftAlignFormat, item.getFullName(), item.getAge(), item._agetype, item._actLevel,
          item._actForm, currency.format(item.yearlyPrice));
      System.out.print("\033[0m"); // Close print red
      System.out.format("+-------------------+------+------------------+---------------+--------------+--------------+%n");
    }
  }
  //This isnt working yet, need help, how to call enum and separate them!
  public void showCompetitors(){
    for (User item: obj.Member_List){
      if (item._actLevel == ActivityLevel.valueOf("competitor"))
        System.out.println(item.getFullName());
    }
      }

    public void getBudget() {
      Double Budget = obj.GetYearlyBudget();
      System.out.println();
      System.out.println();
      String leftAlignFormat2 = "| %-20s   |%n";

      System.out.format("|-- $$$ BUDGET $$$ --+%n");
      System.out.format("+--------------------+%n");
      System.out.format("| Yearly Total       |%n");
      System.out.format("+--------------------+%n");
      leftAlignFormat2 = "| %-15s    |%n";
      System.out.print("\033[36m"); // Open print red
      System.out.printf(leftAlignFormat2, currency.format(Budget));
      System.out.print("\033[0m"); // Close print red
      System.out.format("+--------------------+%n");
    }
  }

