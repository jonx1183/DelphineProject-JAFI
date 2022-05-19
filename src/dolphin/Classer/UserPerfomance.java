package dolphin.Classer;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UserPerfomance {
  private Competition _comp;

  public List<Competition> sortedList;

  public UserPerfomance(){
    _comp = new Competition();
    sortedList = GetfiveBestCompetitor();
  }


  // algorithm to compare 2 elements in list, and sort them
  public List<Competition> GetfiveBestCompetitor(){
    List<Competition> tmp_list = _comp.competitor_list;
    Competition current = new Competition();
    Competition next = new Competition();
    Competition tmp_val = new Competition();
    // an algorithm to sort the list by record time
    //Integer n = tmp_list.size();

    for (int i = 1; i <= tmp_list.size()-1; i++) {
      tmp_val = tmp_list.get(i);
      Integer j = i - 1;
      // while element at index i is greater than element at index j
      while (j > 0 && tmp_val.timeInSecs.compareTo(tmp_list.get(j).timeInSecs) == 0) {

        current = tmp_list.get(j);
        next = tmp_list.get(j + 1);
        next = current;

        j = j-1;


       // tmp_list.get(j + 1) = tmp_val;
        next = tmp_val;


      }
    }
    return tmp_list;
  }

  public void Top5_Printer(){
    Integer counter = 0;
    for (Competition person: sortedList
         ) {
      System.out.println(""+person.GetUserDetail().getFullName()+":"+person.GetRandomTime().toString());
      counter ++;
      /*
      if (counter == 5 ){
        break;
      }

       */
    }

  }
/*
  @Override
  public int compareTo(LocalTime other) {
    int cmp = Integer.compare(hour, other.hour);
    if (cmp == 0) {
      cmp = Integer.compare(minute, other.minute);
      if (cmp == 0) {
        cmp = Integer.compare(second, other.second);
        if (cmp == 0) {
          cmp = Integer.compare(nano, other.nano);
        }
      }
    }
    return cmp;
  }
*/

}

