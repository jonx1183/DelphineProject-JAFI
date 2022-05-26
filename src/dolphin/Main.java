package dolphin;
import dolphin.Classer.*;
import dolphin.Data.*;
import java.text.NumberFormat;

//Main must be clean, need controller class so we can call the controller which instantiates the program,
// whilst Main only runs controller class.
public class Main {

  public static void main(String[] args) {
    UI ui = new UI();
    ui.userinterface();

//    membersList.showMembers();
  }

    /*
    OverView obj = new OverView();

    ui.userinterface();

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
      System.out.printf(leftAlignFormat, item.getFullName(), item.getAge(),item._agetype,item._actLevel,
          item._actForm, currency.format(item.yearlyPrice));
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
*/
  }

