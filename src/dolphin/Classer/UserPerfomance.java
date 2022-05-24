package dolphin.Classer;

import java.util.*;

public class UserPerfomance {
  public List<Competition> sortedList;
  private Competition _comp;

  public UserPerfomance() {
    _comp = new Competition();
    sortedList = GetfiveBestCompetitor();
  }


  // algorithm to compare 2 elements in list, and sort them
  public List<Competition> GetfiveBestCompetitor() {
    List<Competition> tmp_list = _comp.competitor_list;
    List<Competition> tmp_list2 = _comp.competitor_list;
    Competition current = new Competition();
    Competition next = new Competition();
    Competition tmp_val = new Competition();
    int x;
    // an algorithm to sort the list by record time
    //Integer n = tmp_list.size();
    for (int i = 1; i < tmp_list.size(); i++) {
      for (int j = 1; j < tmp_list.size() ; j++)
     if (tmp_list.get(i).getRandomTimeRecord.compareTo(tmp_list2.get(j).getRandomTimeRecord) == 0){
       tmp_list2 = tmp_list;
     }

      /*for (int i = 1; i <= tmp_list.size() - 1; i++) {
      tmp_val = tmp_list.get(i);
      int j = i - 1;
      while (tmp_val.getRandomTimeRecord.compareTo(tmp_list.get(j).getRandomTimeRecord) < 0) {
        current = tmp_list.get(j);
        next = tmp_list.get(j++);
        next = current;
        tmp_list.get(j + 1).getRandomTimeRecord = tmp_val.getRandomTimeRecord;
        next = tmp_val;
      }*/
    }
    return tmp_list;
  }
  public void Top5_Printer() {
    try {
      Integer counter = 0;
      Collections.sort(sortedList, new TimeComparator());
      //for (Competition person : sortedList) {
      //System.out.println("" + person.GetUserDetail().getFullName() + ":" + person.GetRandomTime().toString());
      // counter++;
      //System.out.println(sortedList.get(2).getRandomTimeRecord);
      for (int i = 0; i < 5; i++) {
        for (int j = 0; j < 5; i++) {
          //Iterator itr2 = sortedList.listIterator();
        //  itr2.next();
          j++;
          sortedList.get(i).getRandomTimeRecord.compareTo(sortedList.get(j).getRandomTimeRecord);
          System.out.println(sortedList.get(i).GetUserDetail().toString2(true) + " Record Time: " + sortedList.get(i).getRandomTimeRecord);
        }
      }
    } catch (Exception e) {
      System.err.println("\n\n An ERROR has occurred. Follow StackTrace, eradicate bug.\n");
      e.printStackTrace();

    }
/*
/*  @Override
  public List<Competition> compareTo(LocalTime other) {
    List<Competition> tmp_list = _comp.competitor_list;
    Competition current = new Competition();
    Competition next = new Competition();
    Competition tmp_val = new Competition();
    Competition tmp_val2 = new Competition();

    for (int i = 1; i <= tmp_list.size() - 1; i++) {
      for (int j = 0; j < tmp_list.size(); i++) {
        tmp_val = tmp_list.get(i);
        tmp_val2 = tmp_list.get(j);
        // while element at index i is greater than element at index j
        while (j > 0 && tmp_val.timeInSecs.compareTo(tmp_val2.timeInSecs) == 0) {
          Integer cmp = Integer.compare(tmp_list.get(i).hashCode(), tmp_list.get(j).hashCode());
          if (cmp == 0) {
            cmp = Integer.compare(tmp_val.timeInSecs, tmp_val2.timeInSecs);
            if (cmp == 0) {
              cmp = Integer.compare(second, other.second);
              if (cmp == 0) {
                cmp = Integer.compare(nano, other.nano);
              }
            }
          }

        }


      }

    }
    return cmp;
  }*/
  }}