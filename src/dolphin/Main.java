package dolphin;

import dolphin.Data.OverView;
import dolphin.Data.User;

import java.text.NumberFormat;

public class Main {

  public static void main(String[] args) {

    OverView obj = new OverView();


    // getting correct currency
    NumberFormat currency = NumberFormat.getCurrencyInstance();
    System.out.println();

    //printing the results
    String leftAlignFormat = "| %-20s   |%-5d |%-25d   |%-10d     |%-10s    |%-10s  |%n";
    System.out.format("|-------------------------------- List Of Dolphin Club Member ------------------------------+%n");
    System.out.format("+-------------------+------+------------------+---------------+--------------+--------------+%n");
    System.out.format("| Name              |Age   |AgeCategory       |ActivityLevel  |ActivityForm  |Yearly Price  |%n");
    System.out.format("+-------------------+------+------------------+---------------+--------------+--------------+%n");

    for (User item: obj.Member_List) {
      leftAlignFormat = "| %-15s   |%-5d |%-15s   |%-10s     |%-10s    |%-10s  |%n";
      System.out.print("\033[36m"); // Open print red
      System.out.printf(leftAlignFormat, item.GetFullName(), item.GetAge(),item._agetype,item._actLevel,
          item._actForm, currency.format(item.Årspris));
      System.out.print("\033[0m"); // Close print red
      System.out.format("+-------------------+------+------------------+---------------+--------------+--------------+%n");
    }

    Double Budget = obj.GetYearlyBudget();
    System.out.println();
    System.out.println();
    String leftAlignFormat2 = "| %-20s   |%n";

    System.out.format("|-- $$$ BUDGET $$$ --+%n");
    System.out.format("+--------------------+%n");
    System.out.format("| Total              |%n");
    System.out.format("+--------------------+%n");
    leftAlignFormat2 = "| %-15s   |%n";
    System.out.print("\033[36m"); // Open print red
    System.out.printf(leftAlignFormat2,currency.format(Budget));
    System.out.print("\033[0m"); // Close print red
    System.out.format("+--------------------+%n");




  }
}
