package dolphin.Classer;

import java.util.*;

public class UserPerfomance {
  private List<Competition> sortedList;
  private Competition competitor;

  public UserPerfomance() {
    competitor = new Competition();
    sortedList = GetfiveBestCompetitor();
  }


  // algorithm to compare 2 elements in list, and sort them
  public List<Competition> GetfiveBestCompetitor() {
    List<Competition> sortedTop5 = competitor.getCompetitorList();
    List<Competition> tmp_list2 = competitor.getCompetitorList();

    for (int i = 1; i < sortedTop5.size(); i++) {
      for (int j = 1; j < sortedTop5.size(); j++)
        if (sortedTop5.get(i).getRandomTimeRecord().compareTo(tmp_list2.get(j).getRandomTimeRecord()) == 0) {
          tmp_list2 = sortedTop5;
        }
    }
    return sortedTop5;
  }


  public void top5Printer() {
    try {
      Collections.sort(sortedList, new TimeComparator());
      for (int i = 0; i < 5; i++) {
        for (int j = 0; j < 5; i++) {
          j++;
          sortedList.get(i).getRandomTimeRecord().compareTo(sortedList.get(j).getRandomTimeRecord());
          System.out.println(sortedList.get(i).GetUserDetail().toString2(true) + " Record Time: " + sortedList.get(i).getRandomTimeRecord());
        }
      }
    } catch (Exception e) {
      System.err.println("\n\n An ERROR has occurred. Follow StackTrace, eradicate bug.\n");
      e.printStackTrace();
    } finally {
      System.out.println();
    }
  }
}