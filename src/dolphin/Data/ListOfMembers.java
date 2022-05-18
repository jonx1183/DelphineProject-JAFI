package dolphin.Data;

import dolphin.Classer.Competition;
import dolphin.enums.SubscriptionType;

import java.io.*;
import java.text.NumberFormat;
import java.util.Iterator;

public class ListOfMembers {
  OverView obj = new OverView();
  NumberFormat currency = NumberFormat.getCurrencyInstance();
  Iterator<User> it = obj.member_List.iterator();

  public void showMembers() {
    System.out.println();

    String leftAlignFormat = "| %-20s   |%-5d |%-25d   |%-10d     |%-10s    |%-10s  |%n";

    System.out.format("|-------------------------------- List Of Dolphin Club Member ------------------------------+%n");
    System.out.format("+-------------------+------+------------------+---------------+--------------+--------------+%n");
    System.out.format("| Name              |Age   |AgeCategory       |ActivityLevel  |ActivityForm  |Yearly Price  |%n");
    System.out.format("+-------------------+------+------------------+---------------+--------------+--------------+%n");

    for (User item : obj.member_List) {
      leftAlignFormat = "| %-15s   |%-5d |%-15s   |%-10s     |%-10s    |%-10s  |%n";
      System.out.print("\033[36m"); // Open print red
      System.out.printf(leftAlignFormat, item.getFullName(), item.getAge(), item.get_agetype(), item.getSubscriptionType(),
          item.get_activeOrInactive(), currency.format(item.getYearlyPrice()));
      System.out.print("\033[0m"); // Close print red
      System.out.format("+-------------------+------+------------------+---------------+--------------+--------------+%n");
    }
  }

  //This isnt working yet, need help, having trouble with the formatted string.
  public void showCompetitors(){
    String leftAlignFormat = "| %-20s|%-5d |%-20s|%-20s|%-20s  |%n";
    System.out.format("+---------------------------------------- List Of Competitor Delphin Club ----------------------------------+%n");
    System.out.format("+-------------------+------+------------------+-------------------+-----------------------+-----------------+%n");
    System.out.format("| Name              |Age   |AgeType           |ActivityLevel      |SwimmingStyle          | Record Time     |%n");
    System.out.format("+-------------------+------+------------------+-------------------+-----------------------+-----------------+%n");

    Competition obj2 = new Competition();
    for (Competition item: obj2.competitor_list){
      if (item.GetUserDetail().getSubscriptionType() == SubscriptionType.COMPETITOR)
        leftAlignFormat = "| %-18s|%-5d |%-18s|%-19s|%-23s|%-17s|%n";
      System.out.print("\033[31m"); // Open print red
      System.out.printf(leftAlignFormat, item.GetUserDetail().getFullName(),
          item.GetUserDetail().getAge(), item.GetUserDetail().get_agetype(), item.GetUserDetail().getSubscriptionType(),
          item.GetSwimmningStyle(), item.getTimeInSecs());
      System.out.print("\033[0m"); // Close print red
      System.out.format("+-------------------+------+------------------+-------------------+-----------------------+-----------------+%n");
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

  public void readFromFile() {
    File path = new File("memberList.txt");
    try {
      BufferedReader br = new BufferedReader(new FileReader(path));
      if (!path.exists()) {
        System.out.println("file doesnt exist!");
      }
      while (br.ready()) {
        System.out.println(br.readLine());
      }
      br.close();
    } catch (IOException IO) {
      IO.getStackTrace();
    }
  }

  public void writeToFile() {
    String leftAlignFormat = "| %-15s   |%-5d |%-15s   |%-10s     |%-10s    |%-10s  |%n";
    File path = new File("memberList.txt");
    try {
      BufferedWriter bw = new BufferedWriter(new FileWriter(path));
      if (!path.exists()) {
        path.createNewFile();
      }
      if (it.hasNext()) {
        for (User item : obj.member_List) {
          bw.write(item + "");
       //   System.out.format("+-------------------+------+------------------+---------------+--------------+--------------+%n");
        }
      }
      bw.flush();
      bw.close();
    } catch (IOException IO) {
      IO.getStackTrace();
    }
    finally {
      System.out.println("Chek if file has been written Correctly");
    }
  }
}

