package org.example;


import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    DBImitation db = new DBImitation();
    String treeCode="";
    System.out.println("Tech or No-Tech team(1-Tech, 2-No-Tech)");
    Scanner sc = new Scanner(System.in);
    String i = sc.nextLine();
    treeCode=treeCode+i;
    while (!codeHandler(treeCode).equals("Finish")){
      System.out.println(codeHandler(treeCode));
      i = sc.nextLine();
      treeCode=treeCode+i;
    }

    //System.out.println(treeCode);
    System.out.println("Вам рекомендовано курс по " + DBImitation.db.get(treeCode));

  }

  private static String codeHandler(String code){

    switch (code) {
      case "1": return "Developer?(1-ТАК, 2-НІ)";
      case "11": return "Тематика розробки(1-DESKTOP, 2-MOBILE, 3-WEB, 4-ІГРИ)";
      case "111": return "Платформа?(1-WINDOWS, 2-IOS)";
      case "112": return "Платформа?(1-IOS,2-ANDROID)";
      case "113": return  "Напрям?(1-BACK-END,2-FRONT-END)";
      case "114": return  "Великі чи ні?(1-НІ, 2-ТАК)";
      case "12": return  "ML чи QA?(1-ML,2-QA)";
      case "122": return  "Automation чи Manual?(1-AUTOMATION,2-MANUAL)";
      case "2": return  "PM/Data Analyst/Marketing?(1-PM,2-DATA ANALYST,3-MARKETING)";
      case "23": return  "SEO чи Таргетолог?(1-SEO,2-ТАРГЕТОЛОГ)";
    }
    return "Finish";
  }
}