package dolphin;

import java.util.Scanner;

public class UI {

  Scanner scan = new Scanner(System.in);

  private String userInput = scan.nextLine();
  private double pansionist = (1600/25)*100;



  public void userinterface() {

    System.out.println("Welcome to the swimclub Dolphine");

    switch (userInput) {

      case "cashier":
        cashier();
        break;

      case "Admin", "Foreman":
        foreman();
        break;

      case "Coach":
        coach();
        break;

        case "User":
        System.out.println("test2");
        break;

      case "competition":


      default:
        //code
    }
  }

  public void cashier(){

    System.out.println("What do you want to do?: ");
    switch (userInput){
      case "Show payment options for members":
        //Placeholder
        break;
      case "processe payment":
        //Placholder
        break;
      case "Show debtors":
        //placeholder
        break;
      case "Show subscription payment pr. year":
        //placholder
      case "Swim results":
        //placeholder
        break;

    }
  }
  public void foreman(){
    System.out.println("What do you want to do?");

    switch (userInput){
      case "Administrate members":
        //placeholder
        break;
      case "Administrate swimming records":
        //placeholder
        break;
    }
  }
  public void coach(){
    System.out.println("What do you want to do?");
    switch (userInput){
      case "Administrate tournament teams":
        //placeholder
        break;
      case "Administrate members performance":
        //placeholder
        break;
    }
  }
}
