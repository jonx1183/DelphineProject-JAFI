package dolphin.Data;

import dolphin.enums.SubscriptionType;

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

    for (User item : obj.member_List) {
      leftAlignFormat = "| %-15s   |%-5d |%-15s   |%-10s     |%-10s    |%-10s  |%n";
      System.out.print("\033[36m"); // Open print red
      System.out.printf(leftAlignFormat, item.getFullName(), item.getAge(), item._agetype, item._subscriptionType,
          item._activeOrInactive, currency.format(item.yearlyPrice));
      System.out.print("\033[0m"); // Close print red
      System.out.format("+-------------------+------+------------------+---------------+--------------+--------------+%n");
    }
  }
  //This isnt working yet, need help, having trouble with the formatted string.
  public void showCompetitors(){
    String leftAlignFormat = "| %-20s   |%-5d |%-25d   |%-10d     |%-10s    |%-10s  |%n";
    System.out.format("|-------------------------------- List Of Dolphin Club Member ------------------------------+%n");
    System.out.format("+-------------------+------+------------------+---------------+--------------+--------------+%n");
    System.out.format("| Name              |Age   |AgeCategory       |ActivityLevel  |ActivityForm  |Yearly Price  |%n");
    System.out.format("+-------------------+------+------------------+---------------+--------------+--------------+%n");

    for (User item: obj.member_List){
      if (item._subscriptionType == SubscriptionType.COMPETITOR)
        leftAlignFormat = "| %-15s   |%-5d |%-15s   |%-10s     |%-10s    |%-10s  |%n";
      System.out.print("\033[36m"); // Open print redz
      System.out.printf(leftAlignFormat, item.getFullName(), item.getAge(), item._subscriptionType,
          item._activeOrInactive, currency.format(item.yearlyPrice));
      System.out.print("\033[0m"); // Close print red
      System.out.format("+-------------------+------+------------------+---------------+--------------+--------------+%n");
    }
      }

    public void getBudget() {
      Double Budget = obj.getYearlyBudget();
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

