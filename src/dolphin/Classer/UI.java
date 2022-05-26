package dolphin.Classer;

import dolphin.Data.ListOfMembers;

import java.util.Scanner;

public class UI {
  boolean onGoing = true;
  Scanner in = new Scanner(System.in);
  ListOfMembers memberList = new ListOfMembers();
  UserPerfomance competitorRecords = new UserPerfomance();

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
    String userInput = in.nextLine();
    switch (userInput) {
      case "User", "1" -> System.out.println("test2");
      case "cashier", "2" -> cashier();
      case "Coach", "3" -> coach();
      case "Competitor", "4" -> memberList.showCompetitorsList();
      case "Admin", "Foreman", "5" -> president();
      case "exit", "e", "6" -> {System.exit(0);}

      default -> System.out.println("something went wrong!");
    }
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

    String userInput = in.nextLine();
    while (onGoing) {
      switch (userInput) {
        case "Show payment options for members", "1" -> {
          System.out.println("< 18 year = pay 1200, ");
          cashier();
        } // placeholder
        case "Process payment", "2" -> {
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

  public void president() {
    System.out.println("What do you want to do?");
    System.out.println("""
        (1) - Adminstrate Members:
        (2) - Adminstrate Swimming records
        (3) - Show info about all members:
        (4) - Show me the Money:
        (5) - Write Members to File:
        (6) - Read Members from File:
        (7) - exit:
        """);
    String userInput = in.nextLine();
    while (onGoing) {
      switch (userInput) {
        case "Administrate members", "1" -> {
          System.out.println("");
          president();
        } // placeholder
        case "Administrate swimming records", "2" -> {
          System.out.println("PlaceHolder");
          president();
        }
        case "records", "3" -> {
          memberList.showMembers();
          president();
        }
        case "show me the money", "4" -> {
          memberList.getBudget();
          president();
        }
        case "Write to File", "5" -> {
          memberList.writeToFile();
          president();
        }
        case "Read from File", "6" -> {
          memberList.readFromFile();
          president();
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
    System.out.println("""
        (1) - Administrate tournament teams:
        (2) - Adminstrate Member Performace:
        (3) - Top 5 Competitors:
        (4) - Exit: 
        """);
    String userInput = in.nextLine();
    while (onGoing) {
      switch (userInput) {
        case "Administrate tournament teams", "1" -> {
          System.out.println("");//placeholder
          coach();}
        case "Administrate members performance", "2" -> {
        memberList.showCompetitorsList();
          coach();}
        case "top 5", "3" -> {
          competitorRecords.top5Printer();
        coach();
        }
        case "exit", "e", "4" -> userinterface();
        default -> {
          System.err.println("something went wrong!");
          onGoing = false;

        }
      }
    }
  }
}