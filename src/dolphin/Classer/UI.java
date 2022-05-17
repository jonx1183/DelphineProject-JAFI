package dolphin.Classer;

import dolphin.Data.ListOfMembers;
import dolphin.Data.OverView;

import java.util.Scanner;

public class UI {
  boolean onGoing = true;
  //ConcurentSwimmer competition = new ConcurentSwimmer();
  OverView members = new OverView();
  Scanner scan = new Scanner(System.in);
  ListOfMembers memberList = new ListOfMembers();


  public void userinterface() {
    System.out.println("Welcome to the swimclub Dolphine");
    System.out.println("""
        (1) - User Login:
        (2) - Cashier Login:
        (3) - Coach Login:
        (4) - Competitor Login:
        (5) - Admin Login:
        (6) - exit:
        """);

    String userInput = scan.nextLine();
    switch (userInput) {
      case "User", "1" -> System.out.println("test2");
      case "cashier", "2" -> cashier();
      case "Coach", "3" -> coach();
      case "competition", "4" -> System.out.println("placeholder");
      case "Admin", "Foreman", "5" -> foreman();
      case "exit", "e", "6" -> {
        System.exit(0);
      }
      default -> System.out.println("something went wrong!");
    }
    //code
  }

  public void cashier() {
    System.out.println("What do you want to do?: ");
    System.out.println("""
        (1) - Get yearly budget:
        (2) - Payment Status:
        (3) - Show Debtors:
        (4) - Show Subscription payments per year:
        (5) - "Swim Results":
        (6) - exit:
        """);
    String userInput = scan.nextLine();
    while (onGoing) {
      switch (userInput) {
        case "Show payment options for members", "1" -> {
          System.out.println("");
          cashier();
        } // placeholder
        case "processe payment", "2" -> {
          System.out.println("PlaceHolder");
          cashier();
        } // placeholder
        case "Show debtors", "3" -> {
          System.out.println("PlaceHolder1");
          cashier();
        } // placeholder
        case "Show subscription payment pr. year", "4" -> {
          memberList.getBudget();
          cashier();
        }
        case "Swim results", "5" -> {
          System.out.println("PlaceHolder2");
          cashier();
        } // placeholder
        case "exit", "e", "6" -> userinterface();
        default -> {
          System.err.println("something went wrong!");
          onGoing = false;

        }
      }
    }
  }

  public void foreman() {
    System.out.println("What do you want to do?");
    System.out.println("""
        (1) - Adminstrate Members: 
        (2) - Adminstrate Swimming records
        (3) - Show info about all members:
        (4) - Show me the money:
        (5) - Write Members to File:
        (6) - Read Members from file:
        (7) - exit:
        """);
    String userInput = scan.nextLine();
    while (onGoing) {
      switch (userInput) {
        case "Administrate members", "1" -> {
          System.out.println("");
          foreman();
        } // placeholder
        case "Administrate swimming records", "2" -> {
          System.out.println("PlaceHolder");
          foreman();
        }
        case "records", "3" -> {
          memberList.showMembers();
          foreman();
        }
        case "show me the money", "4" -> {
          memberList.getBudget();
          foreman();
        }
        case "Write to File", "5" -> {
          memberList.writeToFile();
          foreman();
        }
        case "Read from File", "6" -> {
          memberList.readFromFile();
          foreman();
        }
        case "exit", "e", "7" -> userinterface();
        default -> {
          System.err.println("something went wrong!");
          onGoing = false;
        }
      }
    }
  }

  public void coach() {

    System.out.println("What do you want to do?");
    System.out.println("""
        (1) - Administrate tournament teams:
        (2) - Adminstrate Members Performace:
        (3) - exit:
        """);
    String userInput = scan.nextLine();
    while (onGoing) {
      switch (userInput) {
        case "Administrate tournament teams", "1" -> {
          System.out.println("");//placeholder
          coach();
        }
        case "Administrate members performance", "2" -> {
      memberList.showCompetitors();
          coach();
        }
        case "exit", "e", "3" -> userinterface();
        default -> {
          System.err.println("something went wrong!");
          onGoing = false;

        }
      }
    }
  }
}